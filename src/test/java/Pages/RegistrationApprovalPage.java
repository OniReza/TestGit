package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RegistrationApprovalPage {


    String st2;
    String st23;
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[8]/a/span")
    public WebElement bmetaRgsApprovalBtn;

    @FindBy(name = "passport_no")
    public WebElement approvePassport;

    @FindBy(xpath = "//*[@id=\"kt_content\"]/div[2]/div/div/div/form/div/div[2]/div/div/button[2]")
    public WebElement searchBtn;

    @FindBy(id="verfied-button")
    public WebElement verifyBtn;

    @FindBy(id="status_radio_btn")
    public WebElement stsverifyBtn;

    @FindBy(id="1")
    public WebElement confrimBtn;

    @FindBy(xpath="//*[@id=\"posts\"]/tbody/tr/td[2]")
    public WebElement Approvemessage;

    @FindBy(xpath="//*[@id=\"admin-app\"]/div/div/div/div/div/div/div/div[1]/div[1]/div/input")
    public WebElement Searchpassport;



    public RegistrationApprovalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void readPassport() throws IOException {
        File myObj = new File("Passport/Passport.txt");

        BufferedReader input = new BufferedReader(new FileReader(myObj));
        String last, line;

        while ((line = input.readLine()) != null) {
            last = line;
            st2 = last;

            System.out.println(st2);
        }
        st23=st2.substring(18,27);
    }
    public void BMETRegisApproval() throws InterruptedException {
        bmetaRgsApprovalBtn.click();
        Thread.sleep(1000);
    }

    public void ApprovePassportInput() throws InterruptedException, IOException {
        Thread.sleep(2000);
        readPassport();
        approvePassport.sendKeys(st23);
        Thread.sleep(2000);


    }

    public void SearchBtn() throws InterruptedException {
        Thread.sleep(2000);
        searchBtn.click();
    }


    public void VerifyBtn() throws InterruptedException {
        Thread.sleep(2000);
        verifyBtn.click();
    }


    public void StatusverifyBtn() throws InterruptedException {
        Thread.sleep(2000);
        stsverifyBtn.click();
    }

    public void ConfirmBtn() throws InterruptedException {
        Thread.sleep(2000);
        confrimBtn.click();

    }

    public void SearchPassportInput() throws InterruptedException, IOException {
        Thread.sleep(2000);
        readPassport();
        Searchpassport.sendKeys(st23);
        Thread.sleep(3000);
    }
    public boolean Apporvemessage() {
        return Approvemessage.isDisplayed();
    }

    public String bacthno()
    {
        String a =approvePassport.getText();

        return a;
    }

}
