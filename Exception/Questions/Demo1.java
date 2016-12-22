import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;
class E{}
class EE extends E {
	int p,q;
	int length;
	EE(int p,int q){
		this.p = p;
		this.q = q;
	}
	@Override
	public String toString() {
		return "EE [p=" + p + ", q=" + q + "]";
	}
	
	@Override
	public int hashCode(){
		return 10;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Long pp2= 9900l;
		String temp2 = pp2.toString();
		long ppp= pp2.longValue();
		String temp3 = String.valueOf(ppp);
		String s= Integer.toString(10);
		int r = Integer.parseInt("100");
		long ll = Long.parseLong("10");
		float ff = Float.parseFloat("20.20");
		double dd = Double.parseDouble("10.20");
		
		long t = 1000l;
		String str = ""+t;
		String pp = String.valueOf(t);
		//int x = 10;
		EE obj = new EE(10,20);
		System.out.println(obj.length);
		System.out.println(obj +" "+obj.hashCode()); //ClassName@HashCode(Hexa)
		EE obj2 = new EE(10,20);
		System.out.println(obj2 +" "+obj2.hashCode());
		String temp = new String("Hello String");
		System.out.println(temp);
		//System s = new System();
		System.out.println("*************************************");
		
		// TODO Auto-generated method stub
		
		int x[] = new int[10];
		System.out.println("X is "+x);
		System.out.println(x.length);
		String y = "amit"; // Literal Way
		String name1= new String("amit");  // Object Way
		System.out.println(name1.length());
		ArrayList<Integer> list =new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		
		while(scanner.hasNext()){
			System.out.println("Loop....");
			String name = scanner.nextLine();
			System.out.println(scanner.next());
		}
		
		System.out.println(123456);
		String d = "";
		int pp1 = 999;
		if(true){
			return;
		}
		System.out.println("End....");

	}

}
