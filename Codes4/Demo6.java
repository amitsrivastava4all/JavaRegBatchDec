
class Employee{
	int x;
	
	Dept getDept(){
		return new Dept();
	}
	
	static class Job
	{
		static void show(){
			System.out.println("Show....");
		}
	}
	Employee(){
		Dept e = new Dept();
		e.print();
	}
	 class Dept
	{
		void print(){
			System.out.println("Dept Print...");
		}
	}
}
public class Demo6 {

	public static void main(String[] args) {
		Employee.Job.show();
		Employee.Dept d = new Employee().new Dept();
		d.print();
		Employee e = new Employee();
		//e.x=100;
		//Employee.Dept d = e.new Dept();
		//d.print();
		

	}

}
