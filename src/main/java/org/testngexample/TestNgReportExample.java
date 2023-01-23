package org.testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgReportExample {
    @Test
    public void Test(){
        System.out.println("First Test");
    }
    @Test
    public void Test1(){
        Assert.assertFalse(false);
    }
    @Test
    public void Test2(){
        Assert.assertFalse(false);
    }
}
