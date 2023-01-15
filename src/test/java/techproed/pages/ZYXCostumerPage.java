package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class ZYXCostumerPage {

    public ZYXCostumerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    public WebElement costumersButton;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> numberOfCustomerRows;

    @FindBy(xpath = "//button[@class='btn home']")
    public WebElement homeButton;
}
