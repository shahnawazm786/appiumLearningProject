package org.testngexample;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class TestExample {
    @Test
    public void Test_Case01() throws Exception{
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appium:appPackage","com.escodro.alkaa");
        capabilities.setCapability("appActivity","com.escodro.alkaa.presentation.MainActivity");
        capabilities.setCapability("noReset","true");
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        Thread.sleep(1000);
        driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@index=\"0\"])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.xpath("(//android.widget.Button[@index=\"1\"])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("First Appium Project2");
        Thread.sleep(1000);
    }
}
