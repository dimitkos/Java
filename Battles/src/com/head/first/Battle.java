package com.head.first;

public class Battle
{
    //dhlwnoume enan pinaka akeraiwn
    int[] locationcells;
    int numberofhits;




    //einai mia methodos opou tha pernei ws orisma enan pinaka opou ekei mesa tha katalavanei treis synexomenes theseis to ploio stoxos

    public void setLocationcells(int[] locs)
    {
        locationcells = locs;
    }

    public String checkyourself(String stringguess)
    {
        //pernei ena string kai to metatrepei se int
        //ousiastika einai o stoxos pou epilegei o paikths
        int guess = Integer.parseInt(stringguess);

        //arxikopoioume to apotelesma ths volhs ws xamenh
        String result="miss";

            for (int cell:locationcells)
            {
                //elegxei an h volh einai petixymenh tote to apotelesma na ginei hit
                //kia sthn synexeia na vgei eksw apo to loop giati den exei nohma na eksetasoume kai ta alla kelia
                if(guess==cell)
                {
                    result="hit";
                    numberofhits++;
                    break;
                }
            }
            //edw elegxoume an exoume 3 number of hits dhladh swsta typhmata
            //shmainei oti to karavi tha vouliaksei
            if(numberofhits==locationcells.length)
            {
                result = "kill";
                boolean cont=false;
            }




        //ektypwnei to apotelesma
        System.out.println(result);

        return  result;

    }

}
