package tasks.tasks_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling getExcelData method to read the data from excel
				FileIO x=new FileIO();
				
				for (int i=0;i<4;i++) {
					for (int j=0;j<2;j++) {
						System.out.print(x.getExcelData("Sheet1", i, j) + " ");
					}
					System.out.println(" ");
				}
				
				x.writeToExcel("Sheet1", 1,"John Doe", 30, "john@test.com");
				x.writeToExcel("Sheet1",2, "Jane Doe", 28, "jane@test.com");
				x.writeToExcel("Sheet1", 3,"Bob Smith", 35, "Bob@test.com");
				x.writeToExcel("Sheet1",4, "Swapnil", 37, "Swap@test.com");
			}
			
			public void writeToExcel(String sheetName, int rownum,String name, int age, String email) {
				FileInputStream fis;
				XSSFWorkbook wb;
				try {
					fis = new FileInputStream("Utils//Student.xlsx");
					wb = new XSSFWorkbook(fis);
					XSSFSheet s=wb.getSheet(sheetName);
					XSSFRow r=s.getRow(rownum);
					XSSFCell c=r.createCell(age);
					c.setCellValue(email);
					FileOutputStream fos=new FileOutputStream("Utils//Student.xlsx");
					wb.write(fos);
					fos.close();
					fis.close();
					wb.close();
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
				
			}
			
			
			public String getExcelData(String sheetName, int rowNum, int colNum) {
				String retVal=null;
				
				try {
					FileInputStream fis=new FileInputStream("Utils//Student.xlsx");
					XSSFWorkbook wb=new XSSFWorkbook(fis);
					XSSFSheet s=wb.getSheet(sheetName);
					XSSFRow r=s.getRow(rowNum);
					XSSFCell c=r.getCell(colNum);
					retVal=FileIO.getCellValue(c);
					fis.close();
					wb.close();
					} 			
					 catch (FileNotFoundException e) {
					e.printStackTrace();
			    	
					 }  catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				     }
				return retVal;
				
			}
			
			public static String getCellValue(XSSFCell c) {
				switch (c.getCellType()) {
				case NUMERIC:
					return String.valueOf(c.getNumericCellValue());  //10   -> "10"
				case BOOLEAN:
					return String.valueOf(c.getBooleanCellValue());
				case STRING:
					return c.getStringCellValue();
				default :	
					return c.getStringCellValue();
				}
						
	}

}
