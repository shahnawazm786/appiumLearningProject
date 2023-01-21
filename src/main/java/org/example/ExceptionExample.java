package org.example;
import java.io.File;
import java.io.FileInputStream;
public class ExceptionExample {
        public static void main(String[] args)  {
            int a=100;
            FileInputStream inputStream;
            try{
                inputStream = new FileInputStream(new File("c://excel_file/Demo.java"));
            }catch(Exception ex)
            {
                System.out.println("\"D://excel_files/Demo.java\" --->File not found at given location" );
            }
            int b=200;
            int c=a+b;
            int d=0;
            System.out.println("Program executed...."+c);

            System.out.println("Un-checked exception");
            try{
                d=c/10;
            }catch(ArithmeticException ae){
                System.out.println("Number can't divide by zero....");
                d=c/15;
                System.out.println("Program executed...."+d);
            }
            finally{
                d=0;
                inputStream=null;
                System.out.println("Program finally completed....");
                System.out.println("Program executed...."+d);

            }

        }

    }

