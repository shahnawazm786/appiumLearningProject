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

        //
    }

    //Example of Xpath
    // Atrribute is -> Index
    public static void findElementByIndex(AppiumDriver driver){
        List<WebElement> elements = driver.findElements(AppiumBy.xpath("//android.widget.TextView[@index='0']"));
        System.out.println("Size is"+ elements.size());
    }
}
