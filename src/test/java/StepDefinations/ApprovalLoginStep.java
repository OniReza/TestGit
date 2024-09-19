package StepDefinations;

import Pages.ApprovalLoginPage;
import Utility.BaseData;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Utility.BaseCredentials.testEnv;
import static Utility.Hooks.getDriver;
public class ApprovalLoginStep {

    public WebDriver driver;
    ApprovalLoginPage approvalLoginPage;
  
    public ApprovalLoginStep() throws Exception{
        this.driver = getDriver();
        approvalLoginPage = new ApprovalLoginPage (driver);
    }

    public void waitLoad() {
        new WebDriverWait(driver, 40).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @After(order = 1)
    public void takeScraenshotOnFailure(Scenario scenario)throws Exception {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    }

    @Given("user has logged into the approval portal")
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
        approvalLoginPage.ApprovalPageClass();
        waitLoad();
        System.out.println("Login successfully");

    }


}
