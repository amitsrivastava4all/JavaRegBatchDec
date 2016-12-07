import java.util.Scanner;
class T
{
	int k; // Instance Variables
	int l;
	static int p; // CLASS VARIABLE
	T(){
		k++;
		l++;
		p++;
		System.out.println("K is "+k+" L is  "+l+" and P is "+p);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		T obj1 = new T();
		T obj2 = new T();
		T obj3 = new T();
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		//System.out.println("Enter the Row");
		int row = 3;
		//int row = scanner.nextInt();
		//int q[][]= new int[row][3];
		int q[][] = {{0,0,0},{1,1,0},{-1,-1,0}};
//		for(int i = 0; i<row; i++){
//			//for(int j= 0 ; j<3; j++){
////				System.out.println("Enter the X");
////					q[i][0] = scanner.nextInt();
////					System.out.println("Enter the Y");
////					q[i][1] = scanner.nextInt();
////					System.out.println("Enter the Z");
////					q[i][2] = scanner.nextInt();
//			//}
//		}
		
		// Sum Logic
		int xSum = 0;
		int ySum = 0;
		int zSum = 0;
		for(int i = 0; i<row ; i++){
			xSum = xSum  + q[i][0];
			ySum = ySum + q[i][1];
			zSum = zSum + q[i][2];
		}
		System.out.println(xSum==0 && ySum==0 && zSum==0?"Yes  ":"No");
		
		
		

	}

}
