package org.iii.simulatedata.utils;

import java.util.Random;
import java.util.UUID;

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

	public static String strEnglistName(String strSex) {
		String strename;
		strSex.trim();
		
		if (0 == strSex.compareTo("男")) {
			strename = Data.enameboy[random.nextInt(Data.enameboy.length - 1)];
		} else {
			strename = Data.enamegirl[random.nextInt(Data.enamegirl.length - 1)];
		}
		return strename;
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

	public static void main(String[] args) {
		System.out.println(intRand(10));
		System.out.println(doubleRand());
		System.out.println(doubleRand(10, 100, 3));
		System.out.println(numRand(10));
		System.out.println(strRand(10));
	}
}
