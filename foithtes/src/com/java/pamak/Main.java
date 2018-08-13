package com.java.pamak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




        Student s1= new Student("jim","mppl17024");

        Course java=new Course("java",6);
        Course c=new Course("c",4);
        s1.addCourses(java);
        s1.addCourses(c);
        s1.printInfo();

        Graduate g1= new Graduate("jim","mppl1000","Alepis");

        g1.addCourses(java);
        g1.addCourses(c);

        g1.printInfo();
        System.out.println("----------------------------------------------");

        //ftiwxnw mia arraylist opoy  vazw tous foithttes poy ftiaxnw
        ArrayList<Student> students= new ArrayList<Student>();

        //ftiaxnw dyo mathimata
        Course C1= new Course("java",5);
        Course C2 =new Course("python",5);

        //tha ftiaksw ena neo arraylist opoy tha mpoyn tha mathimata
        ArrayList<Course> courses= new ArrayList<Course>();

        //vazw ta mathimata mesa sthn lista
        courses.add(C1);
        courses.add(C2);

        InputData.readData(students,courses);

        for (Student student:students)
        {

            student.printInfo();
        }



    }
}
