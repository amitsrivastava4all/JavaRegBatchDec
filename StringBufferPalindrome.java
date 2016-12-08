
public class StringBufferPalindrome extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="nitin";
		StringBuffer org = new StringBuffer(name);
		StringBuffer dup = new StringBuffer("nitin");
		org.reverse();
		System.out.println("After Reverse "+org);
		System.out.println("And Dup "+dup);
		
		if(org.toString().equals(dup.toString())){
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}

	}

}
