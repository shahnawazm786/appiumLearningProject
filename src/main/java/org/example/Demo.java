package org.example;

import java.io.File;
import java.io.FileInputStream;

public class Demo {
    public static void main(String[] args) {
        //TransportClass t=new TransportClass();
        //t.getNoOfWheel();
      //  TransportClass t1=new BiCycle();
      //  t1.getNoOfWheel();
        TransportClass t1=new Truck();
        t1.getNoOfWheel();
        int a=100;
        File file=new File("C://abc//abx.txt");
        try {
            FileInputStream inputStream = new FileInputStream(file);
        }
        catch (Exception ex){
            System.out.println("Hi file not found");
        }
        System.out.println("Program executed");
    }
}
