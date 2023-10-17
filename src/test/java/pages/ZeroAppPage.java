package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroAppPage {
    public ZeroAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//button[@id='signin_button']")
    public WebElement sigInButtonAnaSayfa;
@FindBy(xpath = "//input[@name='user_login']")
    public WebElement loginUsername;
@FindBy(xpath = "//input[@name='user_password']")
    public WebElement passwordLogin;
@FindBy(xpath = "//input[@name='submit']")
    public WebElement signInButtonRegister;
@FindBy(xpath = "//li[@id='onlineBankingMenu']")
    public WebElement onlineBankingLink;
@FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillsLink;
@FindBy(xpath = "//input[@id='sp_amount']")
    public WebElement amountGir;
@FindBy(xpath = "//input[@id='sp_date']")
    public WebElement dateGir;
@FindBy(xpath = "//input[@id='pay_saved_payees']")
    public WebElement payButton;
@FindBy(xpath = "//div[@id='alert_content']")
    public WebElement basariliGirisYapildi;

}
