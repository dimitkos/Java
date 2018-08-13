package com.java.pamak;

public class Phd extends Student {
    private String thesis;

    public  Phd(String name,String thesis)
    {
        super(name);
        this.thesis=thesis;
    }

    public  void printInfo()
    {
        System.out.println("Phd Student");
        System.out.println("Name : "+ getName());
        System.out.println("Thesis : "+thesis);
    }

}
