package mobile;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AccessibilityIDExample {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appium:appPackage","io.appium.android.apis");
        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        capabilities.setCapability("noReset","true");
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        Thread.sleep(10000);
        driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
        Thread.sleep(20000);
        // return the web element using accessibilityId
        WebElement element = driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider"));

        String elementText=element.getText();
        System.out.println(elementText);
        if(elementText.equalsIgnoreCase("Accessibility Node Provider")){

            System.out.println("Both the string is same");
        }
        else {
            System.out.println("Both the string is not same");
        }


    }
}
