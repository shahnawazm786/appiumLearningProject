package org.example1;

public class FinalKeywordWithVaraibles {
    static final double pie=3.141;
    public static void main(String[] args) {
        int radious=5;
        double res= pie * (radious * radious);
        System.out.println(res);
        //pie= 4.414; // we can assing the value because it is defined as a final variable
        res= pie * (radious * radious);
        System.out.println(res);

    }
}
