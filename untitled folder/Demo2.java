class MyJob extends Thread
{
	private String path ;
	MyJob(String path){
		this.path = path;
	}
	public void run(){
		
		for(int i = 1; i<=5; i++){
			System.out.println("My Thread "+Thread.currentThread().getName()+" i is "+i);
		}
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJob job = new MyJob("c:");
		MyJob job2 = new MyJob("d:");
		job.setName("My");
		job2.setName("Your");
		job.start();
		job2.start();
		System.out.println("Main Thread "+Thread.currentThread().getName());
		for(int i = 10; i<=15; i++){
			System.out.println("Thread "+i+" "+Thread.currentThread().getName());
		}
		
		
	}

}
