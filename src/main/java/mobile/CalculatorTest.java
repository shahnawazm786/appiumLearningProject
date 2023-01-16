package mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {


    public static void main(String[] args) throws MalformedURLException {
        openCalculatorDevice();
    }
    public static void openCalculatorDevice() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appPackage","com.android.bbkcalculator");
        capabilities.setCapability("appActivity","com.android.bbkcalculator.Calculator");
        AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        //WebDriver driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
}
