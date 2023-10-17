package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleParaCeviri {
    // ilgili kurulumlari tamamlayalim
    // Kullanici https://www.google.com adresine gider
    // Çıkıyorsa Kullanici cookies i kabul eder
    // Arama Kutusuna karşilastirma yapmak istedigi para birimlerini girer
    // Para birimlerinin karsilastirmasini alin
    // Karsilastirilacak olan para biriminin 28 den kucuk oldugu test edilir
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        GooglePage googlePage = new GooglePage();
        googlePage.cookieReddet.click();
        googlePage.aramaKutusu.sendKeys("USD TO TL"+ Keys.ENTER);
        String sonucSayiStr= googlePage.sonucSayiElement.getText().replace(",",".");
        double sonuc = Double.parseDouble(sonucSayiStr);
        Assert.assertTrue(sonuc<28);
    }
}
