package StepDefinations;

import Pages.LoginPage;
import Utility.BaseData;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Utility.BaseCredentials.testEnv;
import static Utility.Hooks.getDriver;


public class LoginStep {
    public WebDriver driver;
    LoginPage loginPage;


    public LoginStep()throws Exception {
        this.driver = getDriver();
        loginPage = new LoginPage(driver);
    }

    public void waitLoad() {
        new WebDriverWait(driver, 40).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @After(order = 1)
    public void takeScraenshotOnFailure(Scenario scenario) throws Exception{

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    }

    /*Modify by: Abid Reza
     12-20-2022
    */
    @Given("user has logged into the portal")
    public void a_valid_url() throws Exception {
        String URL = BaseData.BaseUrlMain();

        if (testEnv().trim().equals("dev")) {

            driver.get(URL);
        } else if (testEnv().trim().equals("tst")) {
            driver.get(URL);

        } else {
            System.out.println("\n" + "Please check Environment name in config.properties file");
            driver.quit();
        }

        driver.manage().window().maximize();
        waitLoad();
        loginPage.PageClass();
        waitLoad();
        System.out.println("Login successfully");

        }
    }












