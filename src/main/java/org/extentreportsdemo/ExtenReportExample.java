package org.extentreportsdemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class ExtenReportExample {
ExtentSparkReporter htmlReporter;
ExtentReports reports;
static ExtentTest logger;
@BeforeSuite
    public void setup(){
    htmlReporter=new ExtentSparkReporter("test-output/extent-reports/index.html");
    reports=new ExtentReports();
    reports.attachReporter(htmlReporter);
    reports.setSystemInfo("Suite name -  ","Appium Automation Report");
    reports.setSystemInfo("System - ","Windows");
    reports.setSystemInfo("Reported - ","Mohammad Shahnawaz");


}
@Test
    public void TestCase001(){
    logger=reports.createTest("Search Test -01 ");
    logger.createNode("Search Test for iPhone device");
    System.out.println("First Test Case001");
    System.out.println("First Test Case001");
    System.out.println("First Test Case001");
    Assert.assertTrue(true);

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

    }
    @Test
    public void TestCase003(){
        logger=reports.createTest("Search Test - 03");
        logger.createNode("Search Test for OnePhone mobile ");
        System.out.println("Third Test Case001");
        System.out.println("Third Test Case001");
        System.out.println("Third Test Case001");
        Assert.assertFalse(true);

    }

    @AfterSuite
    public void tearDown(){
    reports.flush();
    }

}
