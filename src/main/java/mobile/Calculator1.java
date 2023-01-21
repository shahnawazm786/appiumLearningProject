package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator1 {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        //capabilities.setCapability("appium:appPackage","com.android.bbkcalculator");
        //capabilities.setCapability("appActivity",".Calculator");
        capabilities.setCapability("browserName","chrome");
        capabilities.setCapability("appium:deviceName","Redmi Note 8 Pro");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:platformVersion","12.5.10");
        //
        capabilities.setCapability("appium:udid","jzz57xbqcqtw7xi7");
        capabilities.setCapability("chromedriverExecutable", "C:\\Users\\shahn\\OneDrive\\Desktop\\android-sdk\\chromedriver\\chromedriver.exe");
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        driver.get("https://www.amazon.in/");
    }
}
