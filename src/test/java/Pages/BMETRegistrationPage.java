package Pages;

import Utility.Hooks;
import Utility.Random_data;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BMETRegistrationPage {

  //  private WebDriver driver;

   @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span")
                   //*[@id="kt_aside_menu"]/ul/li[3]/a/span

    public WebElement bmetaRgsBtn;

    @FindBy(xpath = "//*[@id=\"admin-app\"]/div/div/div/div/div/div/div/ul/li/a[1]")
    public WebElement bmetaNwRgsBtn;
    @FindBy(id = "kt_uppy_5_input_control")
    public WebElement UploadBtn;

    @FindBy(id = "issue_date")
    public WebElement IssuDate;
    @FindBy(xpath = "//*[@id=\"issue_month\"]")
    public WebElement Issumnth;

    @FindBy(id = "issue_year")
    public WebElement Issuyear;

    @FindBy(id = "full_name")
    public WebElement FName;
    @FindBy(id = "passport_number")
    public WebElement PassportNo;

    @FindBy(id = "mobile_number")
    public WebElement MobileNo;


    @FindBy(id = "expire_date")
    public WebElement ExpireDate;
    @FindBy(id = "expire_month")
    public WebElement ExpireMonth;

    @FindBy(id = "expire_year")
    public WebElement ExpireYear;

    @FindBy(id="male")
    public WebElement Gender;


    @FindBy(id = "birth_date")
    public WebElement dateofB;

    @FindBy(id = "birth_month")
    public WebElement dateofM;

    @FindBy(id = "birth_year")
    public WebElement dateofY;

    @FindBy(id="birth_district_id")
    public WebElement birthDist;

    @FindBy(xpath="//*[@id=\"tab-passport\"]/form/div[3]/div/div/button")
    public WebElement nxtBtn;

    @FindBy(id="father_name")
    public WebElement fthName;

    @FindBy(id="mother_name")
    public WebElement mthName;

    @FindBy(id="marital_status")
    public WebElement meritalSt;

    @FindBy(id="religion_status")
    public WebElement religSt;


    @FindBy(id="spouse_name")
    public WebElement spsName;

    @FindBy(id="height_feet")
    public WebElement height;


    @FindBy(id="height_inch")
    public WebElement heigtInch;


    @FindBy(id="weight")
    public WebElement weight;

    @FindBy(xpath = "//*[@id=\"tab-personal\"]/form/div[2]/div/div[2]/button")
    public WebElement pnxtBtn;


    @FindBy(id = "district_id")
    public WebElement distBtn;

    @FindBy(id = "upazila_id")
    public WebElement upozelaBtn;


    @FindBy(id = "union_id")
    public WebElement unionBtn;

    @FindBy(id = "area")
    public WebElement areaInput;


    @FindBy(id = "house_no")
    public WebElement houseInput;

    @FindBy(xpath = "//*[@id=\"tab-contact\"]/form/div[2]/label/span")
    public WebElement chkBox;

    @FindBy(id ="contact_person_name")
    public WebElement contactPname;


    @FindBy(id ="relation")
    public WebElement relationInput;


    @FindBy(id ="contact_person_mobile")
    public WebElement contactPmobile;

    @FindBy(xpath ="//*[@id=\"tab-contact\"]/form/div[4]/div/div[2]/button")
    public WebElement nxtCBtn;

    @FindBy(id ="relation_to_employee")
    public WebElement nomineeEmpddlBtn;

    @FindBy(id ="nominee_name")
    public WebElement nomineeName;

    @FindBy(id ="nominee_mobile_no")
    public WebElement nomineeMOb;

    @FindBy(id ="nominee_father")
    public WebElement nomineeFName;

    @FindBy(id ="nominee_mother")
    public WebElement nomineeMName;


    @FindBy(xpath ="//*[@id=\"tab-nominee\"]/form/div[3]/div/div[2]/button")
    public WebElement nomineenextbtn;

    @FindBy(id ="degree_name0")
    public WebElement qulificatioDG;

    @FindBy(id ="passing_year0")
    public WebElement qulificatioPassY;

    @FindBy(id ="institute_name0")
    public WebElement qulifiInstName;

    @FindBy(id ="board0")
    public WebElement qulifiBoard;

    @FindBy(id ="subject_name0")
    public WebElement qulifiSubj;

    @FindBy(id ="result0")
    public WebElement qulifiGrad;

    @FindBy(xpath ="//*[@id=\"tab-education\"]/form/div[1]/div/div[4]/button")
    public WebElement qulifiAddbtn;

    @FindBy(xpath ="//*[@id=\"tab-education\"]/form/div[1]/div[2]/div[1]/button")
    public WebElement qulifiRmvbtn;

    @FindBy(xpath ="//*[@id=\"tab-education\"]/form/div[2]/div[1]/div[5]/button")
    public WebElement qulifiLangAddbtn;

    @FindBy(xpath ="//*[@id=\"tab-education\"]/form/div[2]/div[2]/div[1]/button")
    public WebElement qulifiLangRmvbtn;

    @FindBy(id ="language_name0")
    public WebElement qulifiLang;

    @FindBy(id ="oral_skill0")
    public WebElement qulifiOral;

    @FindBy(id ="writing_skill0")
    public WebElement qulifiWrite;

    @FindBy(xpath ="(//ul[@class='select2-selection__rendered'])[1]")
    public WebElement qulifiDscountry;

    @FindBy(xpath ="//input[@placeholder='Select a country']")
    public WebElement qulifiDscountry2;


    @FindBy(xpath ="//*[@id=\"tab-education\"]/form/div[2]/div[2]/div/div[2]/div/span/span[1]/span/ul")
    public WebElement qulifipf;

    @FindBy(xpath ="//input[@placeholder='Select a skill']")
    public WebElement qulifipf2;


    @FindBy(xpath ="//*[@id=\"tab-education\"]/form/div[2]/div[3]/div/div[2]/button")
    public WebElement qulifiNxtBtn;


    @FindBy(xpath ="//*[@id=\"tab-language\"]/div/div[1]/div[1]/div/div[2]/p")
    public WebElement message;

    @FindBy(xpath="//*[@id=\"admin-app\"]/div/div/div/div/div/div/div/div[2]/table/tbody/tr/td[1]/input")
    public WebElement Chkbox;

    @FindBy(xpath="//*[@id=\"admin-app\"]/div/div/div/div/div/div/div/ul/li/a[2]")
    public WebElement PaymentBtn;

    @FindBy(xpath="/html/body/div/div/div/div/div/div[2]/ul/li[3]/a")
    public WebElement VendorPayBtn;

    @FindBy(id="agree_term")
    public WebElement CheckboxPolicy;

    @FindBy(id="pay_btn")
    public WebElement Pay_btn;

    @FindBy(xpath="//*[@id=\"tab-language\"]/div/div[1]/div[2]/div/div/p[7]/span")
    public WebElement Marchent_Page;

    @FindBy(xpath = "/html/body/div[1]/div/div/app-root/app-transaction/div/div[1]/div[1]/div/div[1]/app-tab-nav/div/ul/li[2]/a")
    public WebElement mobileBankingBtn;


    @FindBy(xpath = "//*[@id=\"menu2\"]/ul/li[1]/a/img")
    public WebElement selectBkash;

    @FindBy(xpath = "//*[@id=\"sections\"]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[1]/form[2]/input[6]")
    public WebElement successBtn;


    public BMETRegistrationPage(WebDriver driver) throws Exception {
       // this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void BMETRegis() throws InterruptedException {
        bmetaRgsBtn.click();
        Thread.sleep(1000);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void NewBMETRegis() throws InterruptedException {
        bmetaNwRgsBtn.click();
        Thread.sleep(1000);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void uploadBtn() throws InterruptedException {
        Thread.sleep(1000);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        UploadBtn.sendKeys("/Users/amiprobashilimited/Downloads/test.jpeg");
    }

    public void passportNumber() {
        PassportNo.sendKeys(Random_data.passportNumber());
    }

    public void mobileNo() throws InterruptedException {
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileNo.sendKeys(Random_data.phoneNumber());
    }

    public void fullName() throws InterruptedException {
        Thread.sleep(3000);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        FName.sendKeys(Random_data.fullName());
    }

    public void passportInfo() throws InterruptedException {

        IssuDate.click();
        Thread.sleep(1000);
        IssuDate.sendKeys("7");
        Thread.sleep(1000);


        Issumnth.click();
        Thread.sleep(1000);
        Issumnth.sendKeys("March");
        Thread.sleep(1000);


        Issuyear.click();
        Thread.sleep(1000);
        Issuyear.sendKeys("2015");
        Thread.sleep(1000);


        ExpireDate.click();
        Thread.sleep(1000);
        ExpireDate.sendKeys("20");
        Thread.sleep(1000);


        ExpireMonth.click();
        Thread.sleep(1000);
        ExpireMonth.sendKeys("April");
        Thread.sleep(1000);



        ExpireYear.click();
        Thread.sleep(1000);
        ExpireYear.sendKeys("2027");
        Thread.sleep(1000);


        Thread.sleep(1000);
        dateofB.click();
        Thread.sleep(1000);
        dateofB.sendKeys("11");
        Thread.sleep(1000);


        Thread.sleep(1000);
        dateofM.click();
        Thread.sleep(1000);
        dateofM.sendKeys("May");
        Thread.sleep(1000);


        dateofY.click();
        Thread.sleep(1000);
        dateofY.sendKeys("1982");
        Thread.sleep(1000);

    }

    public void gender() throws InterruptedException {
        Thread.sleep(1000);
        Gender.click();
    }

    public void BirthDistrict() throws InterruptedException {
        Thread.sleep(1000);
        birthDist.click();
        birthDist.sendKeys("FARIDPUR");

    }


    public void NextBtn() throws InterruptedException {
        Thread.sleep(3000);
        nxtBtn.click();
        Thread.sleep(3000);
    }

    public void personalInfo() throws InterruptedException {

        Thread.sleep(3000);
        fthName.sendKeys(Random_data.fullName());

        Thread.sleep(2000);
        mthName.sendKeys(Random_data.fullName());

        Thread.sleep(2000);
        meritalSt.click();
        meritalSt.sendKeys("Married");


        Thread.sleep(2000);
        religSt.click();
        religSt.sendKeys("Islam");

        Thread.sleep(2000);
        spsName.sendKeys(Random_data.fullName());

        Thread.sleep(1000);
        height.click();
        height.sendKeys("5");

        Thread.sleep(1000);
        heigtInch.click();
        heigtInch.sendKeys("7");

        Thread.sleep(1000);
        weight.click();
        weight.sendKeys("62");
                
        Thread.sleep(2000);
        pnxtBtn.click();

    }

    public void ContuctInfo() throws InterruptedException
    {
        distBtn.click();
        Thread.sleep(2000);
        distBtn.sendKeys("FARIDPUR");


        Thread.sleep(2000);
        upozelaBtn.click();
        Thread.sleep(2000);
        upozelaBtn.sendKeys("MADHUKHALI");


        Thread.sleep(2000);
        unionBtn.click();
        Thread.sleep(2000);
        unionBtn.sendKeys("KAMARKHALI");
        Thread.sleep(2000);
        areaInput.sendKeys("Noapara");
        Thread.sleep(2000);
        houseInput.sendKeys(Random_data.address());
        Thread.sleep(2000);
        chkBox.click();
        Thread.sleep(2000);
        chkBox.click();

        Thread.sleep(2000);
        contactPname.sendKeys("Monsur Ali");
        Thread.sleep(2000);

        relationInput.click();
        relationInput.sendKeys("FATHER");

        Thread.sleep(2000);
        contactPmobile.sendKeys(Random_data.phoneNumber());

        Thread.sleep(2000);
        nxtCBtn.click();

    }

    public void NomineeInfo() throws InterruptedException
    {
        Thread.sleep(2000);
        nomineeEmpddlBtn.click();
        Thread.sleep(2000);
        nomineeEmpddlBtn.sendKeys("FATHER");

        Thread.sleep(2000);
        nomineeName.sendKeys(Random_data.fullName());

        Thread.sleep(2000);
        nomineeMOb.sendKeys(Random_data.phoneNumber());


        Thread.sleep(2000);
        nomineeFName.sendKeys(Random_data.fullName());


        Thread.sleep(2000);
        nomineeMName.sendKeys(Random_data.fullName());
        Thread.sleep(2000);


        Thread.sleep(2000);
        nomineenextbtn.click();

    }

    public void QualificationInfo() throws InterruptedException
    {
        Thread.sleep(2000);
        qulificatioDG.click();
        Thread.sleep(2000);
        qulificatioDG.sendKeys("B.Sc Engineering");

        qulificatioPassY.click();
        Thread.sleep(2000);
        qulificatioPassY.sendKeys("2005");


        Thread.sleep(2000);
        qulifiInstName.sendKeys("Dhaka Govt.");


        Thread.sleep(2000);
        qulifiBoard.click();
        Thread.sleep(2000);
        qulifiBoard.sendKeys("Rajshahi");


        Thread.sleep(2000);
        qulifiSubj.sendKeys("Computer Science and Engineering");


        Thread.sleep(2000);
        qulifiGrad.sendKeys("Grade A+");
        Thread.sleep(2000);


        Thread.sleep(2000);
        qulifiAddbtn.click();

        Thread.sleep(2000);
        qulifiRmvbtn.click();

        qulifiLang.click();
        Thread.sleep(2000);
        qulifiLang.sendKeys("Bangla");

        qulifiOral.click();
        Thread.sleep(2000);
        qulifiOral.sendKeys("Native");


        qulifiWrite.click();
        Thread.sleep(2000);
        qulifiWrite.sendKeys("Good");


        Thread.sleep(2000);
        qulifiLangAddbtn.click();

        Thread.sleep(2000);
        qulifiLangRmvbtn.click();

        Thread.sleep(2000);

    }


    public void DisreContry() throws InterruptedException {

        Thread.sleep(2000);
        qulifiDscountry.click();
        Thread.sleep(2000);

        qulifiDscountry2.sendKeys("Al");
        Thread.sleep(2000);
        qulifiDscountry2.sendKeys(Keys.ENTER);

        qulifipf.click();
        Thread.sleep(1000);
        qulifipf2.sendKeys("Au");
        Thread.sleep(1000);
        qulifipf2.sendKeys(Keys.ENTER);
    }


    public void QualifiNextBtn() throws InterruptedException {
        Thread.sleep(3000);
        qulifiNxtBtn.click();
        Thread.sleep(3000);
    }

    public boolean showmessage() {
        return message.isDisplayed();
    }

    public void ChkboxBtn() throws InterruptedException {
        Thread.sleep(2000);
        Chkbox.click();
    }

    public void PayBtn() throws InterruptedException {
        Thread.sleep(2000);
        PaymentBtn.click();
    }

    public void VendorBtn() throws InterruptedException {
        Thread.sleep(2000);
        VendorPayBtn.click();
    }

    public void CheckBoxPolicyBtn() throws InterruptedException {
        Thread.sleep(2000);
        CheckboxPolicy.click();
    }

    public void Pay_Button() throws InterruptedException {
        Thread.sleep(2000);
        Pay_btn.click();
    }

    public boolean MarchentPage() {
        return Marchent_Page.isDisplayed();
    }

    public void payment()throws InterruptedException
    {

        Thread.sleep(1000);
        mobileBankingBtn.click();

        Thread.sleep(1000);
        selectBkash.click();

        Thread.sleep(1000);
        successBtn.click();

    }


}
