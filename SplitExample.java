import java.util.ArrayList;
import java.util.Collections;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String value = "IAMAKHIL";
//		String array[]= value.split("[A-Z]{3}");
//		System.out.println(array.length);
//		
//		for(String s : array){
//			System.out.println("Value is "+s);
//		}
		
		String value = "564WElcometojava";
		String str = "";
		int index = 0;
		ArrayList<String> strArray = new ArrayList<>();
		while(true){
			str = value.substring(index, 3);
			strArray.add(str);
			//System.out.println(str);
			value = value.substring(1);
			System.out.println(str);
			if(value.length()==2){
				break;
			}
		}
		Collections.sort(strArray
				,(o1,o2)->o1.compareToIgnoreCase(o2));
		System.out.println("After Sort ");
		for(String s :strArray){
			System.out.println(s);
		}

	}

}
