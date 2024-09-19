package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseCredentials {

    static Properties prop = new Properties();
    static FileInputStream file;

    public static String BaseEmailList() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/config.properties");
        prop.load(file);
        String Email = prop.getProperty("Email");
        return Email;
    }

    public static String BaseEmailListApproval() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/approve.properties");
        prop.load(file);
        String Email = prop.getProperty("Email");
        return Email;
    }

    public static String BaseOTPList() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/config.properties");
        prop.load(file);
        String secretKey = prop.getProperty("secretKey");
        return secretKey;
    }

    public static String BasePassword() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/config.properties");
        prop.load(file);
        String Password = prop.getProperty("Password");
        return Password;
    }

    public static String ApprovalPassword() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/approve.properties");
        prop.load(file);
        String Password = prop.getProperty("Password");
        return Password;
    }

    public static String testEnv() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/config.properties");
        prop.load(file);
        String Environment = prop.getProperty("Environment");
        return Environment;
    }

    public static String browserName() throws Exception {
        file = new FileInputStream("./src/test/resources/config.properties");
        prop.load(file);
        return prop.getProperty("Browser");
    }
}
