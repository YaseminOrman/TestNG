package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class ZYXBankPage {
    public ZYXBankPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//button[@ng-click='manager()']")
    public WebElement BankManagerLogin;

    @FindBy(xpath ="//button[@ng-class='btnClass1']")
    public WebElement AddCostumer;

    @FindBy(xpath ="//input[@ng-model='fName']")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@ng-model='lName']")
    public WebElement LastName;

    @FindBy(xpath = "//input[@ng-model='postCd']")
    public WebElement PostCode;

    @FindBy(xpath = "//button[text()='Add Customer']")
    public WebElement AddCostumerSubmit;

    @FindBy(xpath = "//button[text()='Customer Login']")
    public WebElement costumerLoginButton;

    @FindBy(id="userSelect")
    public WebElement yourNameDD;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;


}
