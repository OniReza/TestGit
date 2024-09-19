package Pages;

import Utility.BaseData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApprovalLoginPage {
    @FindBy(id = "exampleFormControlInput1")
    WebElement Email;

    @FindBy(xpath = "/html/body/div/div/div/div/div/form/div[3]/input")
    WebElement Password;

    @FindBy(id = "kt_login_signin_submit")
    WebElement Submit;

    @FindBy(xpath = "//input[@id='code' and @type='text']/.")
    WebElement Totp;
    @FindBy(xpath = "//h6")
    WebElement otpExpireMsg;

    public boolean otpExpCheck(){
        try {
            return otpExpireMsg.isDisplayed();
        }
        catch (NoSuchElementException e){
            return false;
        }
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/p[1]")
    WebElement AssertLandingPage;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/header/div/div/div[2]/div[1]/div/span[2]")
    WebElement AssertBoardRegisterPage;

    @FindBy(xpath = " //span[text()=\"Dashboard\"]")
    WebElement AssertPage;

    public ApprovalLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void emailAddress(String email) {
        Email.sendKeys(Keys.CONTROL+"A");
        Email.sendKeys(Keys.BACK_SPACE);
        Email.sendKeys(email);
    }

    public void Password(String pass) {
        Password.sendKeys(pass);
    }


    public void Submit() {
        Submit.click();
    }

    public void ApprovalPageClass() throws Exception {
        String Email = BaseData.BaseEmailApproval();

        String Pass = BaseData.ApprovePassword();

        try {
            emailAddress(Email);
        } catch (NoSuchElementException e) {
            System.out.println("No Email input field appeared");
        }

        try {
            Password(Pass);
        } catch (NoSuchElementException e) {
            System.out.println("No Password input field appeared");
        }

        try {
            Submit();
        } catch (NoSuchElementException e) {
            System.out.println("Continue button not clickable");
        }

    }

}
