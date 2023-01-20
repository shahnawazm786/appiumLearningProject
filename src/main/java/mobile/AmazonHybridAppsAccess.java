package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonHybridAppsAccess {
    public static void main(String[] args) throws MalformedURLException,Exception {
        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("browserName","chrome");
        capabilities.setCapability("chromedriverExecutable","C:\\Users\\shahn\\OneDrive\\Desktop\\android-sdk\\chromedriver\\chromedriver.exe");
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        driver.get("https://www.amazon.in/");
        Thread.sleep(10000);
        driver.close();

    }
}
