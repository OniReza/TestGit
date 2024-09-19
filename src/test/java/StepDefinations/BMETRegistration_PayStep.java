package StepDefinations;

import Pages.BMETRegistrationPage;
import Pages.RegistrationApprovalPage;
import Utility.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;

import java.util.concurrent.TimeUnit;

public class BMETRegistration_PayStep {

    public WebDriver driver;
    RegistrationApprovalPage registrationApprovalPage;
    BMETRegistrationPage bmetRegistrationPage;

    public BMETRegistration_PayStep()throws Exception {
        this.driver = Hooks.getDriver();
        registrationApprovalPage = new RegistrationApprovalPage(driver);
        bmetRegistrationPage=new BMETRegistrationPage(driver);
    }

    public void waitload() {
        new WebDriverWait(driver, 40).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @And("user input passport number on search field")
    public void user_input_passport_number() throws InterruptedException, IOException {

        Thread.sleep(1000);
        registrationApprovalPage.SearchPassportInput();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("user input passport number on search field");
    }

    @And("user select checkbox for payment")
    public void user_select_checkbox_for_payment() throws InterruptedException {
        Thread.sleep(1000);
        bmetRegistrationPage.ChkboxBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("user select checkbox for payment");
    }

    @And("user click make payment button for pay")
    public void user_click_payment_button_for_pay() throws InterruptedException {
        Thread.sleep(1000);
        bmetRegistrationPage.PayBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("user select checkbox for payment");
    }

    @And("user select a vendor for payment")
    public void user_select_a_vendor_for_payment() throws InterruptedException {
        Thread.sleep(1000);
        bmetRegistrationPage.VendorBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("user select a vendor for payment");
    }

    @And("user select payment policy checkbox")
    public void user_select_payment_policy_checkbox() throws InterruptedException {
        Thread.sleep(1000);
        bmetRegistrationPage.CheckBoxPolicyBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("user select a vendor for payment");
    }

    @And("user click pay button")
    public void user_click_pay_button() throws InterruptedException {
        Thread.sleep(1000);
        bmetRegistrationPage.Pay_Button();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("user select a vendor for payment");
    }

    @And("user complete the payment using bkash")
    public void user_complete_the_payment_using_bkash() throws InterruptedException {
        Thread.sleep(1000);
        bmetRegistrationPage.payment();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("user complete the payment using bkash");
    }

    @Then("user should see payment have been successfully completed")
    public void user_should_see_marchent_payment_page() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue("complete",  bmetRegistrationPage.MarchentPage());
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("user should see payment have been successfully completed");
    }
}
