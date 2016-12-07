
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "hello"; // char t = {'H','e','l','l','o'};
		StringBuffer sb = new StringBuffer(); // StringBuffer all functions are synchronized
		// synchronized - Only one thread can access at a time (Good for Write Operations)
		//StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(3000);
		sb.append("Hidhgdfjhgfd gdfgdfgdfgdgffdgfdgdfgfdgdfg");
		//length > capacity 
		// new capacity = old capacity * 2 + 2
		sb.ensureCapacity(2000);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
