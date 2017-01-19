import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class RR implements Serializable
{
	int y = 1000;
	class PP implements Serializable
	{
		int t = 2000;
	}
	PP pp = new PP();
	
}

class E implements Serializable
{
	int t=1000;
}
class Parent  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	double y;
	Parent(){
		x = 100;
		y = 20;
		System.out.println("Parent Class Default Cons Call");
	}
}
class Child extends Parent //implements Serializable
{
	/**
	 * 
	 */
	E obj = new E();  //Has - A
	private static final long serialVersionUID = 1L;
	int z;
	Child(){
		 z= 9000;
		System.out.println("Child Class Default Cons Call");
	}
}
public class ISADemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//Child child = new Child();
		//child.x+=2;
		//child.y+=2;
		RR obj = new RR();
		String path = "/Users/amit/Documents/FileHandlingTestingCase/a/isa.dat";
		FileOutputStream fs = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(obj);
		//os.writeObject(child);
//////		
		os.close();
		fs.close();
		System.out.println("Object Store in a File...");
		FileInputStream fi =new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fi);
		//Child childObject = (Child)oi.readObject();
		RR rr = (RR)oi.readObject();
		System.out.println(rr.y+" "+rr.pp.t);
		//System.out.println(childObject.x +" "+childObject.y+" "+childObject.z);
		oi.close();
		fi.close();

	}

}
