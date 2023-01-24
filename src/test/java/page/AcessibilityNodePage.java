package page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonFunctions;

public class AcessibilityNodePage {
    AppiumDriver appiumDriver;
    public AcessibilityNodePage(AppiumDriver driver){
        this.appiumDriver=driver;
        PageFactory.initElements(appiumDriver,this);
    }
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")
    private WebElement linkAccessibilityNode;

    public void clickOnLink(){
        CommonFunctions.waitForElementVisibility(appiumDriver,linkAccessibilityNode,30);
        linkAccessibilityNode.click();
    }
}
