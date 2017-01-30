//1st way
class Jobber implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class Parent{
	void show(){
		System.out.println("Show Call");
	}
}

interface PP{
	void print();
}

public class ThreadWriteWays {

	public static void main(String[] args) {
		PP obj2 = new PP(){
			@Override
			public void print(){
				
			}
		};
		Parent parent = new Parent(){
			@Override
			void show(){
				System.out.println("Override...");
			}
		};
		parent.show();
		// TODO Auto-generated method stub
		Jobber job = new Jobber();
		Thread worker = new Thread(job);
		
		//2nd Way (Job Build + Worker Build)
		Thread myworker = new Thread(new Runnable(){
			public void run(){
				System.out.println("Another Thread...");
			}
		});
		myworker.start();
		//3rd Way (Lambda) 
		Thread worker3 = new Thread(()->System.out.println("My Run"));
		
	}

}
