package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "APjFqb")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//button[@id='W0wltc']")
    public WebElement cookieReddet;
    @FindBy(xpath = "//*[@class='DFlfde SwHCTb']")
    public WebElement sonucSayiElement;
}
