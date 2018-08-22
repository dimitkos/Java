package com.java.pamak;

public class Student {
    private String name;
    private  Course course;

    public Student(String name)
    {
        this.name= name;
    }


    public void setCourse(Course acourse)
    {

        course=acourse;
    }

    public void printInfo()
    {
        System.out.println("Student Name: "+name);
        System.out.println("Selected Course: "+course.getName());
        System.out.println("----------------------------------");

    }
}
