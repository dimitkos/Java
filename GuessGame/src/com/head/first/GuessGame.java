package com.head.first;

public class GuessGame
{
    //ftiaxnoume tris metavlites opou einai typou player objects
    Player p1;
    Player p2;
    Player p3;

    public void StartGame()
    {
        //dhmiourgoume 3 objects kai ta anathetoume stis metavlites
        p1= new Player();
        p2= new Player();
        p3= new Player();

        //treis metavlites pou tha aniparatsoun tis metepsies tou kathe paikth
        int guessp1=0;
        int guessp2=0;
        int guessp3=0;

        //ftiaxnoume treis metavlites opou tha einai bool kai tha elegxoun an einai swsth h apanthsh

        boolean p1isRight= false;
        boolean p2isRight= false;
        boolean p3isRight= false;

        //einai o arithmos pou tha prepei na mantepsoun oi paiktes
        int targetNumber =(int)(Math.random()*10);
        System.out.println("I’m thinking  of  a  number  between  0  and  9...");


        while (true)
        {
            System.out.println("Number to  guess  is " +  targetNumber);
            //twra o kathe paikths(object) tha kalesei thn methodo guess
            p1.guess();
            p2.guess();
            p3.guess();

            //o arithmos pou mantepse o kath paikths anathetetai sto p.number
            guessp1  = p1.number;
            System.out.println("Player one  guessed "+  guessp1);
            guessp2  = p2.number;
            System.out.println("Player two  guessed "+  guessp2);
            guessp3  = p3.number;
            System.out.println("Player three  guessed " +  guessp3);

            //edw elegxoume an to noumero pou mantepse o paikths einai swsto
            //sthn synexeia an einai swsto h bool metavliti tote ginetai true

            if  (guessp1  ==  targetNumber)
            {
                p1isRight  =  true;
            }
            if  (guessp2  ==  targetNumber)
            {
                p2isRight  =  true;
            }
            if  (guessp3  ==  targetNumber)
            {
                p3isRight  =  true;
            }

            //an estw kai enas mantepse swsta exoume nikhth
            //tote emfanizie mynhma sthn othonh
            //kai me ena break bgainei apo to while loop

            if  (p1isRight  ||  p2isRight  ||  p3isRight)
            {
                System.out.println("We have  a  winner!");
                System.out.println("Player one  got  it  right? " +  p1isRight);
                System.out.println("Player two  got  it  right? "+  p2isRight);
                System.out.println("Player three  got  it  right? "  +  p3isRight);
                System.out.println("Game is  over. ");
                break;

            }
            else
            {
                //alliws  synexizoume mexri na vrethei nikhths
                System.out.println("Players will  have  to  try  again.");
            }


        }

    }
}
