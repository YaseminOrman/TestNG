package techproed.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.ZYXAccountPage;
import techproed.pages.ZYXBankPage;
import techproed.pages.ZYXCostumerPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class ZYXBankTest {
    @Test
    public void test() {
        //Open 5 Accounts, deposit 100 USD and withdraw 100 USD from any account and delete all accounts.
//            Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
        Driver.getDriver().get(ConfigReader.getProperty("xyzBank_URL"));
//            Click on "Bank Manager Login" button
        ZYXBankPage zyxBankPage = new ZYXBankPage();
        zyxBankPage.BankManagerLogin.click();
//            Click on "Add Customer" button
        zyxBankPage.AddCostumer.click();
//            Fill inputs and click on "Add Customer" submit butt Accept alert
//            Add 4 more customers
        Faker faker = new Faker();
       for(int i=0;i<5;i++) {
           zyxBankPage.FirstName.sendKeys(faker.name().firstName());
           zyxBankPage.LastName.sendKeys(faker.name().lastName());
           zyxBankPage.PostCode.sendKeys(faker.address().zipCode());
           zyxBankPage.AddCostumerSubmit.click();

           try {
               Driver.getDriver().switchTo().alert().accept();
           }catch (Exception ignored){

           }
       }
//            Click on "Open Account"  button
        ZYXAccountPage zyxAccountPage = new ZYXAccountPage();
       zyxAccountPage.OpenAccountButton.click();
//            Click on "Customer" dropdown
       Select costumerDropdown =new Select(zyxAccountPage.CostumerDropdown);
       Select currencyDD = new Select(zyxAccountPage.currencyDropDown);
//            Select customer name  Open 4 more accounts
        for(int i=6;i<11;i++) {
            costumerDropdown.selectByIndex(6);
//            Click on "Currency" dropdown  and Select "Dollar
            currencyDD.selectByIndex(1);
//            Click on "Process" button
            zyxAccountPage.processButton.click();
//            Accept alert
            try {
                Driver.getDriver().switchTo().alert().accept();
            } catch (Exception ignored) {

            }
        }
//            Click on "Customers" button
        ZYXCostumerPage zyxCostumerPage = new ZYXCostumerPage();
        zyxCostumerPage.costumersButton.click();
//            Count table row numbers
        int numberOfCustomerRows= zyxCostumerPage.numberOfCustomerRows.size();
//            Assert that you created 5 customers
        Assert.assertEquals(10,numberOfCustomerRows);
//            Click on "Home" button
        zyxCostumerPage.homeButton.click();
//            Click on "Customer Login" button
        zyxBankPage.costumerLoginButton.click();
//            Click on "Your Name" dropdown
        Select yourNameDD= new Select(zyxBankPage.yourNameDD);
//            Select  any name you created
        yourNameDD.selectByIndex(6);
//            Click on "Login" button
        zyxBankPage.loginButton.click();
//            Click on "Deposit" button

//            Type 100 into "Amount to be Deposited" input
//        Then
//            Assert that "Deposit Successful" is displayed
//        And
//            Click on "Deposit"(Submit) button
//        And
//            Click on "Withdrawal" button
//        And
//            Type 100 into "Amount to be Withdrawn" input
//        And
//            Click on "Withdraw"(Submit) button
//        Then
//            Assert that "Transaction  Successful" is displayed
//        When
//            Click on "Logout" button
//        And
//            Click on "Home" button
//        And
//            Click on "Bank Manager Login" button
//        And
//            Click on "Customers" button
//        And
//            Click on each "Delete" button
//        And
//            Count table row numbers
//        Then
//            Assert that number of customers is 0
//
    }

}
