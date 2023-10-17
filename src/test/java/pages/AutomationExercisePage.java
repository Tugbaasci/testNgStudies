package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signUpLoginElementi;
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignUpElementi;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement nameLoginElement;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailElement;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButton;
    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterInformationElement;
    @FindBy(xpath = "(//input[@name='title'])[2]")
    public WebElement genderTitle;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameAccountElement;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAccountElement;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordAccountElement;
    @FindBy(xpath = "//select[@data-qa='days']")
    public WebElement dropDownDayElement;
    @FindBy(xpath = "//select[@data-qa='months']")
    public WebElement dropDownMonthsElement;
    @FindBy(xpath = "//select[@data-qa='years']")
    public WebElement dropDownYearsElement;
    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement signUpCheckBoxElement;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement partnerOfferCheckBoxElement;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement nameRegisterElement;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameRegisterElement;
    @FindBy(xpath = "//input[@id='address1']")
    public WebElement addressRegisterElement;
    @FindBy(xpath = "//select[@data-qa='country']")
    public WebElement countryCheckBoxElement;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateRegisterElement;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityRegisterElement;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcodeRegiterElement;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileRegisterElement;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButtonElement;
    @FindBy(xpath = "//h2[@data-qa='account-created']")
    public WebElement accountCreatedElement;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButtonElement;
    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement closeAdvertisementElement;
    @FindBy(xpath = " //*[text()=' Logged in as ']")
    public WebElement loggedInAsElementi;
    @FindBy(xpath = " //*[text()=' Delete Account']")
    public WebElement deleteAccountElement;
    @FindBy(xpath = "//*[b='Account Deleted!']")
    public WebElement accounDeletedElement;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButtonAfterDelete;
    @FindBy(xpath = "//iframe[@title='Advertisement']")
    public WebElement iframeAdvertisementElement;


}
