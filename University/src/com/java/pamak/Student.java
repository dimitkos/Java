package com.java.pamak;

public abstract class Student {
    private String name;


    public Student(String aName)
    {
        name=aName;

    }

    public String getName() {
        return name;
    }

    //abstract method den exei ylopoihsh
    public abstract void printInfo();



}
