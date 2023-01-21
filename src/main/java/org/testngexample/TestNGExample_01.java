package org.testngexample;

import org.testng.annotations.Test;

public class TestNGExample_01 extends DotTestListener {

    @Test(priority = 0)
    public void getShow1(){
        System.out.println("Show1");
    }

    @Test(priority = 1)
    public void getShow2(){
        System.out.println("Show2");
    }

    @Test(priority = 2)
    public void add(){
        System.out.println("Add");
    }
    @Test(priority = 3)
    public void add1(){
        System.out.println("Add1");
    }
    @Test(priority = 4)
    public void batch(){
        System.out.println("batch");
    }
}
