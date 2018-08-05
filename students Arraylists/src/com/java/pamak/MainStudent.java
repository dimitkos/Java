package com.java.pamak;


public class MainStudent
{
    public static void main(String[] args) {
        //ftiaxnw foithtes
        StudentArrayList jim= new StudentArrayList("dimitris","mppl17024");

        StudentArrayList nik = new StudentArrayList("nikos");

        //ftiaxnw ta mathimata
        Course c1= new Course("Java");
        Course c2= new Course("Python");
        Course c3= new Course("C");
        Course c4= new Course("C#");
        Course c5= new Course("HTML");
        Course c6= new Course("Javascript");



        //anathetw stous foithttes mathimata
        jim.AddCourses(c1);
        jim.AddCourses(c2);
        jim.AddCourses(c3);
        jim.AddCourses(c4);

        nik.AddCourses(c3);
        nik.AddCourses(c6);

        //typwnw plhrofories dhladh ti mathimata phre o kathe foithths
        jim.PrintInfo();
        nik.PrintInfo();

        //anathetw mathima se foithth
        c1.AddStudent(nik);

        //typwnei plirofories gia to kathe mathima
        c1.printInformation();
        c3.printInformation();
        c4.printInformation();
        c5.printInformation();



    }
}
