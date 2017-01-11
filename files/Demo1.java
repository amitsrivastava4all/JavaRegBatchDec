import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		//  File  - Predefine class , and this class is used to create, delete, rename, path info , dir create , dir scan 
		// can't read file and can't write a file
		String path = "/Users/amit/Documents/FileHandlingTestingCase/abc";
		File file = new File(path);
		int fileCount = 0;
		int dirCount = 0;
		//file.mkdir()
		if(file.exists()){
			System.out.println("File Exist");
			File fileFolderList [] = file.listFiles();
			for(File fileName : fileFolderList){
				if(fileName.isDirectory()){
					System.out.println(fileName.getName() +"<DIR>");
					dirCount++;
				}
				else
				{
					fileCount++;
					File ren = new File(fileName.getParent()+"/Virus"+fileCount+".haha");
					
					fileName.renameTo(ren);
					//file.delete();
					System.out.println(":::"+fileName.getParent()+"<FILE>");
				}
			}
			System.out.println("File Count is "+fileCount+" Dir Count is "+dirCount);
			//file.delete();
		}
		else
		{
			System.out.println("File Not Exist"); 
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Can't Create File ... ");
				//e.printStackTrace();
			}
			System.out.println("File Created...");
			
			
		}
		
		

	}

}
