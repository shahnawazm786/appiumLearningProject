package org.example;

public class OverideDemo {
    public static void main(String[] args) {
        Greeting gr=new Greeting(); // Greeting() -default constructor
        gr.greets();
        // calling the greets() method of
        //GreetChild_01 gr1=new GreetChild_01();
        //gr1.greets();
        Greeting gr1= new GreetChild_01();
        gr1.greets();
        Greeting gr2= new GreetChild_02();
        gr2.greets();
        Greeting gr3= new GreetChild_03();
        gr3.greets();
       // Book b=new Pen();



    }
}
