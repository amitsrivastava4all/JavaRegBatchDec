
public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(20); // Java 5
		//StringBuffer sb = new StringBuffer(20);
		// synchronized (Only Single Thread can access it )
		sb.append("ram"); //insertion
		sb.append(1000);
		sb.insert(0, "Hi"); //insertion
		sb.deleteCharAt(0); //deletion
		sb.delete(2, 5) ; // 2 nd index and 5th Position
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(0));
		sb.ensureCapacity(30);
		sb.setCharAt(0, 'A');  //Update
		sb.trimToSize();
		System.out.println("After Trim");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println();
		
	}

}
