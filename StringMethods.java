import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Amit";
		System.out.println("A is "+a.toString());
		System.out.println(a.length());
		String b = a.toUpperCase();
		System.out.println(a==b?"Same Ref":"Not Same Ref");
		String email = "amit@yahoo.com";
		int indexPos = email.indexOf("#");
		System.out.println("Index Pos "+indexPos);
		String msg= "Hello";
		msg.indexOf("l");
		msg.lastIndexOf("l");
		System.out.println(email.contains("@"));
		System.out.println(email.startsWith("amit"));
		System.out.println(email.endsWith(".com"));
		System.out.println("Equal Compare "+msg.equals("HELLO"));
		System.out.println("Equal Compare "+msg.equalsIgnoreCase("HELLO"));
		System.out.println("Compare "+"amit".compareTo("anil"));
		String name = "       Amit      Srivastava       ";
		System.out.println("["+name+"]");
		System.out.println("["+name.trim()+"]"); // trim will remove leading and trailing spaces
		String temp = "Hello How are you";
		System.out.println("Temp is "+temp.substring(2));
		System.out.println("Temp is "+temp.substring(2,5)); // 2 is index and 5 is position
		String address = "21 , Shakti Nagar , Delhi-7";
		String array[] =address.split(",");
		for(String arr : array){
			System.out.println(arr);
		}
		byte r [] = address.getBytes(); // Network Send , File Write
		String names[] = {"amit","anil","akhil"};
		Arrays.sort(names);
		System.out.println("After Names Sort");
		for(String n:names){
			System.out.println("N "+n);
		}
		char carr[] = temp.toLowerCase().toCharArray();
		Arrays.sort(carr);
		String w = new String(carr);
		System.out.println("After Sort "+w);
		System.out.println("Char At 0 "+a.charAt(0));
		String tt = a.concat("kumar").concat("srivastava");
		tt = a+"kumar"+"srivastava";
		System.out.println(tt);
		String t1 = "hello".intern();
		String t2 = "hello";
		t1.isEmpty();
		System.out.println("After Replace "+t1.replace("l", "w"));
		String str = String.valueOf('a');
		str = String.valueOf(90);
		str = ""+'a';
		
	}

}
