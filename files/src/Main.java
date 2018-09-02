import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Jim");
        names.add("Andre");
        names.add("kostas");
        names.add("nick");

        //katskeyazoume to arxeio
        File namesFile = new File("names.txt");

        //prpsathw na ftiaksw enan writer
        try (FileWriter writer = new FileWriter(namesFile)) {
            for (String name:names) {
                writer.write(name);
                //gia na kanei allagh grammhs se kathe onoma
                writer.write(System.lineSeparator());
            }

            writer.close();
            System.out.println("File has been writen");

        }catch (IOException e)
        {

            e.printStackTrace();
        }

        new GUI();

    }
}
