import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class SerializationDemo {

	//ftiaxne ena arraylist pou tha topothetw olous tous ergazomenous
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public SerializationDemo() {
	    //ftiaxnw dyo etairis
		Company C1 = new Company("Coca Cola");
		Company C2 = new Company("Google");
		//kai sthn synexeia vazw mesa sto arraylist tous ergazomenosu aki tis etairies pou douleyoun
		employees.add(new Employee("John", C1));
		employees.add(new Employee("Bob", C2));

		//grafei s eena arxeio to arraylist
		serializing();
		
		ArrayList<Employee> employeesFromFile = deserializing();
		
		for(Employee e: employeesFromFile) {
			e.printInfo();
		}
		
	}
	
	public void serializing() {
		try {
		    //grafei se arxeio
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(employees);
			//kleinouem ta streams
			out.close();
			fileOut.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		finally {
			System.out.println("Serialization Attempted...");
		}
		
	}
	
	public ArrayList<Employee> deserializing() {
		try {
		    //apo to arxeio travame thn plhroforria
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			ArrayList<Employee> employees = (ArrayList<Employee>) in.readObject();
			// kleinoume ta streams
			in.close();
			fileIn.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		finally {
			System.out.println("De-Serialization Attempted...");
			return employees;
		}
		
	}
	


}
