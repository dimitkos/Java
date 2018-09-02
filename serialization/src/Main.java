import java.io.*;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee("john");



        try{
            File file = new File("employee.ser");

            FileOutputStream fileoutstream = new FileOutputStream(file);

            //dhmioutgoume allo stream opou tha emperiexei to apo panw stream gia na ginei h eggrafh me mia entolh
            ObjectOutputStream outputStream = new ObjectOutputStream(fileoutstream);
            //grafoume on yppalhlo
            outputStream.writeObject(e);

            outputStream.close();
            fileoutstream.close();
            System.out.println("Employee has been written");

        }
        catch (IOException exc)
        {
            exc.printStackTrace();
        }

        Employee a=null;

        try{
            File file = new File("employee.ser");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);

            //diavazw apo to arxeio
            //kai kanw casting na dhlwsw ti typou antikeimeno einai
            a=(Employee)objectInputStream.readObject();

            //klinw ta reymata
            objectInputStream.close();
            fileInputStream.close();
        }
        catch (IOException exc)
        {
            exc.printStackTrace();
        }
        catch (ClassNotFoundException exc)
        {
            exc.printStackTrace();
        }
        System.out.println("Deserialization performed..");
        System.out.println("Employee : "+a.getName());
    }
}
