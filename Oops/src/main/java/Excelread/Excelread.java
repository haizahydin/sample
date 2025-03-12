package Excelread;

import java.io.FileInputStream;

public class Excelread 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
public static String readStringData(int row,int colom)
{
	f=new FileInputStream("");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("");
	XSSFRow r=sh.getRow();
	XSSFCell c=r.getCell();
	return c.getStringCellValue;
}
public static String readIntegerData(int row,int colom)
{
	f=new FileInputStream("");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("");
	XSSFRow r=sh.getRow();
	XSSFCell c=r.getCell();
	int val=c.getNumericCellValue;
	return String.valueOf(val);
			
	
}
}
