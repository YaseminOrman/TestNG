package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class ZYXAccountPage {
   public ZYXAccountPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(xpath = "//button[@ng-class='btnClass2']")
   public WebElement OpenAccountButton;

   @FindBy(id="userSelect")
    public WebElement CostumerDropdown;

    @FindBy(id="currency")
    public WebElement currencyDropDown;

    @FindBy(xpath = "//button[text()='Process']")
    public WebElement processButton;


}
