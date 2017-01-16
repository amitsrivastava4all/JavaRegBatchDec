import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		final int EOF = -1;
		String sourcePath = "/Users/amit/Documents/FileHandlingTestingCase/B.mp3";
		String targetPath = "/Users/amit/Documents/FileHandlingTestingCase/BCopy.mp3";
		File file = new File(sourcePath);
		File targetFilePath = new File(targetPath);
		System.out.println("Copy Start........");
		if(file.exists()){
			// File Copy Code
			FileInputStream fs = new FileInputStream(file);
			BufferedInputStream bs = new BufferedInputStream(fs);
			FileOutputStream fout = new FileOutputStream(targetFilePath);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			long startTime = System.currentTimeMillis();
			
			int readByte = bs.read();
			while(readByte!=EOF){
				bout.write(readByte);
				readByte = bs.read();
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
			bs.close();
			bout.close();
			fs.close();
			fout.close();
			System.out.println("File Copy Done...");
			file.delete();
		}
		else
		{
			System.out.println("Source Path Not Exist so can't copy the file....");
		}

	}

}
