package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import static Utility.BaseCredentials.browserName;

public class Hooks {
    private static WebDriver driver;

    @Before
    public static WebDriver getDriver() throws Exception {

        if (null == driver) {

            if (browserName().equals("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
                System.out.println("Starting Chrome....");
                driver = new ChromeDriver();
            }
            else if(browserName().equals("Firefox")){
                System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
                System.out.println("Starting Firefox....");
                driver = new FirefoxDriver();
            }

        }

        return driver;
    }

    @After
    public void tearDown()
    {
        driver.quit();
        driver.close();
    }

}
