package com.java.pamak;

public class Graduate extends Student {
    private String supervisor;

    public Graduate(String aname,String anID,String asupervisor)
    {
        //kalw ton kataskeyasth ths yperklashs
        super(aname,anID);
        supervisor=asupervisor;
    }

    public void printInfo()
    {
        super.printInfo();
        System.out.println("Supervisor: "+supervisor);

    }
}
