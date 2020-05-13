package ddt;

import java.io.BufferedReader;
import java.io.FileReader;

public class A9_FromNotepad_MultipleRows {

	public static void main(String[] args) throws Exception{
		FileReader f=new FileReader("E:\\Sel\\DDT\\test.txt");
		BufferedReader b=new BufferedReader(f);
		String s;
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		}

	}

}
