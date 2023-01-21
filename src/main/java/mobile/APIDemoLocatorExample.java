package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class APIDemoLocatorExample {
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
        // by using index
        driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        // by using content-desc
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
        Thread.sleep(2000);
        driver.navigate().back();



    }
}
