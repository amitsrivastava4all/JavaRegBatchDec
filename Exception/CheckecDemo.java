import java.io.File;
import java.io.IOException;

public class CheckecDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x [] = new int[3];
		//x[6]=900;
		File file = new File("/Users/amit/Documents/test2/abcd.txt");
		try {
			file.createNewFile();
			System.out.println("File Created...");
		} catch (IOException e) {
			System.out.println("Unable to Build the File...");
			e.printStackTrace();
		}

	}

}
