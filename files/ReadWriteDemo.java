import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteDemo {
	static void writeFile(){
		System.out.println("Enter the Data to Write in a File");
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		String path = "/Users/amit/Documents/FileHandlingTestingCase/MyFile.txt";
		try {
			FileOutputStream fo = new FileOutputStream(path,true);  // create a file
			fo.write(data.getBytes());
			fo.close();
			System.out.println("Data Store in a file");
			scanner.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void readFile(){
		String path = "/Users/amit/Documents/FileHandlingTestingCase/MyFile.txt";
		final int EOF = -1;
		try {
			FileInputStream fi = new FileInputStream(path); // Open a file to read
			int read = fi.read();//read a file
			while(read!=EOF){
				System.out.print((char)read);
				read = fi.read();
			}
			fi.close();
			// close a file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Exist... "+e);
			//e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		writeFile();
		readFile();
	}

}
