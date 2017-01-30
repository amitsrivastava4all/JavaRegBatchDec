class Logic{
	static int counter;
	static void mylogic(){
		for(int i = 1; i<=5; i++,counter++){
			System.out.println("Thread Running :: "+Thread.currentThread().getName()+" I is "+i+" Counter is "+counter);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class JobClass implements Runnable{
	Logic logic = new Logic();
	@Override
	public  void run(){
		System.out.println("I am Not Lock .."+Thread.currentThread().getName());
		synchronized(Logic.class){
		//synchronized(logic){
		//synchronized (this) {
			//System.out.println("I am Lock...."+Thread.currentThread().getName());
			//System.out.println("I am Lock...."+Thread.currentThread().getName());
			//System.out.println("I am Lock...."+Thread.currentThread().getName());
			//logic.mylogic();
			Logic.mylogic();
		}
		System.out.println("Iam Also Not Lock..."+Thread.currentThread().getName());
	}
}


public class SynchDemo {

	public static void main(String[] args) {
		JobClass jobClass = new JobClass();
		Thread t1 = new Thread(jobClass,"First");
		Thread t2 = new Thread(jobClass,"Second");
		Thread t3 = new Thread(jobClass,"Third");
		t1.start();
		t2.start();
		t3.start();
		

	}

}
