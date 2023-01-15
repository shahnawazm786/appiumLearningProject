package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {


    public static void main(String[] args) {

    }
    public static void openCalculatorDevice() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","12");

        capabilities.setCapability("appPackage","com.android.bbkcalculator");
        capabilities.setCapability("appActivity","com.android.bbkcalculator.Calculator");
        AppiumDriver<WebElement> driver = new AppiumDriver<WebElement>(new URL("http://target_ip:used_port/wd/hub"),capabilities);

    }
}
