package com.head.first;

public class Player
{
    int  number  =  0;
    public  void  guess()
    {
        //methodos opou gia kathe paikth manteyei enan arithmo kai ton ektypwnei
        number  =  (int) (Math.random() *  10);
        System.out.println("I’m guessing "+  number);

    }
}
