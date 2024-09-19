package Pages;

import Utility.BaseData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
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


    public LoginPage(WebDriver driver) {
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

    public void Totp(String otp) {
        Totp.sendKeys(otp);
    }

    public void Submit() {
        Submit.click();
    }

    public void PageClass() throws Exception {
        String Email = BaseData.BaseEmail();
        String Pass = BaseData.BasePassword();

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

//        try {
//
//            Totp(Otp);
//        } catch (NoSuchElementException e) {
//            System.out.println("No OTP input field appeared");
//        }

//        try {
//            Submit();
//            Assert.assertTrue("Dashboard is not Displayed",dashBoard.isDisplayed());
//        }
//        catch (NoSuchElementException e) {
//
//            if (otpExpCheck()){
//                int count = 0;
//                do {
//                    System.out.println("Otp error, trying again!!!");
//                    Totp.sendKeys(Keys.CONTROL + "a");
//                    Totp.sendKeys(Keys.BACK_SPACE);
//                    Thread.sleep(1500);
//                   // Totp(Otp);
//                    Submit();
//                    count++;
//                } while ( otpExpCheck() && count < 3);
//
//            }
//            else {
//                System.out.println("Unknown login error");
//            }
//
//        }

    }


    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Resub+++++++++++++++++++++++++++++++++++++++++++++++++++++++


//    public boolean recentTransectionSectionCheck() {
//        return recentTransectionSection.isDisplayed();
//    }

//    public boolean totalBalenceSectionCheck() {
//        return totalBalenceSection.isDisplayed();
//    }

//    public boolean addInformationLabelCheck() {
//        return addInformationLabel.isDisplayed();
//    }

}
