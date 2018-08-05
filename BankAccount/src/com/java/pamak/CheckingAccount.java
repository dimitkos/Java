package com.java.pamak;

public class CheckingAccount extends BankAccount {
    private int  transactionCounter;

    public  CheckingAccount(double initialAmount)
    {
        //kalw ton kataskeyasth ths yperklashs
        super(initialAmount);
        transactionCounter=0;
    }

    //epanaorismos ths methodoy dhladh kanoume override
    @Override
    public void deposit(double amount) {
        //epithymw thn klhsh ths methodou ths yperklashs
        super.deposit(amount);
        transactionCounter++;

        if(transactionCounter>3)
        {
            deductFees();
        }
    }

    // mia methodos opou an kanoume panw apo treis synallages mas aferei 50 cents
    public  void deductFees()
    {
        balance=balance-0.5;
    }
}
