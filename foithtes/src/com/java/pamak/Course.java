package com.java.pamak;

import java.util.ArrayList;

public class Course {

    private String Name;
    private int credits;


    public Course(String aName,int acredit)
    {
        Name=aName;
        credits=acredit;
    }

    public String getName() {
        return Name;
    }

    public int getCredits() {
        return credits;
    }
}
