package com.java.pamak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SavingsAccount SA1 = new SavingsAccount(0,0.02);
        SA1.deposit(1500);

        System.out.println("The balance is: "+SA1.getBalance());

        SA1.setInterestRate(0.02);

        SA1.addInterest();


        System.out.println("The new  balance is: "+SA1.getBalance());


        //ftiaxoume ena checking account kai kanw 4 katatheseis
        CheckingAccount CA1= new CheckingAccount(1000);
        CA1.deposit(500);
        CA1.deposit(500);
        CA1.deposit(500);
        CA1.deposit(500);


        System.out.println("The new  balance is: " + CA1.getBalance());


        System.out.println(SA1.toString());

        System.out.println("-----------------------------------------------------------------------");

        BankAccount BA;

        BA=new BankAccount(1000);

        BA.printData();

        //twra anathetw to antikeimono ba na einai typou saving account ayto mporei na ginei
        //dioti to saving account einai ypoklash ths bank account
        BA= new SavingsAccount(1000,0.02);

        BA.printData();
        System.out.println("-----------------------------------------------------------------------");

        BankAccount BA1;


        Scanner in= new Scanner((System.in));

        int answer;
        System.out.println("what kind of account: 1: Normal 2:Saving ");
        answer=in.nextInt();

        //dynamic binding
        //den kserei pou tha anathesei to ba1 kai perimenei thn apanthsh tou xrhsth prwta
        if(answer==1)
            BA1= new BankAccount(1000);
        else
            BA1= new SavingsAccount(1000,0.02);

        //analoga s epio antikeimeno epileksei o xrhstsh tha klithei h printdata
        BA1.printData();

        System.out.println("-----------------------------------------------------------------------");
        BankAccount ba= new BankAccount(1000);

        SavingsAccount sa= new SavingsAccount(1000,0.02);

        CheckingAccount ca= new CheckingAccount(500);

        Bank bank= new Bank();

        bank.AddAccount(ba);
        bank.AddAccount(sa);
        bank.AddAccount(ca);


        bank.printAllData();


    }
}
