import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		System.out.println("Enter the First Name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("NAme is "+name);
		scanner.close();
	
		

	}

}
