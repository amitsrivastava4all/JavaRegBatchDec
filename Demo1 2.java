import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String regEx = "[0-9]{3}[-]+";
		String regEx = "\\d";
		
		
//		boolean r = Pattern.matches(regEx, sentence);
//		if(r){
//			System.out.println("Found");
//		}
//		else
//		{
//			System.out.println("Not Found..");
//		}
		//System.out.println("Group Count "+m.groupCount());
		
		int index = 0;
		String sentence = "A1345B2C3";
		StringBuffer sb  = new StringBuffer(sentence);
		while(true){
			
			Pattern p = Pattern.compile(regEx);
			Matcher m = p.matcher(sentence);
//			if(m.find()){
//			System.out.println(m.start());
//			}
			if(!m.find()){
				break;
			}
			sb.deleteCharAt(m.start());
			sentence = sb.toString();
			 sb  = new StringBuffer(sentence);
			
			
		//System.out.println(m.group());
		//System.out.println(m.start() +" "+m.end());
		//temp = temp + sentence.substring(index,m.start());
		//
		}
		System.out.println("SB "+sb);
		//System.out.println("Temp "+temp);

	}

}
