package exc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class f2 {
	
	@Test
	public void t1() throws IOException
	{
		File f= new File("C:\\Users\\Admin\\Downloads\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		// number of rows
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		
		// number of columns in row1
		int col=sheet.getRow(1).getLastCellNum();
		System.out.println("Number of columns "+ col);
		
		XSSFCell data = sheet.getRow(5).getCell(2);
		System.out.println(data);
		
		//37,4
		sheet.getRow(37).createCell(4).setCellValue("Raji");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
		
		
	}

}
