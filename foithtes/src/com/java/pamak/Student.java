package com.java.pamak;

import java.util.ArrayList;

public class Student {

    private String name;
    private String id;
    private ArrayList<Course> courses= new  ArrayList<Course>();



    public Student(String aname,String anid)
    {
        name=aname;
        id= anid;
    }

    public void addCourses(Course acourse)
    {
        courses.add(acourse);
    }

    public void printInfo()
    {
        System.out.println("Student nameis: "+ name);
        System.out.println("Student id: "+id);
        for (Course c:courses)
        {
            System.out.println("Mathima :"+c.getName() + " credits :"+c.getCredits());

        }
    }
}
