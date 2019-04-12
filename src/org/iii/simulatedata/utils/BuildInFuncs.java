package org.iii.simulatedata.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.sql.*;

import org.iii.simulatedata.utils.probabilityDistribution.BinominalDistFuncs;
import org.iii.simulatedata.utils.probabilityDistribution.MultinominalDistributionFuncs;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;

public class BuildInFuncs
{
    private static int surNameIndex = 0;
    private static int name1Index = 0;
    private static int name2Index = 0;
    private static Random random = new Random();
    
    public static long timestamp()
    {
        return System.currentTimeMillis();
    }
    
    public static int intRand()
    {
        return Math.abs(random.nextInt());
    }
    
    public static long longRand()
    {
        return Math.abs(random.nextLong());
    }
    
    public static String numRand(Integer n)
    {
        StringBuilder strb = new StringBuilder(n);
        for (int i = 0; i < n; i++)
            strb.append((char) ('0' + random.nextInt(10)));
        return strb.toString();
    }
    
    public static String strRand(Integer n)
    {
        StringBuilder strb = new StringBuilder(n);
        for (int i = 0; i < n; i++)
        {
            int type = random.nextInt(3);
            switch (type)
            {
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
    
    public static int intRand(Integer n)
    {
        return random.nextInt(n);
    }
    
    public static int intRand(Integer s, Integer e)
    {
        int interval = e - s;
        return s + random.nextInt(interval);
    }
    
    public static double doubleRand()
    {
        return random.nextDouble();
    }
    
    public static double doubleRand(Integer s, Integer e, Integer n)
    {
        double randDouble = random.nextDouble();
        int interval = e - s;
        double r = s + (randDouble * interval);
        return Double.parseDouble(String.format("%." + n + "f", r));
    }
    
    public static String strSurname()
    {
        surNameIndex = random.nextInt(Data.surname.length - 1);
        return Data.surname[surNameIndex];
    }
    
    public static String strFirstName()
    {
        name1Index = random.nextInt(Data.word.length - 1);
        name2Index = random.nextInt(Data.word.length - 1);
        return (Data.word[name1Index] + Data.word[name2Index]);
    }
    
    public static String strEnglishName()
    {
        String surname;
        String name1;
        String name2;
        String englishName;
        
        if (0 != surNameIndex)
        {
            surname = Data.esurname[surNameIndex];
            surNameIndex = 0;
        }
        else
        {
            surname = Data.esurname[random.nextInt(Data.esurname.length - 1)];
        }
        
        if (0 != name1Index)
        {
            name1 = Data.eword[name1Index];
        }
        else
        {
            name1 = Data.eword[random.nextInt(Data.eword.length - 1)];
        }
        
        if (0 != name2Index)
        {
            name2 = Data.eword[name2Index];
        }
        else
        {
            name2 = Data.eword[random.nextInt(Data.eword.length - 1)];
        }
        
        return String.format("%s %s %s", name1, name2, surname);
    }
    
    public static String strName()
    {
        return (strSurname() + strFirstName());
    }
    
    public static String strEmail()
    {
        /*
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        int nLen = random.nextInt(10);
        while (5 > nLen)
        {
            nLen = nLen * 2;
        }
        
        int nSize = 0;
        StringBuilder salt = new StringBuilder();
        while (nSize < nLen)
        {
            salt.append(allowedChars.charAt(random.nextInt(allowedChars.length() - 1)));
            ++nSize;
        }
        
        String saltStr = salt.toString();
        return (saltStr + "@" + Data.email[random.nextInt(Data.email.length - 1)]);
        */
        return "iii@gmail.com";
    }
    
    public static String strCompany()
    {
        return (Data.company[random.nextInt(Data.company.length - 1)]);
    }
    
    public static String strEnglistNameMan()
    {
        return Data.enameboy[random.nextInt(Data.enameboy.length - 1)];
    }
    
    public static String strEnglistNameWomen()
    {
        return Data.enamegirl[random.nextInt(Data.enamegirl.length - 1)];
    }
    
    public static String strCompanyPhone()
    {
        String strNumber = "1234567890";
        int nSize = 0;
        StringBuilder salt = new StringBuilder();
        while (nSize < 8)
        {
            salt.append(strNumber.charAt(random.nextInt(strNumber.length() - 1)));
            ++nSize;
        }
        return salt.toString();
    }
    
    public static String strCountry()
    {
        return (Data.country[random.nextInt(Data.country.length - 1)]);
    }
    
    public static String strLocale()
    {
        Locale locale = Locale.getDefault();
        String s = locale.getDisplayName();
        return s;
    }
    
    public static String strBirthday()
    {
        
        int nAge = random.nextInt(60);
        
        if (20 > nAge)
        {
            nAge = nAge + 18;
        }
        
        Calendar calendar = Calendar.getInstance();
        int nYear = calendar.get(Calendar.YEAR) - nAge;
        int nMonth = random.nextInt(12);
        if (0 == nMonth)
        {
            nMonth = 2;
        }
        int nDay;
        if (2 == nMonth)
        {
            nDay = random.nextInt(28);
        }
        else
        {
            nDay = random.nextInt(30);
        }
        
        String strB = String.format("%d/%d/%d", nYear, nMonth, nDay);
        return strB;
    }
    
    public static String strStreet()
    {
        String strRecord = "台北市民生東路四段133號";
        SQLiteConfig config = new SQLiteConfig();
        config.setSharedCache(true);
        config.enableRecursiveTriggers(true);
        
        SQLiteDataSource ds = new SQLiteDataSource(config);
        ds.setUrl("jdbc:sqlite:database/streetname.db");
        
        try
        {
            Connection con = ds.getConnection();
            String sql = "SELECT * FROM streetname ORDER BY RANDOM() LIMIT 1";
            Statement stat = null;
            ResultSet rs = null;
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            if (rs.next())
            {
                strRecord = rs.getString("city") + rs.getString("country") + rs.getString("road");
            }
            con.close();
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        return strRecord;
    }
    
    public static String strMobilePhone(Integer nType)
    {
        String strNumber = "1234567890";
        String strPrex = Data.mobile[random.nextInt(Data.mobile.length - 1)];
        String strResult;
        StringBuilder salt = new StringBuilder();
        for (int i = 0; i < 6; ++i)
        {
            salt.append(strNumber.charAt(random.nextInt(strNumber.length() - 1)));
        }
        
        switch (nType)
        {
            case 0:
                strResult = strPrex + salt.toString(); // 09xxxxxxxx
                break;
            case 1:
                strResult = "886" + (strPrex + salt.toString()).substring(1); // 886912345678
                break;
            default:
                strResult = strPrex + salt.toString();
        }
        
        return strResult;
    }
    
    public static String strUniform()
    {
        String strNumber = "1234567890";
        StringBuilder salt = new StringBuilder();
        for (int i = 0; i < 8; ++i)
        {
            salt.append(strNumber.charAt(random.nextInt(strNumber.length() - 1)));
        }
        return salt.toString();
    }
    
    public static String strUUID(Integer nType)
    {
        String s = UUID.randomUUID().toString();
        String strResult = s;
        switch (nType)
        {
            case 0:
                strResult = s;
                break;
            case 1: // 去掉 "-"
                strResult =
                        s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
                break;
        }
        
        return strResult;
    }
    
    public static String strRegion()
    {
        String strResult = "TW";
        
        if (1 == BinominalDistFuncs.BinominalDistFuncs(1, 1, 0.97)[0])
        {
            strResult = "TW";
        }
        else
        {
            strResult = Data.region[random.nextInt(Data.region.length - 1)];
        }
        
        return strResult;
    }
    
    public static String strTaiwanCity()
    {
        return Data.taiwan_city[random.nextInt(Data.taiwan_city.length - 1)];
    }
    
    public static String strOS(Integer nType)
    {
        String strResult = Data.os[random.nextInt(Data.os.length - 1)];
        
        switch (nType)
        {
            case 0:
                strResult = "Android";
                break;
        }
        
        return strResult;
    }
    
    /**
     * @param nType 資料產生的方式,0 表示只有"zh" 跟 "other", "zh"出現的機率為97％,1 為隨機抓取各國語系代碼
     * @return 回傳語系代碼
     */
    public static String strLanguage(Integer nType)
    {
        String strResult;
        int npoint = 0;
        
        switch (nType)
        {
            case 0:
                strResult = "other";
                npoint = BinominalDistFuncs.BinominalDistFuncs(1, 1, 0.97)[0];
                if (1 == npoint)
                {
                    strResult = "zh";
                }
                break;
            case 1:
                strResult = Data.language[random.nextInt(Data.language.length - 1)];
                break;
            default:
                strResult = "";
                break;
        }
        return strResult;
    }
    
    public static int intLoginStatus()
    {
        return BinominalDistFuncs.BinominalDistFuncs(1, 1, 0.7)[0];
    }
    
    public static int subscriptStatus()
    {
        return BinominalDistFuncs.BinominalDistFuncs(1, 1, 0.012)[0];
    }
    
    public static int isContact()
    {
        return BinominalDistFuncs.BinominalDistFuncs(1, 1, 0.8)[0];
    }
    
    public static int isSpam()
    {
        return BinominalDistFuncs.BinominalDistFuncs(1, 1, 0.18)[0];
    }
    
    
    /**
     * 手機廠牌 2018統計10大,
     * apple(25.3%) samsung(18.81%) asus(11.75%) oppo(10.27%) htc(6.36%) sony(6.17%)
     * huawei(3.99%) mi(3.95%) sugar(2.5%) nokia(2.28%) etc(8.62%)
     *
     * @return 手機廠牌
     */
    public static String strManufaturer()
    {
        String strResult;
        double[] p = {0.253, 0.1881, 0.1175, 0.1027, 0.0636, 0.0617, 0.0399, 0.0395, 0.025, 0.028
                , 0.0862};
        ArrayList result =
                (ArrayList) MultinominalDistributionFuncs.multinominalRandomGenerator(1, 11, p);
        
        int nIndex = (int) result.get(0);
        switch (nIndex)
        {
            case 0:
                strResult = "apple";
                break;
            case 1:
                strResult = "samsung";
                break;
            case 2:
                strResult = "asus";
                break;
            case 3:
                strResult = "oppo";
                break;
            case 4:
                strResult = "htc";
                break;
            case 5:
                strResult = "sony";
                break;
            case 6:
                strResult = "huawei";
                break;
            case 7:
                strResult = "mi";
                break;
            case 8:
                strResult = "sugar";
                break;
            case 9:
                strResult = "nokia";
                break;
            default:
                strResult = "etc";
                break;
            
        }
        return strResult;
    }
    
    /**
     * n=22;p1=0.12,p2=0.65,p3=0.07,p4~p20=0
     * food(0.12),activity(0.65),beauty(0.07),life(0),health(0),travel(0),entertainmean(0),
     * automobile(0),traffic(0),professional(0),bank(0),government(0),politics(0),organization(0)
     * ,pet(0),logistic(0),media(0),thers(0),null(0),personal(0),publicperson(0),shopping(0)
     *
     * @return string
     */
    public static String bizCategory()
    {
        String strResult;
        double[] p = {0.12, 0.65, 0.07, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ArrayList result =
                (ArrayList) MultinominalDistributionFuncs.multinominalRandomGenerator(1, 22, p);
        int nIndex = (int) result.get(0);
        switch (nIndex)
        {
            case 0:
                strResult = "food";
                break;
            case 1:
                strResult = "activity";
                break;
            case 2:
                strResult = "beauty";
                break;
            case 3:
                strResult = "life";
                break;
            case 4:
                strResult = "health";
                break;
            case 5:
                strResult = "travel";
                break;
            case 6:
                strResult = "entertainmean";
                break;
            case 7:
                strResult = "automobile";
                break;
            case 8:
                strResult = "traffic";
                break;
            case 9:
                strResult = "professional";
                break;
            case 10:
                strResult = "bank";
                break;
            case 11:
                strResult = "government";
                break;
            case 12:
                strResult = "politics";
                break;
            case 13:
                strResult = "organization";
                break;
            case 14:
                strResult = "pet";
                break;
            case 15:
                strResult = "logistic";
                break;
            case 16:
                strResult = "media";
                break;
            case 17:
                strResult = "others";
                break;
            case 18:
                strResult = "personal";
                break;
            case 19:
                strResult = "publicperson";
                break;
            case 20:
                strResult = "shopping";
                break;
            default:
                strResult = "null";
                break;
            
        }
        return strResult;
    }
    
    
    /**
     * Data format is 2016-02-01T01:10:13
     *
     * @return
     */
    public static String strAppInstallTime()
    {
        String strResult;
        
        int nAge = random.nextInt(5);
        
        Calendar calendar = Calendar.getInstance();
        int nYear = calendar.get(Calendar.YEAR) - nAge;
        int nMonth = random.nextInt(12);
        if (0 == nMonth)
        {
            nMonth = 2;
        }
        int nDay;
        if (2 == nMonth)
        {
            nDay = random.nextInt(28);
        }
        else
        {
            nDay = random.nextInt(30);
        }
        
        int nHour = random.nextInt(23);
        int nMin = random.nextInt(59);
        int nSecond = random.nextInt(59);
        
        strResult = String.format("%d-%02d-%02dT%02d:%02d:%02d", nYear, nMonth, nDay, nHour, nMin
                , nSecond);
        
        return strResult;
    }
    
    /**
     * 查詢來源為接電話 or 撥出電話 or 未接電話
     * n=3,p1=0.64,p2=0.32,p3=0.04
     *
     * @return "in","out","missed"
     */
    public static String queryType()
    {
        String strResult;
        double[] p = {0.64, 0.32, 0.04};
        ArrayList result =
                (ArrayList) MultinominalDistributionFuncs.multinominalRandomGenerator(1, 3, p);
        int nIndex = (int) result.get(0);
        switch (nIndex)
        {
            case 0:
                strResult = "in";
                break;
            case 1:
                strResult = "out";
                break;
            default:
                strResult = "missed";
                break;
            
        }
        return strResult;
    }
    
    /**
     * n=8,p1=0.55,p2=0.2,p3=0.25,p4~p8=0
     * HFB(0.55),Telemarketing(0.2),Harassment(0.25),Fraud(0),Adult(0),Call Center(0),Phishing(0)
     * ,Illeagl(0)
     *
     * @return string
     */
    public static String spamCategory()
    {
        String strResult;
        double[] p = {0.55, 0.2, 0.25, 0, 0, 0, 0, 0};
        ArrayList result =
                (ArrayList) MultinominalDistributionFuncs.multinominalRandomGenerator(1, 8, p);
        
        int nIndex = (int) result.get(0);
        switch (nIndex)
        {
            case 0:
                strResult = "HFB";
                break;
            case 1:
                strResult = "Telemarketing";
                break;
            case 2:
                strResult = "Harassment";
                break;
            case 3:
                strResult = "Fraud";
                break;
            case 4:
                strResult = "Adult";
                break;
            case 5:
                strResult = "Call Center";
                break;
            case 6:
                strResult = "Phishing";
                break;
            case 7:
                strResult = "Illeagl";
                break;
            default:
                strResult = "";
                break;
        }
        return strResult;
    }
    
    // public static String
    /*
     * public static String strId() { String strId = "A123456789"; int idnum[] =
     * { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25,
     * 26, 27, 28, 29, 32, 30, 31, 33 };
     *
     * return strId; }
     */
}
