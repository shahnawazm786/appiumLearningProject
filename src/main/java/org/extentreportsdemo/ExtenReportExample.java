package org.extentreportsdemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ExtenReportExample {
ExtentSparkReporter htmlReporter;
ExtentReports reports;
static ExtentTest logger;
AppiumDriver driver;
@BeforeSuite
    public void suitesetup(){
    htmlReporter=new ExtentSparkReporter("AutomationReport/Reports/index.html");
    reports=new ExtentReports();
    reports.attachReporter(htmlReporter);
    reports.setSystemInfo("Suite name -  ","Appium Automation Report");
    reports.setSystemInfo("System - ","Windows");
    reports.setSystemInfo("Reported - ","Mohammad Shahnawaz");
    reports.setSystemInfo("Batch - ","Appium Batch");



}
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
        logger=reports.createTest("Validate the View Text");
        logger.createNode("Validate Text");
        logger.log(Status.INFO, "Element is to be searched");
        WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
        logger.log(Status.INFO, "Element found");
        logger.log(Status.INFO, "Element text");
        String textOFView=ele.getText();
        logger.log(Status.INFO, "Element text get");
        Assert.assertEquals("Views",textOFView);
        logger.log(Status.PASS, "Text Found");

    }
    @Test
    public void verifyAccessibilityOptionText(){
        logger=reports.createTest("Validate the Accessibility Text");
        logger.createNode("Validate Text");
        logger.log(Status.INFO,"By accessibility");
        WebElement ele = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        logger.log(Status.INFO,"Element found");
        logger.log(Status.INFO,"Element text got");
        String text=ele.getText();
        logger.log(Status.INFO,"Found element text");
        logger.log(Status.INFO,"Validate text");
        Assert.assertEquals("Accessibility",text);
        logger.log(Status.PASS,"Validate text");

    }

    @Test
    public void verifyAnimationOptionText() throws IOException {
        logger=reports.createTest("Validate the Animation Text");
        logger.createNode("Validate Text");
        logger.log(Status.INFO,"By accessibility");
        WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
        String text=ele.getText();
        File file= (File) driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./AutomationReport/Reports/1.png"));
        logger.log(Status.FAIL,logger.addScreenCaptureFromPath("1.png")+"Image");
        Assert.assertEquals("Anmate",text);



    }

@Test
    public void TestCase001(){
    logger=reports.createTest("Search Test -01 ");
    logger.createNode("Search Test for iPhone device");
    System.out.println("First Test Case001");
    System.out.println("First Test Case001");
    System.out.println("First Test Case001");
    Assert.assertTrue(true);

    logger.log(Status.INFO,"Test method - 01");
    logger.log(Status.INFO, "iPhone Device");
    logger.log(Status.INFO, "Searching iPhone - search");

    // Using Labels
    logger.log(Status.INFO, MarkupHelper.createLabel("*************** Using Labels ***************", ExtentColor.GREEN));
    logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 1", ExtentColor.YELLOW));
    logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 2", ExtentColor.LIME));
    logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 3", ExtentColor.INDIGO));
    logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 4", ExtentColor.ORANGE));

}
    @Test
    public void TestCase002(){
        logger=reports.createTest("Search Test -02");
        logger.createNode("Search Test for Samsung mobile");
        Assert.assertTrue(true);

        logger.log(Status.INFO,"Test method - 02");
        logger.log(Status.INFO, "Mobile Search");
        logger.log(Status.INFO, "Searching mobile in search text box");

        // Using Labels
        logger.log(Status.INFO, MarkupHelper.createLabel("*************** Using Labels ***************", ExtentColor.RED));
        logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 1", ExtentColor.ORANGE));
        logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 2", ExtentColor.BLUE));
        logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 3", ExtentColor.CYAN));
        logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 4", ExtentColor.AMBER));
        logger.log(Status.FAIL,logger.addScreenCaptureFromPath("1.png")+"Image");
    }
    @Test
    public void TestCase003(){
        logger=reports.createTest("Search Test - 03");
        logger.createNode("Search Test for OnePhone mobile ");
        logger.log(Status.INFO,"Test method - 03");
        logger.log(Status.INFO, "One Phone Device");
        logger.log(Status.INFO, "Searching OnePhone - search");
        logger.log(Status.INFO, MarkupHelper.createLabel("*************** Using Labels ***************", ExtentColor.GREEN));
        logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 1", ExtentColor.YELLOW));
        logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 2", ExtentColor.LIME));
        logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 3", ExtentColor.INDIGO));
        logger.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 4", ExtentColor.ORANGE));

        Assert.assertFalse(false);
        File file=new File("screenshot_mobile/mobile1.png");
        String dest=file.getAbsolutePath();
        System.out.println(dest);
        logger.log(Status.FAIL,logger.addScreenCaptureFromPath("1.png")+"Image");

 // Using Labels


    }

    @AfterSuite
    public void tearDown(){
    reports.flush();
    driver.quit();
    }

}
