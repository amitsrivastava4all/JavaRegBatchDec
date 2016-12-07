class MyInteger{
	int t ;
	int l ;
	MyInteger(int t, int l){
		this.t= t;
		this.l = l;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 10;
		p++;
		MyInteger obj = new MyInteger(90, 100);
		int tt = obj.t;
		tt++;
		//obj++;
		Integer p1 =new Integer(20);
		p1++;
		
		int w = p1.intValue();
		w++;
		p1 = new Integer(w);
	}

}
