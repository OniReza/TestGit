package StepDefinations;

import Pages.BMETRegistrationPage;
import Utility.Hooks;
import Utility.Random_data;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class BMETRegistrationStep {

    public WebDriver driver;

    public static String PassportNumber;

    public static String Data2;
    private Scenario scenario;
    BMETRegistrationPage bmetRegistrationPage;

    public BMETRegistrationStep() throws Exception{
        this.driver = Hooks.getDriver();
        bmetRegistrationPage = new BMETRegistrationPage (driver);
    }
    public void waitload() {
        new WebDriverWait(driver, 40).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @When("user clicks on BMET button")
    public void user_clicks_on_BMET_button() throws Exception {
        bmetRegistrationPage.BMETRegis();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Registration button clicked successfully");
    }


    @And("user click new BMET registration")
    public void user_click_new_BMET_registration() throws Exception {
        bmetRegistrationPage.NewBMETRegis();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Registartion successfully");

    }


    @And("user upload passport")
    public void user_upload_passport() throws Exception {
        bmetRegistrationPage.uploadBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Upload passport successfully");

    }

    @And("user inputs passport number")
    public void user_nputs_passport_number()  {
        bmetRegistrationPage.passportNumber();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Input passport number successfully");
    }

    @And("user inputs mobile number")
    public void user_inputs_mobile_number() throws InterruptedException {
        bmetRegistrationPage.mobileNo();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Input mobile number successfully");
    }

    @And("user inputs full name")
    public void user_inputs_full_name() throws InterruptedException {
        bmetRegistrationPage.fullName();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Input full name successfully");
    }


    @And("user inputs passport information")
    public void user_inputs_passport_information() throws Exception {
        bmetRegistrationPage.passportInfo();
        writeEmail();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Input all passport info successfully");
    }

    @And("user select gender")
    public void user_select_gender() throws InterruptedException {
        bmetRegistrationPage.gender();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Select gender successfully");
    }

    @And("user select birthday district")
    public void user_select_birthday_district() throws InterruptedException {
        bmetRegistrationPage.BirthDistrict();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Select birth district successfully");
    }

    @And("user click next button")
    public void user_click_next_button() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", bmetRegistrationPage.nxtBtn);

        bmetRegistrationPage.NextBtn();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("User click next button successfully");
    }

    @And("user inputs personal information")
    public void user_inputs_personal_information() throws InterruptedException {
        bmetRegistrationPage.personalInfo();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Input personal information successfully");

    }

    @And("user inputs contact info")
    public void user_inputs_contact_info() throws InterruptedException {
        bmetRegistrationPage.ContuctInfo();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Input contact information successfully");

    }

    @And("user inputs nominee info")
    public void user_inputs_nominee_info() throws InterruptedException {
        bmetRegistrationPage.NomineeInfo();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Input Nominee information successfully");

    }

    @And("user inputs qualification info")
    public void user_inputs_qualification_info() throws InterruptedException {
        bmetRegistrationPage.QualificationInfo();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Input Qualification information successfully");

    }

    @And("user select desire country with preferred job")
    public void user_select_desire_country_with_preferred_job() throws InterruptedException {

        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", bmetRegistrationPage.qulifiNxtBtn);

        bmetRegistrationPage.DisreContry();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Select desired country");

    }


    @And("user click next button form Qualification page")
    public void user_click_next_button_form_Qualification_page() throws InterruptedException {

        Thread.sleep(1000);
        bmetRegistrationPage.QualifiNextBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Click next button");

    }

    @Then("user should see pending status")
    public void user_should_see_pending_text() throws InterruptedException {

        Thread.sleep(1000);
        waitload();
        Assert.assertTrue("Pending", bmetRegistrationPage.showmessage());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("User can see the  status pending");
      //  writeInReport();

    }

    public void writeEmail() throws Exception {

        PassportNumber= Random_data.passport_log();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        System.out.println("Email:  " + PassportNumber + " " + dtf.format(now));
        String Data ="Passport Number : "+ PassportNumber + "  "+dtf.format(now);
        Data2= "Passport Number : "+ PassportNumber ;

        File files = new File("Passport/Passport.txt");
        FileWriter fw = new FileWriter(files,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Data);
        bw.newLine();
        bw.close();
    }

    public void writeInReport()
    {
        String consoleOutput = Data2;
        System.out.println(consoleOutput);
        scenario.log(consoleOutput);
    }
}
