import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class App  {

public static void main(String args[]) throws ClassNotFoundException {
	
	
Vehicle v1=new Vehicle("Bike","Plusar RS200");
Vehicle v2=new Vehicle("Car","Nissan Sunny");
	File file=new File("Info.txt");
	
	try {
		file.createNewFile();
		
		System.out.println("File Created");
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	
	}
	
	try {
		BufferedWriter b=new BufferedWriter(new FileWriter(file));
		b.append("David");
		
		System.out.println("Data written");
		b.close();
	
	} catch (IOException e1) {
		
		e1.printStackTrace();
	}
	try {
		FileOutputStream f=new FileOutputStream("Info.dat");
		
		try 
		{
			
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(v1);
			obj.writeObject(v2);
			obj.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
try {
	FileInputStream f2=new FileInputStream("Info.dat");
	
	try {
		ObjectInputStream obj2=new ObjectInputStream(f2);
		Vehicle v3=(Vehicle)obj2.readObject();
		Vehicle v4=(Vehicle)obj2.readObject();
		obj2.close();
		System.out.println(v3);
		System.out.println(v4);
			
	} catch (IOException e) {
		
	e.printStackTrace();
	}



} 
catch (FileNotFoundException e) {
	
	
	e.printStackTrace();
}

try {
	BufferedReader b2=new BufferedReader(new FileReader("Info.txt"));
try {
	String line;
	while((line=b2.readLine())!=null) {
		System.out.println(line);
	}
} catch (IOException e) {

	e.printStackTrace();
}

} catch (FileNotFoundException e) {
	

	e.printStackTrace();
}

}
}
