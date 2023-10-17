package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeroAppPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ZeroAppTest {
    //1. http://zero.webappsecurity.com sayfasina gidin
    //2. Signin buttonuna tiklayin
    //3. Login alanina  “username” yazdirin
    //4. Password alanina “password” yazdirin
    //5. Sign in buttonuna tiklayin
    //6. Back tusu ile sayfaya donun
    //7. Online Banking menusunden Pay Bills sayfasina gidin
    //8. amount kismina yatirmak istediginiz herhangi bir miktari yazi
    //9. tarih kismina “2020-09-10” yazdirin
    //10. Pay buttonuna tiklayin
    //11. “The payment was successfully submitted.” mesajinin ciktigini test edin
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("zeroAppUrl"));
        ZeroAppPage zeroAppPage = new ZeroAppPage();
        zeroAppPage.sigInButtonAnaSayfa.click();
        Faker faker = new Faker();
        zeroAppPage.loginUsername.sendKeys("username");
        zeroAppPage.passwordLogin.sendKeys("password");
        zeroAppPage.signInButtonRegister.click();
        Driver.bekle(2);
        Driver.getDriver().navigate().back();
        zeroAppPage.onlineBankingLink.click();
        zeroAppPage.payBillsLink.click();
        zeroAppPage.amountGir.sendKeys("2000");
        zeroAppPage.dateGir.sendKeys("2020-09-10");
        zeroAppPage.payButton.click();
        Assert.assertTrue(zeroAppPage.basariliGirisYapildi.isDisplayed());

    }
}
