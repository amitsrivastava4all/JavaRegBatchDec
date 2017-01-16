import java.io.File;
import java.io.FilenameFilter;
class MyFilter implements FilenameFilter{
	private String ext;
	MyFilter(String ext){
		this.ext = ext;
	}
	
	// .JPG   X.JPG
	@Override
	public boolean accept(File dirPath, String filename) {
		// TODO Auto-generated method stub
		return filename.toUpperCase().endsWith(ext.toUpperCase());
		//return filename.endsWith(ext);
	}
	
}
public class Demo2 {
public static void main(String[] args) {
		String name = "Ram Kumar";
		if(name.endsWith("Kumar")){
			System.out.println("Hello Kumar");
		}
				
		String path = "/Users/amit/Documents/FileHandlingTestingCase";
		File file = new File(path);
		//file.mkdir(); // Single Dir
		//file.mkdirs(); // Nested Dir Creation
		System.out.println("Dir Created");
		MyFilter myfilter = new MyFilter(".mP3");
		File files [] = file.listFiles(myfilter);
		for(File f : files){
			System.out.println(f.getName());
		}

	}

}
