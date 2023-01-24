package utility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonFunctions {
   static WebDriverWait  wait;
    public static WebElement waitForElementVisibility(AppiumDriver driver, WebElement element, long time){
        wait=new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.pollingEvery(Duration.ofMillis(200));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForElementVisibility(AppiumDriver driver, AppiumBy loctor, long time){
        wait=new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loctor));
    }
    public static WebElement waitForElementVisibility(AppiumDriver driver, WebElement element){
        wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
