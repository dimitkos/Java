package com.java.pamak;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class InputData {

    //einai mia methodos pou tha allhlepidroume me ton xrhsth
    //kai tha grafoume ston arraylist ths main opoy tha vazoume foithtes kai pio mathima eggrfate o kathenas
    //thn kanw static giati den exei nohma na ftiaksw object na thn kalesw
    public static void readData(ArrayList<Student> students, ArrayList<Course> courses)
    {
        //emfanizie mnm ston xrhsth,dexetai apanthsh apo ton xrhsth
        //kai thn apanthsh thn epistrefei ws alfarithmitiko

        //String answer= JOptionPane.showInputDialog("Enter your name:");

        boolean more= true;

        while(more)
        {

            String selection= JOptionPane.showInputDialog("1:Student  2:Graduate");
            int choice =Integer.parseInt(selection);

            String name= JOptionPane.showInputDialog("Name: ");
            String id= JOptionPane.showInputDialog("Id: ");

            //to arxikopoiw ws null gia na mhn vgazei error
            //ayto symvanei dioti  an mpei mesa sto if pernei mai timh an omws den mpei den tha parei timh kai tha vgazei error
            String supervisor=null;

            if(choice == 2)
            {
                supervisor= JOptionPane.showInputDialog("Supervisor: ");
            }

            Student student;
            if(choice==1)
            {
                student= new Student(name,id);
            }
            else
            {
                student= new Graduate(name,id,supervisor);
            }

            String coursename =JOptionPane.showInputDialog("Enter course name: ");

            //ftiaxnoume ena for wste na diatreksw ola ta mathimata poy exie mesa h lista
            //sthn synexeia tha sygkrinw to mathima me thn epilogh tou xrhsth
            for (Course course:courses)
            {
                if(course.getName().equals(coursename))
                {
                    student.addCourses(course);
                }

            }

            //ton foithth ton topothetoume sthn lista poy yparxeis thn main kai thn pernei ws orisma h synarthsh
            students.add(student);

            String answer= JOptionPane.showInputDialog("More Students (Y/N)");
            //gia string tha mporousa na kanw=="n"
            if(answer.equals("N"))
            {
                more= false;
            }

        }


    }
}
