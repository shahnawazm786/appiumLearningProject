package org.example;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    // Map -> Entry => (Key and Value) => Key Value Pair Data
    Map<Integer,String> map=new HashMap<>();

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(100, "Math");
        map.put(98, "Science");
        map.put(99, "Physics");
        // String, Integer
        map.put(100, "Social Studies"); // duplicate key in map

        System.out.println(map.get(100));
        System.out.println(map.get(98));

        map.remove(99);
        System.out.println(map.get(99));
    }


}
