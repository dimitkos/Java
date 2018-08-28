package com.java.pamak;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        BankAccount b1= new  BankAccount(1500,"001");
        BankAccount b2= new  BankAccount(1500,"001");

        HashSet<BankAccount> set = new HashSet<BankAccount>();
        set.add(b1);
        set.add(b2);

        //to hashet den kataxwrei diplotypa parolaayta epeidh omws exoume balei diko mas antikeimeno h java dne mporei na katalavaei oti einai idia
        //efoson einai dyo diaforetika antikeimena ara ta typwnei kanonika
        for (BankAccount account:set) {

            System.out.println(account.getCode()+" "+account.getBalance());

        }
        //gia na mhn symvei to parapanw prepei na epikalypsw thn synarthsh hashcode kai thn synarrthsh equals.
        //h methodos hashcode einai mia methodos poy ypologizei thn synarthsh katakermatismoy
        //epistrefei thn thesi poy tha topothetithei to antikeimeno
        //h equals einai emthodos pou sygkrinei dyo antikeimena an einai idia.

    }
}
