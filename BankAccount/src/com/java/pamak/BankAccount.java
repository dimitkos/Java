package com.java.pamak;

public class BankAccount {

    //thn kanw prtected etsi wste oi klashs poy klhronomoyn thn parousa klash tha exoun prosbash se aythn
    protected double balance;

    public  BankAccount()
    {


    }

    public BankAccount(double amount)
    {
        balance= amount;
    }

    //epistrefei to poso tou logariasmou

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount)
    {
        balance=balance+amount;
    }


    //kanoume override thn tostring wste  na pernoume to epithymito apotelesma
    @Override
    public String toString() {
        return ("Balance: "+balance);
    }

    //mia methodos poy tha typwnei plirofories
    public void printData()
    {
        System.out.println("Normal Bank Acoount");
        System.out.println("Balance is:"+balance);
    }
}
