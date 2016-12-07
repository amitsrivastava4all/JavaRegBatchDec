/*
 * String is a API
 * String is a Class
 * String is a final class
 * String use String Pool
 * String is a collection of characters (char array)
 * String object creation ways are 
 * 1. String Literal - It first check in a Pool , if present then give the old reference, otherwise build the new one in string pool
 * 2. String new Object, always create a new Object
 * 
 * String Objects are Immutable
 */
public class StringDemo {

	public static void main(String[] args) {
		int l = 90; // AutoBoxing
		
		Float ppp = 999.20f;
		Integer t = 200; // 1 Byte Pool (-128 to 127)
		Integer y = 200;
		t++; // AutoBoxing
		if(t==y){
			System.out.println("Integer Same Ref");
		}
		else
		{
			System.out.println("Integer Not Same Ref");
		}
		// TODO Auto-generated method stub
		// Literal Way can create 0 or 1 Object
		String a = "amit"; // String Literal
		String b = "amit";
		String d ="AMIT";
		// new Way Create 2 Objects or 1 Object
		
		String c = new String("amit"); // String new Object
		if(a==d){
			System.out.println("String Same Ref");
		}
		else{
			System.out.println("Not Same Ref");
		}
		// Value Check
		if(a.equalsIgnoreCase(d)){
		//if(a.equals(d)){
			System.out.println("Same Value");
		}
		else{
			System.out.println("Not Same Value");
		}
		String immutableDemo = "Hello";
		String d2 = "Hello";
		d2= d2 +"hi";
		if(d2==immutableDemo){
			System.out.println("Same Ref......");
		}
		else
		{
			System.out.println("Not Same Ref....");
		}
		System.out.println(d2.hashCode());

	}

}
