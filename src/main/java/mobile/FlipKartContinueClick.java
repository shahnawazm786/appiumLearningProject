package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FlipKartContinueClick {
    public static void main(String[] args) throws MalformedURLException,Exception {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        //capabilities.setCapability("automationName","UiAutomator1");
//
        capabilities.setCapability("appPackage","com.flipkart.android");
        capabilities.setCapability("appActivity","com.flipkart.android.activity.HomeFragmentHolderActivity");
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.findElement(By.xpath("(//android.widget.TextView)[9]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text=\"CONTINUE\"]")).click();

    }
}
