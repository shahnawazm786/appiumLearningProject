package org.testngexample;

import org.testng.annotations.Test;

public class TestNGPriorityExample2 {
    @Test(priority = 0,description = "Show method priority - 0")
    public void getShow1(){
        System.out.println("Show1");
    }

    @Test(priority = 0)
    public void add(){
        System.out.println("Add1");
    }

    @Test(priority = 1)
    public void getShow2(){
        System.out.println("Show2");
    }


}
