package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a=100;
        int b=200;
        int c=300;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("I have added one line code");
        System.out.println("I have added one line code");
        OverridingDemo demo=new OverridingDemo();
        demo.getCounter();
        OverridingExample demo1=new OverridingExample();
        demo1.getCounter();
        OverridingExample demo2=new OverridingDemo(); // Runtime
        demo2.getCounter(); // counter is 100
    }
}