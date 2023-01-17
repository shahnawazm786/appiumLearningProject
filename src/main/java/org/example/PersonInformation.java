package org.example;

public class PersonInformation {
     private  int personNo;
      private String personName;
     private  double personSalary;
    public PersonInformation(int personNo,String personName,double personSalary){
        this.personName=personName;
        this.personSalary=personSalary;
        this.personNo=personNo;
    }
    public int getPersonNo(){
        return this.personNo;
    }
    public String getPersonName(){
        return this.personName;
    }
    public double getPersonSalary(){
        return this.personSalary;
    }
}