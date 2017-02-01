import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class EE
{
	public String toString(){
		return "EE toString";
	}
}

class Calc
{
	public int add(int x, int y){
		return x + y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
	public int multiply(int x, int y){
		return x * y;
	}
	public int divide(int x, int y){
		return x / y;
	}
	
	Calc(){
	
		System.out.println("I Will Call When Object is Created******");
	}
	static{
		//int p;
		System.out.println("I Will Call When Class is loaded*****");
	}
	
}
class ScCalc{
	ScCalc(){
		System.out.println("I Will Call When Object is Created...");
	}
	static{
		System.out.println("I Will Call When Class is loaded...");
	}
}
public class CalculatorDemo {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	System.out.println("add for addition");
	System.out.println("subtract for subtraction");
	System.out.println("multiply for multiplication");
	System.out.println("divide for division");
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Choice");
	String methodName = scanner.next();
	System.out.println("Enter the Class Name to load...");
	String className = scanner.next();
	//ScCalc obj = new ScCalc(); // Eager Way
	//Class.forName(className); // Load a class
	Object object = Class.forName(className).newInstance();  // Lazy Way
	Method method = object.getClass().getDeclaredMethod(methodName
			, int.class,int.class);
	Object result= method.invoke(object, 10,20);  // obj.add(10,20);
	System.out.println(result);
	//Integer i = (Integer)result;
	System.out.println("*********************");
	Object obj = new EE();
	System.out.println(obj);
}
}
