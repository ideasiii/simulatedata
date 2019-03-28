package org.iii.simulatedata.utils;

import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.sql.*;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;

public class BuildInFuncs {
	private static Random random = new Random();

	public static long timestamp() {
		return System.currentTimeMillis();
	}

	public static int intRand() {
		return Math.abs(random.nextInt());
	}

	public static long longRand() {
		return Math.abs(random.nextLong());
	}

	public static String uuid() {
		return UUID.randomUUID().toString();
	}

	public static String numRand(Integer n) {
		StringBuilder strb = new StringBuilder(n);
		for (int i = 0; i < n; i++)
			strb.append((char) ('0' + random.nextInt(10)));
		return strb.toString();
	}

	public static String strRand(Integer n) {
		StringBuilder strb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int type = random.nextInt(3);
			switch (type) {
			case 0:
				strb.append((char) ('0' + random.nextInt(10)));
				break;
			case 1:
				strb.append((char) ('a' + random.nextInt(26)));
				break;
			case 2:
				strb.append((char) ('A' + random.nextInt(26)));
				break;
			}
		}
		return strb.toString();
	}

	public static int intRand(Integer n) {
		return random.nextInt(n);
	}

	public static int intRand(Integer s, Integer e) {
		int interval = e - s;
		return s + random.nextInt(interval);
	}

	public static double doubleRand() {
		return random.nextDouble();
	}

	public static double doubleRand(Integer s, Integer e, Integer n) {
		double randDouble = random.nextDouble();
		int interval = e - s;
		double r = s + (randDouble * interval);
		return Double.parseDouble(String.format("%." + n + "f", r));
	}

	public static String strSurname() {
		return Data.surname[random.nextInt(Data.surname.length - 1)];
	}

	public static String strFirstName() {
		return (Data.word[random.nextInt(Data.word.length - 1)] + Data.word[random.nextInt(Data.word.length - 1)]);
	}

	public static String strName() {
		return (strSurname() + strFirstName());
	}

	public static String strEmail() {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
		int nLen = random.nextInt(10);
		while (5 > nLen)
			nLen = nLen * 2;

		int nSize = 0;
		StringBuilder salt = new StringBuilder();
		while (nSize < nLen) {
			salt.append(allowedChars.charAt(random.nextInt(allowedChars.length() - 1)));
			++nSize;
		}

		String saltStr = salt.toString();
		return (saltStr + "@" + Data.email[random.nextInt(Data.email.length - 1)]);
	}

	public static String strCompany() {
		return (Data.company[random.nextInt(Data.company.length - 1)]);
	}

	public static String strEnglistNameMan() {
		return Data.enameboy[random.nextInt(Data.enameboy.length - 1)];
	}

	public static String strEnglistNameWomen() {
		return Data.enamegirl[random.nextInt(Data.enamegirl.length - 1)];
	}

	public static String strCompanyPhone() {
		String strNumber = "1234567890";
		int nSize = 0;
		StringBuilder salt = new StringBuilder();
		while (nSize < 8) {
			salt.append(strNumber.charAt(random.nextInt(strNumber.length() - 1)));
			++nSize;
		}
		return salt.toString();
	}

	public static String strCountry() {
		return (Data.country[random.nextInt(Data.country.length - 1)]);
	}

	public static String strLocale() {
		Locale locale = Locale.getDefault();
		String s = locale.getDisplayName();
		return s;
	}

	public static String strBirthday() {

		int nAge = random.nextInt(60);

		if (20 > nAge)
			nAge = nAge + 18;

		Calendar calendar = Calendar.getInstance();
		int nYear = calendar.get(Calendar.YEAR) - nAge;
		int nMonth = random.nextInt(12);
		if (0 == nMonth)
			nMonth = 2;
		int nDay;
		if (2 == nMonth) {
			nDay = random.nextInt(28);
		} else {
			nDay = random.nextInt(30);
		}

		String strB = String.format("%d/%d/%d", nYear, nMonth, nDay);
		return strB;
	}

	public static String strStreet() {
		String strRecord = "台北市民生東路四段133號";
		SQLiteConfig config = new SQLiteConfig();
		config.setSharedCache(true);
		config.enableRecursiveTriggers(true);

		SQLiteDataSource ds = new SQLiteDataSource(config);
		ds.setUrl("jdbc:sqlite:database/streetname.db");

		try {
			Connection con = ds.getConnection();
			String sql = "SELECT * FROM streetname ORDER BY RANDOM() LIMIT 1";// String.format("select * from streetname
																				// where uid = %d",
																				// random.nextInt(10484) + 1);
			Statement stat = null;
			ResultSet rs = null;
			stat = con.createStatement();
			rs = stat.executeQuery(sql);
			if (rs.next()) {
				strRecord = rs.getString("city") + rs.getString("country") + rs.getString("road");
			}
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return strRecord;
	}

	public static String strMobilePhone() {
		String strNumber = "1234567890";
		String strPrex = Data.mobile[random.nextInt(Data.mobile.length - 1)];

		StringBuilder salt = new StringBuilder();
		for (int i = 0; i < 6; ++i) {
			salt.append(strNumber.charAt(random.nextInt(strNumber.length() - 1)));
		}
		return (strPrex + salt.toString());
	}

	public static String strUniform() {
		String strNumber = "1234567890";
		StringBuilder salt = new StringBuilder();
		for (int i = 0; i < 8; ++i) {
			salt.append(strNumber.charAt(random.nextInt(strNumber.length() - 1)));
		}
		return salt.toString();
	}

	public static String strId() {
		String strId = "A123456789";
		int idnum[] = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30,
				31, 33 };
		
		return strId;
	}

}
