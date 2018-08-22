package com.java.pamak;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame extends JFrame {

    private JTextField studentnameField, coursenameField;
    private JButton button,button2;
    private JPanel panel;
    private ArrayList<Course> courses= new ArrayList<Course>();
    private  ArrayList<Student> students= new ArrayList<Student>();

    public MyFrame()
    {
        //dhmiourgw 3 mathimata
        Course c1= new Course("Maths");
        Course c2= new Course("Java");
        Course c3= new Course("Databases");

        //kai ta kataxwrw sthn domh courses
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        panel= new JPanel();

        studentnameField = new JTextField("Student name ");
        coursenameField = new JTextField("Course title ");

        //me to athma aytou toy koumpiou tha dhmioyrgoume enan foithth apo ta tetx pou exome grapsei
        button= new JButton("Create Student");
        //tha mas typwnei tous foithtes
        button2=new JButton("Print Students");


        panel.add(studentnameField);
        panel.add(button);
        panel.add(coursenameField);
        panel.add(button2);

        this.setContentPane(panel);


        //dhmioyrgia antikeimenou akroath
        ButtonListener listener= new ButtonListener();

        //syndesh akroath kai phghs symvantwn
        button.addActionListener(listener);
        button2.addActionListener(listener);


        //me aythn thn methodokanoume orato to parathyro sthn othonh otan kalestei o kataskeyasths ths
        this.setVisible(true);
        //dinoume diastaseis sto parathyro
        this.setSize(400,400);
        //vazoume onoma sto parathyro
        this.setTitle("Event handling");

        //edw kanoume ti tha ginei ama pathsei to x o xrhsths sto parathyro
        //sto orismo mpoorume na valoume enan akeraio opou o kathenas exie eidikh shmasia
        //sthn periptwsh mas to kaname etsi se priotwsh ou den thymmaste tis statheres
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //dhmiourgia klasshs akroath
    class ButtonListener implements ActionListener
    {

        //ypoxrewtika prepei an ylopoihsei ena interface opou exie thn parakatw methodo
        @Override
        public void actionPerformed(ActionEvent e) {

            //elegxv pio plhktro patithike
            if(e.getSource()== button)
            {
                //edw tha grapsoume kwdika ama pathsoume ayto to pliktro na dhmiourgeita o foithths
                String Studentname= studentnameField.getText();

                //tha ftiaksw enan foithth twra
                Student newstudent = new Student(Studentname);

                //pernw to onoma tou mathimatos
                String coursename = coursenameField.getText();

                Course selectedCourse= null;

                //sthn synexeia prepei na sarwsoume thn lista me ta mathimata kai na sygkrinoume me ayto pou exoume sta xria mas
                for (Course course: courses)
                {

                   if(course.getName().equals(coursename))
                   {

                       selectedCourse=course;
                   }
                }

                //ton para[anw elegxo ton ekana dioti h methodos ayth pernei san parametro object kai oxi string
                newstudent.setCourse(selectedCourse);

                //prepei twra na ton valw mesa s emia arraylist gia na mhn xathei
                students.add(newstudent);

            }
            else//edw tha typwnei foithtes kai amthimata
            {
                for (Student student:students)
                {
                    student.printInfo();
                }
            }



        }
    }
}
