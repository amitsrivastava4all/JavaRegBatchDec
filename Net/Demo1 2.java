import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Demo1 {
	static void readWrite() throws Exception {
		String path = "";
		FileOutputStream fs = new FileOutputStream(path);
		
	}
	static void readExcel() throws Exception{
		String path = "/Users/amit/Desktop/Sample.xls";
		FileInputStream fi = new FileInputStream(path);
		//XSSFWorkbook
		HSSFWorkbook workBook = new HSSFWorkbook(fi);
		HSSFSheet sheet = workBook.getSheetAt(0);
		Iterator<Row> rows = sheet.rowIterator();
		while(rows.hasNext()){
			Row currentRow = rows.next();
			Iterator<Cell> cells = currentRow.cellIterator();
			while(cells.hasNext()){
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==Cell.CELL_TYPE_STRING){
					System.out.print(currentCell.getStringCellValue()+" ");	
				}
				else
				if(currentCell.getCellType()==Cell.CELL_TYPE_NUMERIC){	
					System.out.print(currentCell.getNumericCellValue()+" ");
				}
			}
			System.out.println();
		}
		workBook.close();
		fi.close();
		
	}
	public static void main(String[] args) throws Exception {
		readExcel();

	}

}
