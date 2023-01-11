package techproed.tests.smoketest.logintests;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class NegativeLoginTest {
    /*
    Name:
    Login screen error messages
    Description:
    User should see error message when user tries to log in with incorrect credentials
    Acceptance Criteria:
    As admin or customer, I should be able to see error message,
    when I provide a correct email address BUT incorrect password in a pop up window
    Error Message: Bad credentials
     */
    HomePage homePage;
    LoginPage loginPage;
    @Test
    public void negativeLoginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        homePage=new HomePage();
        loginPage=new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();
        ReusableMethods.waitFor(3);
        loginPage.userName.sendKeys("jack@gmail.com");
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys("abcd");
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(loginPage.errorMessage);

    }
}
