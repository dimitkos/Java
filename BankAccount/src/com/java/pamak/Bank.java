package com.java.pamak;

import java.util.ArrayList;

public class Bank {
    //logw ths arxh ths ypokatastashs tha valw typou bankaccount
    //etsi loipon tha mporei na symperilavei klashs poy einai sub
    private ArrayList<BankAccount>  accounts= new ArrayList<BankAccount>();


    public void AddAccount(BankAccount account)
    {

        accounts.add(account);
    }


    public  void printAllData()
    {
        for (BankAccount account : accounts)
        {

            account.printData();
        }
    }

}
