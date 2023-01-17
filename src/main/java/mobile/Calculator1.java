package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator1 {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("appium:appPackage","com.android.bbkcalculator");
        capabilities.setCapability("appActivity",".Calculator");
        capabilities.setCapability("appium:deviceName","vivo 1920");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:platformVersion","12");
        //
        capabilities.setCapability("appium:udid","26976198");

        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
    }
}
