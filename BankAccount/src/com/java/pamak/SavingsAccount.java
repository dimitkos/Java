package com.java.pamak;

public class SavingsAccount extends BankAccount
{
    //ayth h klash klironomei to bankaccount omws ths prosthetw to xarakthristiko epitokio
    private double InterestRate;

    public  SavingsAccount(double initialAmount,double rate)
    {

        //kanw edw sthn prwth grammh oti kanei kai o kataskeyasths ths yperklashs
        balance=initialAmount;
        //super(initialAmount) etsi kalw ton kataseyasth thw superclass
        InterestRate=rate;

    }

    public void setInterestRate(double rate) {
        InterestRate=rate;
    }

    public void addInterest()
    {
        double interest= balance*InterestRate;
        balance=balance+interest;

    }
}
