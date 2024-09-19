package StepDefinations;

import Pages.BMETRegistrationPage;
import Pages.RegistrationApprovalPage;
import Utility.Hooks;
import Pages.LogOutPage;
import Utility.Random_data;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import java.io.File;  // Import the File class
import java.util.Scanner;

public class ApprovalRegistrationStep {

    public WebDriver driver;

    RegistrationApprovalPage registrationApprovalPage;

    public ApprovalRegistrationStep()throws Exception {
        this.driver = Hooks.getDriver();
        registrationApprovalPage = new RegistrationApprovalPage(driver);
    }

    public void waitload() {
        new WebDriverWait(driver, 40).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @When("user click new registration status button")
    public void user_clicks_on_BMET_button() throws Exception {
        registrationApprovalPage.BMETRegisApproval();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Registration button clicked successfully");
    }

    @And("user input passport number")
    public void user_input_passport_number() throws InterruptedException, IOException {

        Thread.sleep(1000);
        registrationApprovalPage.ApprovePassportInput();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Input passport number");
    }

    @And("user click search button")
    public void user_click_new_BMET_registration() throws Exception {
        registrationApprovalPage.SearchBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("User click search button");
    }

    @And("user click manual varification button")
    public void user_click_manual_varification_button() throws Exception {
        registrationApprovalPage.VerifyBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("User click manual varification button");
    }

    @And("user select verify option")
    public void user_select_verify_option() throws Exception {
        registrationApprovalPage.StatusverifyBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("User select verify option");
    }

    @And("user click confirm button")
    public void user_click_confirm_button() throws Exception {
        registrationApprovalPage.ConfirmBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("User select verify option");

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    @Then("user should see passport verification status yes")
    public void user_should_see_passport_verification_status_yes() throws InterruptedException {
        Thread.sleep(1000);
        waitload();
        Assert.assertTrue("Yes", registrationApprovalPage.Apporvemessage());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("user should see passport verification status yes");


    }

}

