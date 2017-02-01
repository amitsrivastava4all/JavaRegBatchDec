import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class RR
{
	private int p;
	public int m;
	public int t;
	static int l;
	public void print(){
		System.out.println("Print call");
	}
	private void display(){
		System.out.println("display call");
	}
}
public class MetaInfo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RR obj = new RR();
		Class cls = obj.getClass(); //Meta + data
		//Class cls = RR.class;  // Meta 
		int publicCount =0;
		int privateCount = 0;
		int staticCount = 0;
		Method methods[] = cls.getDeclaredMethods();
		for(Method method:methods){
			method.setAccessible(true);
			method.invoke(obj, null);
			
			System.out.println(method.getName());
		}
		Field fields[] = cls.getDeclaredFields();
		for(Field field : fields){
			int mod = field.getModifiers();
			System.out.println("MOd "+mod);
			if(Modifier.isPublic(mod)){
				publicCount++;
			}
			else
			if(Modifier.isPrivate(mod)){	
				privateCount++;
			}
			else
			if(Modifier.isStatic(mod))	{
				staticCount++;
			}
			System.out.println(field.getName());
		}
		System.out.println("Static are "+staticCount);
		System.out.println("Private are "+privateCount);
		System.out.println("Public are "+publicCount);
			
		Constructor cons[]= cls.getConstructors();
		Class parentClass = cls.getSuperclass();
		System.out.println(parentClass.getName()+" "+parentClass);
		Class interfaces[] = cls.getInterfaces();
		
	}

}
