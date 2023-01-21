package techproed.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.pages.SaucedemoHomePage;
import techproed.pages.SaucedemoProductsPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.JSUtils;

import static org.testng.AssertJUnit.assertEquals;

public class SaucedemoPrice {
    /*
  Given
    Go to  https://www.saucedemo.com/
  When
    Enter the username  as "standard_user"
  And
    Enter the password as "secret_sauce"
  And
    Click on login button
  Then
    Assert that total price of all products is 129.94 dollars
  And
    Flash each web element you used
   */
    @Test
    public void totalPrice(){
//        Go to  https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("sauce_demo_url"));
//        Enter the username  as "standard_user"
        SaucedemoHomePage saucedemoHomePage = new SaucedemoHomePage();
        saucedemoHomePage.usernameInput.sendKeys("standard_user");
//        Enter the password as "secret_sauce"
        saucedemoHomePage.passwordInput.sendKeys();
//        Click on login button
//        Then
//        Assert that total price of all products is 129.94 dollars
//                And
//        Flash each web element you used
    }

}