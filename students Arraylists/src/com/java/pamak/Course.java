package com.java.pamak;

import java.util.ArrayList;

public class Course {
    private  String name;
    //dhlwnw ayth thn arraylist etsi wste na mporei ena mathima na to epileksoun pollaploi foithtes
    private ArrayList<StudentArrayList> students= new ArrayList<StudentArrayList>();

    public Course(String aName)
    {
        name=aName;
    }

    public String getName() {
        return name;
    }
    //methodos opou kanei prosthiki enan foithth sthn lista tou mathimatos poy phre
    public void AddStudent(StudentArrayList astudent) {
        students.add(astudent);
    }
        //methodos pou typwnei tis plirofories gia to mathima
    public  void printInformation()
    {
        System.out.println("Course Name: "+name);
        System.out.println("Has students: ");
        for (StudentArrayList s:students) {

            System.out.println(s.getName());
        }
        System.out.println("");
    }
}
