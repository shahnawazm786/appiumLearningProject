package mobile;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;

public class ElementByXpathExample {
    public static void main(String[] args) throws Exception{
        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appium:appPackage","io.appium.android.apis");
        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        capabilities.setCapability("noReset","true");
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        Thread.sleep(1000);
        findElementByIndex(driver);
        findElementByContentDesc(driver);
        findElementByAccessibility(driver);

        //
    }

    //Example of Xpath
    // Atrribute is -> Index
    public static void findElementByIndex(AppiumDriver driver){
        List<WebElement> elements = driver.findElements(AppiumBy.xpath("//android.widget.TextView[@index='0']"));
        System.out.println("\"Index\" Size is -> "+ elements.size());
    }
    //Example of Xpath
    // Atrribute is -> Content-Desc
    public static void findElementByContentDesc(AppiumDriver driver){
        List<WebElement> elements =driver.findElements(AppiumBy.xpath("//android.widget.TextView[@content-desc='Accessibility']"));
        System.out.println("\"Content-Desc\" Size is -> "+ elements.size());
    }
    //Example of Xpath
    // Atrribute is -> Accessibility
    public static void findElementByAccessibility(AppiumDriver driver){
        List<WebElement> elements =driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='Accessibility']"));
        System.out.println("\"Accessibility\" Size is -> "+ elements.size());
    }

    //Example of Xpath
    // Atrribute is -> resource-id
    public static void findElementByResourceId(AppiumDriver driver){
        List<WebElement> elements =driver.findElements(AppiumBy.xpath(""));
        System.out.println("\"resource-id\" Size is -> "+ elements.size());
    }
}
