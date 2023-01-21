package org.example;
import java.util.HashMap;
import java.util.Map;
public class CustomerClassCalledInMapExample {
    static Map<Integer,PersonInformation> person;

    public static void main(String[] args) {
        person=new HashMap<>();
        person.put(1,new PersonInformation(100,"Mahatama Gandhi",2000.00));
        person.put(2,new PersonInformation(101,"Jawahar Lal Nehru",1200.00));
        person.put(3,new PersonInformation(103,"Bill Gates",1300.00));
        person.put(4,new PersonInformation(104,"Warren Buffer",1400.00));
        for(Map.Entry entry : person.entrySet()){
            System.out.println(entry.getKey());
            //System.out.println((PersonInformation)entry.getValue());
            PersonInformation per=(PersonInformation)entry.getValue();
            System.out.println(per.getPersonNo());
            System.out.println(per.getPersonName());
            System.out.println(per.getPersonSalary());

        }


    }
}
