package com.java.pamak;

public class BankAccount {
    private double balance;
    private String code;

    public BankAccount(double balance,String code)
    {
        this.balance=balance;
        this.code=code;
    }

    public double getBalance() {
        return balance;
    }

    public String getCode() {
        return code;
    }

//epikalyptw thn hashcode
    public int hashCode()
    {

        return code.hashCode();
    }

    //epikalyptw thn equals
    public boolean equals(Object other)
    {
        //kanw casting

        BankAccount otherAccount= (BankAccount) other;
        //sygktinw ton kwdiko tou allou logariasmou me thn equals poy kalw me ton diko mou logariasmo
        return  otherAccount.getCode().equals(this.getCode());
    }

}
