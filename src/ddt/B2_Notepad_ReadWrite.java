package ddt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class B2_Notepad_ReadWrite {

	public static void main(String[] args) throws Exception{
		FileReader f1=new FileReader("E:\\Sel\\DDT\\test.txt");
		BufferedReader b1=new BufferedReader(f1);
		String s1=b1.readLine();
		
		FileReader f2=new FileReader("E:\\Sel\\DDT\\test12.txt");
		BufferedReader b2=new BufferedReader(f2);
		String s2=b2.readLine();
		
		String s3=s1.concat(s2);
		
		FileWriter f3=new FileWriter("E:\\Sel\\DDT\\testtest12.txt");
		BufferedWriter b3=new BufferedWriter(f3);
		b3.write(s3);
		b3.close();
		
		FileOutputStream fout=new FileOutputStream("E:\\Sel\\DDT\\testtest12excel.xls");
		WritableWorkbook wb=Workbook.createWorkbook(fout);
		WritableSheet s=wb.createSheet("op", 1);
		Label l=new Label(2, 2, s3);
		s.addCell(l);
		wb.write();
		wb.close();
		

	}

}
