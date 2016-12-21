import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;



/*
 * throw early and catch later
 * Stream - Flow of Data
 * InputStream - Read Stream (Binary)
 * OutputStream - Write Stream (Binary)
 * FileOutputStream - File (Disk) Output(Write) Stream (Flow) 
 */
class FileOperations{
	/*
	 * throws is a keyword and it says don't handle the exception right now
	 * and throw it to the caller , so caller will treat this exception
	 * throws always on method level
	 */
	void writeDataInFile(String data, String filePath) throws IOException{
		FileOutputStream fs =null;
		try{
//			if(10>2){
//			throw new ArrayIndexOutOfBoundsException();
//			}
		 fs = new FileOutputStream(filePath); //throw new FileNotFoundException
		 fs.write(data.getBytes());
		 System.out.println("Data Store....");
		 if(10>2){
			 System.exit(0);
		 //return ;
		 }
		}
		// finally block always execute either exception raise or not
		// finally can't be use with out try block
		finally{
			// Resource CleanUp...
			if(fs!=null){
				fs.close();
				System.out.println("File Close Now...");
			}
			System.out.println("Finally Call....");
		}
		System.out.println("After Finally , I Never Execute...");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Demo2.class);
		logger.debug("I am Inside a Main" );
		FileOperations fp = new FileOperations();
		try{
		fp.writeDataInFile("Hello This is the Sample File Text"
				, "/Users/amit/Documents/test111/xyz.txt");
		}
		catch(IOException exception){
//			System.out.println("what is Wrong "+exception);
//			System.out.println("Where is ");
//			exception.printStackTrace();
//			System.out.println("Why "+exception.getMessage() );
			System.out.println("Might Be Wrong Path or File is ReadOnly....");
			//logger.error(exception);
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			
			exception.printStackTrace(pw);
			logger.error(sw.toString());
			//exception.printStackTrace();
		}
		catch(Exception exception){
			System.out.println("Some Other Problem");
			logger.error(exception);
		}
		logger.debug("Main is Going to End...");
	}

}
