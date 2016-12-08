
public class ReverseDemo {
	static int i = 1;
	static void print(){
		if(i%2==0){
			System.out.println("Even "+i);
		}
		else
		{
			System.out.println("Odd "+i);
		}
		//System.out.println(i);
		i++;
		//if(i<=10){
			
		print();
		//}
	}
	static int length =-1;
	static void reverseit(String name){
		if(length==-1){
		length = name.length();
		}
		if(length>0){
		System.out.print(name.charAt(length-1));
		length--;
		reverseit(name);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print();
		reverseit("ram");
	}

}
