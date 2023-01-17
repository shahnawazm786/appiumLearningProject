package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // int - > Integer
        // float -> Float
        List<Integer> marks=new ArrayList<>();
        marks.add(82);
        marks.add(81);
        marks.add(80);
        marks.add(79);
        marks.add(78);
        Iterator itrs= marks.listIterator();
        while(itrs.hasNext()){
            Integer a=(Integer) itrs.next();
            System.out.println(a);

        }
        marks.remove(2);
        System.out.println(marks);
        marks.add(3,75);
        System.out.println(marks);
    }

}
