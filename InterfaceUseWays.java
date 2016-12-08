@FunctionalInterface
interface Calculate
{
	int calc(int x,int y);
	//void show();
}
// 1st way (Classical Way)
// Create a class and implement an interface
// override the interface method
// create class object and call the method
class MyCalc implements Calculate{
	@Override
	public int calc(int x, int y ){
		return x + y;
	}
	
	public void show(){
		System.out.println("Show....");
	}
}
public class InterfaceUseWays {

	static void callMe(){
		MyCalc obj3 = new MyCalc();
		System.out.println(obj3.calc(1, 2));
	}
	
	public static void main(String[] args) {
		InterfaceUseWays.callMe();
		// TODO Auto-generated method stub
		// ParentName refVarName = new SubClassName() ; // Upcasting 
		Calculate obj = new MyCalc();
		System.out.println(obj.calc(1000, 2000));
		//obj.show();
		
		// 2nd Way (Anonymous Way)
		// Anonymous Class
		//class _______ implements Calculate{
//		Calculate obj2 = new Calculate(){
//				@Override
//				public int calc(int x, int y){
//					this.display();
//					return x * y;
//				}
//				public void display(){
//					System.out.println("Display....");
//				}
//		};
//		System.out.println("Anonymous Class "+obj2.calc(10, 20));
//		int result = new Calculate(){
//			@Override
//			public int calc(int x, int y){
//				return x + y;
//			}
//		}.calc(90, 2);
		
		//3rd Way (Java 8)
		// SAM (Single Abstract Method) Interface
		Calculate obj4 = (x,y)->x*y;
		Calculate obj5 = (x,y)->{
			x++;
			y++;
			return x*y;
		};
		int result = obj4.calc(90, 2);
		System.out.println("Result is "+result);
		
		
	}

}
