package page;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonFunctions;


public class ViewPage {
    AppiumDriver driver;

public  ViewPage(AppiumDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}
// Members
    @CacheLookup
   @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility\"]")
    private WebElement accessibility;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
    private WebElement animation;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
    private  WebElement app;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Content\"]")
    private  WebElement content;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Graphics\"]")
    private  WebElement graphics;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Media\"]")
    private WebElement media;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"NFC\"]")
    private WebElement nfc;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"OS\"]")
    private  WebElement os;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Preference\"]")
    private  WebElement preference;
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Text\"]")
    private  WebElement text;
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]")
    private  WebElement views;

    public void tapAccessibilityElement(){
        CommonFunctions.waitForElementVisibility(driver,accessibility,2);
        accessibility.click();
    }
    public void tapAnimationElement(){


        animation.click();
    }
    public void tapAppElement(){
        app.click();
    }
    public void tapContentElement(){
        content.click();
    }
    public void tapGraphicsElement(){
        graphics.click();
    }
    public void tapMediaElement(){
        media.click();
    }
    public void tapNFClement(){
        nfc.click();
    }
    public void tapOSElement(){
        os.click();
    }
    public void tapPreferenceElement(){
        preference.click();
    }
    public void tapTextElement(){
        text.click();
    }
    public void tapViewsElement(){
        views.click();
    }
}
