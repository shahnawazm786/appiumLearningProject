package mobile;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.concurrent.ThreadLocalRandom.current;

public class GetScreenShotExample {
    public static void main(String[] args) throws Exception{
        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability("deviceName","vivo 1920");
        capabilities.setCapability("udid","26976198");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appium:appPackage","io.appium.android.apis");
        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        capabilities.setCapability("noReset","true");
        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        Thread.sleep(1000);
        System.out.println("Take the screenshot");
        driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
        File file= (File) driver.getScreenshotAs(OutputType.FILE);
        //TakesScreenshot file1 = (TakesScreenshot) driver.getScreenshotAs(OutputType.FILE);
        int number= ThreadLocalRandom.current().nextInt();
        System.out.println(number);
        String file_name="mobile"+number+".png";
        FileUtils.copyFile(file,new File("./screenshot_mobile/"+file_name));
        System.out.println("Finished..............");
    }

}
