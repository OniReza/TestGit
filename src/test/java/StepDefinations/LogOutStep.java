package StepDefinations;

import Pages.LogOutPage;
import Utility.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LogOutStep {

    public WebDriver driver;
    LogOutPage logOutPage;

    public LogOutStep() throws Exception{
        this.driver = Hooks.getDriver();
        logOutPage = new LogOutPage(driver);
    }

    public void waitload() {
        new WebDriverWait(driver, 40).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @When("user clicks on logout button")
    public void user_clicks_on_logout_button() throws InterruptedException {

        logOutPage.logoutBtnClick();
        waitload();
    }

    @When("the user is done with testing")
    public void user_is_done_with_testing(){
        System.out.println("Testing Done");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Then("the browser should be closed")
    public void browser_should_be_closed(){
        if (driver != null) {
            driver.quit();
            System.out.println("Driver close");
        }
    }

}


