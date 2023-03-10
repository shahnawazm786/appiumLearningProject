package mobile.sccrollexample;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;

public class ScrolltoElementExample {
    @Test
    public void scrollToElement() throws Exception{
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appium:appPackage","io.appium.android.apis");
        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        capabilities.setCapability("noReset","true");
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        Thread.sleep(1000);

        WebElement linkSearchView = driver.findElement(AppiumBy.accessibilityId("Search View"));

        Thread.sleep(1000);
        //driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Filter\"]")).click();
        // search
        //driver.findElement(AppiumBy.id("android:id/search_src_text")).sendKeys("Appium Class");
        Thread.sleep(5000);
    }
}
