package ddt;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class A4_WriteExcel {

	public static void main(String[] args) throws Exception {
		FileOutputStream f=new FileOutputStream("E:\\Sel\\DDT\\wbout1.xls");
		WritableWorkbook wb=Workbook.createWorkbook(f);
		WritableSheet s=wb.createSheet("calc", 2);
		int a=3,b=4,c;
		c=a*b;
		Label l=new Label(1, 2, "c value is "+c);
		s.addCell(l);
		wb.write();
		wb.close();

	}

}
