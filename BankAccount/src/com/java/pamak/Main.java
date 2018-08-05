package com.java.pamak;

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
    }
}
