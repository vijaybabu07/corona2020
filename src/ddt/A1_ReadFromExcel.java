package ddt;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class A1_ReadFromExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream("E:\\Sel\\DDT\\wb1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("abc");
		String a=s.getCell(1, 1).getContents();
		String b=s.getCell(1, 2).getContents();
		String c=s.getCell(0, 0).getContents();
		System.out.println(a+"  "+b+"   "+c);
		

	}

}
