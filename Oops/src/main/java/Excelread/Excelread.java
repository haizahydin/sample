package Excelread;

import java.io.FileInputStream;

public class Excelread 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
public static String readStringData(int row,int colom)
{
	f=new FileInputStream("C:\\Users\\User\\Desktop\\java excel.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	XSSFRow r=sh.getRow();
	XSSFCell c=r.getCell();
	return c.getStringCellValue;
}
public static String readIntegerData(int row,int colom)
{
	f=new FileInputStream("C:\\Users\\User\\Desktop\\java excel.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	XSSFRow r=sh.getRow();
	XSSFCell c=r.getCell();
	int val=(int)c.getNumericCellValue;
	return String.valueOf(val);
			
	
}
}
