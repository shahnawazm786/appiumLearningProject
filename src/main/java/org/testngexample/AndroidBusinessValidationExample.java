package org.testngexample;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidBusinessValidationExample {
    AppiumDriver driver;
   @BeforeClass
   public void setup() throws MalformedURLException {

       DesiredCapabilities capabilities=new DesiredCapabilities();
       capabilities.setCapability("deviceName","vivo 1920");
       capabilities.setCapability("udid","26976198");
       capabilities.setCapability("platformName","Android");
       capabilities.setCapability("platformVersion","12");

       capabilities.setCapability("appPackage","io.appium.android.apis");
       capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
       capabilities.setCapability("noReset","true");
      driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

   }


    @Test
    public void verifyVeiwOptionText(){
        WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
        String textOFView=ele.getText();
        Assert.assertEquals("Views",textOFView);

    }
    @Test
    public void verifyAccessibilityOptionText(){
        WebElement ele = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        String text=ele.getText();
        Assert.assertEquals("Accessibility",text);

    }

    @Test
    public void verifyAnimationOptionText(){
        WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
        String text=ele.getText();
        Assert.assertEquals("Anmate",text);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
       //driver.close();
    }

}
