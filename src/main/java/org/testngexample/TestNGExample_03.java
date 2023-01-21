package org.testngexample;

import org.testng.annotations.*;

public class TestNGExample_03 {

    //@BeforeSuite ->
    // @BeforeTest ->
    // @BeforeClass ->
    // @BeforeMethod ->
    // @Test ->
    // @AfterMethod ->
    // @AfterClass ->
    // @AfterCTest ->
    // @AfterSuite
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void Test(){
        System.out.println("Test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
