package com.java.pamak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //edw den mporw na ftiaksw students object alla logw ths arxhs ths ypokatastash
        //mporw na valw undergrad kai phd poy einai subclasses
        ArrayList<Student> students= new ArrayList<Student>();

        Undergraduate jim= new Undergraduate("jim",9.7);

        students.add(jim);

        Phd takis= new Phd("Takis","OIKONOMIKA");
        students.add(takis);


        for (Student student:students)
        {
            student.printInfo();
            
        }
    }
}
