package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase1 {
    @Test
    public void test01(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        //4. Click on 'Signup / Login' button
        //5. Verify 'New User Signup!' is visible
        //6. Enter name and email address
        //7. Click 'Signup' button
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        //9. Fill details: Title, Name, Email, Password, Date of birth
        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Driver.getDriver().get(ConfigReader.getProperty("exercisePageUrl"));
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://automationexercise.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.signUpLoginElementi.click();
        Assert.assertTrue(automationExercisePage.newUserSignUpElementi.isDisplayed());
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String email=faker.internet().emailAddress();
        automationExercisePage.nameLoginElement.sendKeys(name);
        automationExercisePage.emailElement.sendKeys(email);
        automationExercisePage.signUpButton.click();
        automationExercisePage.genderTitle.click();
        automationExercisePage.passwordAccountElement.sendKeys(faker.internet().password());
        Select select = new Select(automationExercisePage.dropDownDayElement);
        select.selectByValue("22");
        Select select1 = new Select(automationExercisePage.dropDownMonthsElement);
        select1.selectByValue("2");
        Select select2 = new Select(automationExercisePage.dropDownYearsElement);
        select2.selectByValue("1984");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(automationExercisePage.signUpCheckBoxElement,Keys.PAGE_DOWN)
                .click(automationExercisePage.signUpCheckBoxElement)
                .click(automationExercisePage.partnerOfferCheckBoxElement)
                .perform();
        automationExercisePage.nameRegisterElement.sendKeys(faker.name().firstName());
        automationExercisePage.lastNameRegisterElement.sendKeys(faker.name().lastName());
        automationExercisePage.addressRegisterElement.sendKeys(faker.address().streetAddress());
        Select select3=new Select(automationExercisePage.countryCheckBoxElement);
        select3.selectByVisibleText("Canada");
        automationExercisePage.stateRegisterElement.sendKeys(faker.address().state());
        automationExercisePage.cityRegisterElement.sendKeys(faker.address().city());
        automationExercisePage.zipcodeRegiterElement.sendKeys(faker.address().zipCode());
        automationExercisePage.mobileRegisterElement.sendKeys(faker.phoneNumber().phoneNumber());
        automationExercisePage.createAccountButtonElement.click();
        Assert.assertTrue(automationExercisePage.accountCreatedElement.isDisplayed());
        Driver.bekle(2);
        automationExercisePage.continueButtonElement.click();
        //Driver.getDriver().switchTo().frame(automationExercisePage.iframeAdvertisementElement);
        //automationExercisePage.closeAdvertisementElement.click();
        //Driver.bekle(2);
        //Driver.getDriver().switchTo().defaultContent();
        //Assert.assertTrue(automationExercisePage.loggedInAsElementi.isDisplayed());
        //automationExercisePage.deleteAccountElement.click();
        //Assert.assertTrue(automationExercisePage.accounDeletedElement.isDisplayed());
        //automationExercisePage.continueButtonAfterDelete.click();
        Driver.closeDriver();
    }

}
