import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;




class ITEmployee implements Serializable{
	/**
	 * 
	 */
	private double hra =2000.00;
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double bonus = 999;
	
	private transient double salary; // It will not persist in a file
	ITEmployee(int id , String name , double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		//this.hra = 10000.20;
		
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", salary=" + salary + "Bonus "+bonus +" HRA  "+hra+ "]";
	}
	
}

class W
{
	int p ;
	int t;
}

public class ObjectReadWrite {
	static void print(){
		
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		W obj = new W();
		W obj2 = obj;
		obj.p= 1000;
		System.out.println("P with Obj2 "+obj2.p);
		
		
		System.out.println("P with Obj "+obj.p);
		int p =20;
		//		ITEmployee ram =new ITEmployee(1001, "Ram", 9090);
		String path = "/Users/amit/Documents/FileHandlingTestingCase/a/emp.dat";
//		FileOutputStream fs = new FileOutputStream(path);
//		ObjectOutputStream os = new ObjectOutputStream(fs);
//////		
//		os.writeObject(ram);
//		os.close();
//		fs.close();
	System.out.println("Object Store in a file....");
		FileInputStream fi = new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fi);
		ITEmployee emp = (ITEmployee)oi.readObject();
		System.out.println(emp);
		oi.close();
		fi.close();
		
		
		
		//System.out.println(ram);
		//System.out.println(ram.toString());

	}

}
