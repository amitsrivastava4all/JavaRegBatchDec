/*
 * MultiTasking
 * Process Based MultiTasking (Not Supported by Java)
 * Thread Based Multitasking
 * MultiThreading
 * Why Multithreading (Parallel Programming)
 * Apps , Games
 */
// Step  - 1 Create Job
class Job implements Runnable{
	int x = 100;
	// Step - 2 logic inside run (Job Logic)
	@Override
	public synchronized void run(){
		
		for(int i = 1; i<=5 ; i++,x++){
			System.out.println("X is "+x+" I is "+i+" Thread name is "+Thread.currentThread().getName());
		}
	}
}
public class ThreadDemo1 {
int k ;
String pp;
	public static void main(String[] args) {
		Job job1 = new Job();  // Step - 3 Create Job Object
		//Job job2 = new Job();
		Thread worker = new Thread(job1,"ram"); // Step -4 Create worker and assign job 
		Thread worker2 = new Thread(job1,"shyam");
		worker.start();
		worker2.start();
		int k ;
		int MAX =10;
		int p[] = new int[MAX];
		//String p1[] = new String[MAX2];
		//int MAX2 = 20;
//		for(int i = 0; i<p.length ; i++){
//			System.out.println(p[i]);
//		}

	}

}
