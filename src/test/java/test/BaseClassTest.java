package test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClassTest {
    public static AppiumDriver driver;
    public static DesiredCapabilities capabilities;
    @BeforeTest
    public void setup() throws Exception{
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appPackage","io.appium.android.apis");
        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        capabilities.setCapability("noReset","true");

    }
    @BeforeMethod
    public void setDriver() throws MalformedURLException {
        driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public AppiumDriver getDriver() throws Exception {
    //    setup();
        return driver;
    }

   // @AfterClass
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

}
