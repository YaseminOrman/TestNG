package techproed.tests.smoketest.logintests;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class ValidAndInvalidEmailTest {
    /*
    Name:
    Login screen error messages
    Description:
    User should see error message when an invalid email is entered
    Acceptance Criteria:
    As admin or customer, I should be able to see error message, when I do not provide a complete valid email address in email address box
    Error Message: email must be a valid email
    When I enter a valid email domain, then I should not see the error message
    https://email-verify.my-addr.com/list-of-most-popular-email-domains.php
     */
    HomePage homePage;
    LoginPage loginPage;
    @Test
    public void invalidEmailTest(){
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        homePage=new HomePage();
        loginPage=new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();
        ReusableMethods.waitFor(3);
        loginPage.userName.sendKeys("jack");
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(loginPage.invalidEmailMessage);

    }
    @Test
    public void validEmailTest(){
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        homePage=new HomePage();
        loginPage=new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();
        ReusableMethods.waitFor(3);
        loginPage.userName.sendKeys("jack@gmail.com");
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementNotDisplayed(loginPage.invalidEmailMessage);
    }
}
