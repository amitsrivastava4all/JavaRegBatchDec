import java.io.FileInputStream;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//FileInputStream fs = new FileInputStream("/Users/amit/Documents/FileHandlingTestingCase/MyFile.txt");
		//Scanner scanner= new Scanner(fs);
		//Scanner scanner= new Scanner("Hello How are You\n Hi I am Fine ");
		Scanner scanner= new Scanner(System.in);
		String result = "";
		int counter = 1;
		while(scanner.hasNext()){
			String text = scanner.nextLine();
			result += counter+" "+text+"\n";
			counter++;
			//System.out.println(result);
			if(result.contains("end of file")){
				break;
			}
			//System.out.println(result);
		}
		System.out.println(result);
		scanner.close();
		//Scanner scanner = new Scanner("Hello How are You");
		

	}

}
