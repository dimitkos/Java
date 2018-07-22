import com.head.first.Battle;
import java.util.Scanner;

public class RunBattle
{

    public static  void main(String[] args)
    {
        //metavliti opou tha kratame tis matepsies tou paikth
        int numberofguesses=0;
        boolean isalive=true;

        Battle ship= new Battle();

        //edw tha epilegontai tyxaiata 3 synexomena kelia opou tha einai to karavi stoxos topothethmena
        int randomNum=(int)(Math.random()*5);

        int [] locations={randomNum,randomNum+1,randomNum+2};



        //kai edw setaroume tis times aytes
        ship.setLocationcells(locations);

        //oso den exei petyxei to karavi synexizoume
        while(isalive==true)
        {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a number: ");
            // Scans the next token of the input as an int once finished
            int n = reader.nextInt();


            String userguess=String.valueOf(n);

            String result = ship.checkyourself(userguess);
            numberofguesses++;
            //an katastrepsoume to karavi tote h bool ginetai false kai vgainei apo to while
            if(result.equals("kill"))
            {
                isalive=false;
                System.out.println("you took "+ numberofguesses+" tries");
            }
        }

    }
}
