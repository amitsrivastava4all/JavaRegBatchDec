import java.awt.event.WindowAdapter;

interface P
{
	void show();
	default void display(){
		System.out.println("Display Common P");
	}
	
}
interface PP{
	default void display(){
		System.out.println("Display Common PP");
	}
}
class P1 implements P,PP{
	public void show(){
		
	}
	@Override
	public void display(){
		P.super.display();
		PP.super.display();
	}
}
class P2 implements P,PP
{
	public void show(){
		
	}
	@Override
	public void display(){
		P.super.display();
		PP.super.display();
	}
}


class T11{
	void print(){
		System.out.println("T1 Print");
	}
}
class T2 extends T11
{
	void print(){
		super.print();
		System.out.println("T2 Print Here and T1 Print is Hidden");
	}
}


public class Java8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowAdapter w;
		T2 obj = new T2();
		obj.print();
	}

}
