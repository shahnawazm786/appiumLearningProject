package mobile;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class APIDemoAPPsExample {
    public static void main(String[] args) throws MalformedURLException,Exception {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");

        capabilities.setCapability("appPackage","io.appium.android.apis");
        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        capabilities.setCapability("noReset","true");
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]")).click();
        Thread.sleep(2000);
        driver.navigate().back();

        List<WebElement> elementList=driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]"));
        driver.findElement(AppiumBy.accessibilityId(""));
        for(WebElement ele: elementList){
            ele.click();
            Thread.sleep(5);
            driver.navigate().back();
            Thread.sleep(5);
        }

    }
}
