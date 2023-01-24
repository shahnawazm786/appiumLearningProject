package test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import page.ViewPage;

import java.net.URL;
import java.time.Duration;

 class BaseClassTest {
 private static AppiumDriver driver=null;
 //AppiumDriver driver=null;
 ViewPage viewPage;
    @BeforeClass
    public void setup() throws Exception{
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage","io.appium.android.apis");
        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        capabilities.setCapability("noReset","true");
        driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }




     @AfterClass
     public void tearDown(){
         driver.quit();
     }
    //@Test
    public AppiumDriver getDriver(){
    return  this.driver;
    }








}
