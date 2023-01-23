package page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ViewPage {
    AppiumDriver driver;

public  ViewPage(AppiumDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);

}
// Members
    WebElement accessibility=driver.findElement(AppiumBy.accessibilityId("Accessibility"));
    WebElement animation=driver.findElement(AppiumBy.accessibilityId("Animation"));
    WebElement app=driver.findElement(AppiumBy.accessibilityId("App"));
    WebElement content=driver.findElement(AppiumBy.accessibilityId("Content"));
    WebElement graphics=driver.findElement(AppiumBy.accessibilityId("Graphics"));
    WebElement media=driver.findElement(AppiumBy.accessibilityId("Media"));
    WebElement nfc=driver.findElement(AppiumBy.accessibilityId("NFC"));
    WebElement os=driver.findElement(AppiumBy.accessibilityId("OS"));
    WebElement preference=driver.findElement(AppiumBy.accessibilityId("Preference"));
    WebElement text=driver.findElement(AppiumBy.accessibilityId("Text"));
    WebElement views=driver.findElement(AppiumBy.accessibilityId("Views"));

//
    public void tapAccessibilityElement(){
        accessibility.click();
    }
    public void tapAnimationElement(){
        animation.click();
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
