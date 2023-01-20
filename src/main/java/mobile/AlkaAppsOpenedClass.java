package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AlkaAppsOpenedClass {
    public static void main(String[] args) throws MalformedURLException,InterruptedException {
        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appium:appPackage","com.escodro.alkaa");
        capabilities.setCapability("appium:appActivity","com.escodro.alkaa.presentation.MainActivity");
        /*
        "appium:appPackage": "com.escodro.alkaa",
        "appium:appActivity":"com.escodro.alkaa.presentation.MainActivity"
         */
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        Thread.sleep(10000);

    }
}
