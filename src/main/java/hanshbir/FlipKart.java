package hanshbir;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class FlipKart  {
    public static void main(String[] args) throws MalformedURLException,Exception {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","Redmi Note 8 Pro");
        capabilities.setCapability("udid","jzz57xbqcqtw7xi7");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","11");
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

