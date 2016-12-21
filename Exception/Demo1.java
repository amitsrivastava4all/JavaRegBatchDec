import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	Scanner scanner= new Scanner(System.in);
	int firstNo;
	int secondNo;
	void takeFirstNo(){
		try{
			System.out.println("Enter the First No");
			 firstNo = scanner.nextInt(); 
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed");
			scanner.nextLine();
			takeFirstNo();
		}
	}
	void takeSecondNo(){
		try{
			System.out.println("Enter the Second No");
			 secondNo = scanner.nextInt(); 
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed");
			scanner.nextLine();
			takeSecondNo();
		}
	}
	void divide(){
		try{
			int result = firstNo / secondNo;
			System.out.println("Result is "+result);
		}
		catch(ArithmeticException e){
			System.out.println("Can't Divide With Zero...");
			takeFirstNo();
			takeSecondNo();
			divide();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 obj = new Demo1();
		obj.takeFirstNo();
		obj.takeSecondNo();
		obj.divide();
		

	}

}
