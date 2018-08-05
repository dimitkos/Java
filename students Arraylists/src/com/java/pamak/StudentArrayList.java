package com.java.pamak;

import java.util.ArrayList;

public class StudentArrayList
{
    private String name;
    private String id;
    private ArrayList<Course> courses= new ArrayList<Course>();


    public void AddCourses(Course acourse) {
        //grafw to mathima course sthn arraylist courses
        courses.add(acourse);
        //alla kai grafw ton foithth sto mathima acourse
        acourse.AddStudent(this);
        //etsi twra exv dimwerh epikoinvnia metaksi tou student kai tou course
        //o kathenaw gnwrizei ton allon
    }


    public StudentArrayList(String aName, String anId)
    {
        name=aName;
        id=anId;
    }

    public  StudentArrayList(String aName)
    {
        name=aName;
        id="9999";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void PrintInfo() {
        System.out.println("Student Data: ");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Enrolled in: ");
        for (Course c:courses) {
            System.out.println(c.getName());

        }

        //enas pio aplos tropos einai o apo panw
        /*for (int i = 0; i < courses.size(); i++) {
           //edw tha kanoume casting,theloume na anathesoume se mia metavliti c typou course,omws
            //h java den gnwrizei mesa sto arraylist ti exoume. opote tha kanoume cast oti ayto einai course
            Course c =(Course) courses.get(i);
            System.out.println(c.getName());
        }*/
        System.out.println("");
    }
}
