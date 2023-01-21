package org.extentreportsdemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtenReportExample {
ExtentSparkReporter htmlReporter;
ExtentReports reports;
@BeforeSuite
    public void setup(){
    htmlReporter=new ExtentSparkReporter("extent-report.html");
    reports=new ExtentReports();
    reports.attachReporter(htmlReporter);
}
@Test
    public void TestCase001(){
    System.out.println("First Test Case001");
    System.out.println("First Test Case001");
    System.out.println("First Test Case001");
}
    @Test
    public void TestCase002(){
        System.out.println("Second Test Case001");
        System.out.println("Second Test Case001");
        System.out.println("Second Test Case001");
    }
    @Test
    public void TestCase003(){
        System.out.println("Third Test Case001");
        System.out.println("Third Test Case001");
        System.out.println("Third Test Case001");
    }

    @AfterSuite
    public void tearDown(){
    reports.flush();
    }

}
