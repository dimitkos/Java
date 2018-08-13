package com.java.pamak;

public class Undergraduate extends Student {
    private  double GPA;

    public  Undergraduate(String name,double GPA)
    {
        super(name);
        this.GPA=GPA;
    }

    public  void printInfo()
    {
        System.out.println("Undergraduate Student");
        System.out.println("Name : "+ getName());
        System.out.println("Gpa is : "+GPA);
    }
}
