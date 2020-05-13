package ddt;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class A3_RowsColumnCount {

	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream("E:\\Sel\\DDT\\wb1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("abc");
		int rc=s.getRows();
		System.out.println("No of Rows:"+rc);
		System.out.println("Rows values at 0 column:");
		for( int i=0;i<rc;i++)
		{
			System.out.println(s.getCell(0, i).getContents());	
		}
		System.out.println("==============");
		int cc=s.getColumns();
		System.out.println("No of Columns:"+cc);
		System.out.println("Column values at 0 row:");
		for(int j=0;j<cc;j++)
		{
			System.out.println(s.getCell(j, 0).getContents());
		}
		System.out.println("================");
		
		System.out.println("All values");
		for(int i=0;i<rc;i++)
		{
			for(int j=0;j<cc;j++)
			{
				System.out.println("coulum "+j+" "+"row "+i+"="+s.getCell(j, i).getContents());
				if(s.getCell(j, i).getContents().equals("vj"))
				{
					System.out.println("pass");
					System.out.println("Row:"+s.getCell(j,i).getRow()+" and Column:"+s.getCell(j, i).getColumn());
					
				}
				else
				{
					System.out.println("fail");
					
				}
			}
		}
	}

}
