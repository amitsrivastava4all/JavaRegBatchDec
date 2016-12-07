
public class BadUseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select * from products";
		Runtime r = Runtime.getRuntime(); // Singleton 
		System.out.println("Before Loop Heap is ");
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory "+r.freeMemory());
		System.out.println("Used Memory "+(r.totalMemory()- r.freeMemory()));
		int i = 1;
		long startTime = System.currentTimeMillis();
		while(i<=100000){
			String sql2 = "select * from products";
//		String productType ="Mobile"+i;
//		if(productType!=null){
//			sql= sql +" where type='"+productType+"'";
//		}
		i++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime));
		System.out.println("After Loop Heap is ");
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory "+r.freeMemory());
		System.out.println("Used Memory "+(r.totalMemory()- r.freeMemory()));

	}

}
