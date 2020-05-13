package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class A5_ReadWriteExcel {

	public static void main(String[] args) throws Exception{
		FileInputStream f1=new FileInputStream("E:\\Sel\\DDT\\wb1.xls");
		Workbook w1=Workbook.getWorkbook(f1);
		Sheet s1=w1.getSheet("Sheet7");
		String a=s1.getCell(5,6).getContents();
		System.out.println("String1:"+a);
		
		FileInputStream f2=new FileInputStream("E:\\Sel\\DDT\\wb2.xls");
		Workbook w2=Workbook.getWorkbook(f2);
		Sheet s2=w2.getSheet("Sheet11");
		String b=s2.getCell(9,10).getContents();
		System.out.println("String2:"+b);		
		
		String ab=a.concat(b);
		System.out.println(ab);
		
		FileOutputStream fout=new FileOutputStream("E:\\Sel\\DDT\\wb1wb2.xls");
		WritableWorkbook wout=Workbook.createWorkbook(fout);
		WritableSheet sout=wout.createSheet("Sheet5", 5);
		Label l=new Label(12, 14, "String concat:"+ab);
		sout.addCell(l);
		wout.write();
		wout.close();
	}

}
