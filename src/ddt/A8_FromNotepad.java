package ddt;

import java.io.BufferedReader;
import java.io.FileReader;

public class A8_FromNotepad {

	public static void main(String[] args) throws Exception {
		FileReader f=new FileReader("E:\\Sel\\DDT\\test.txt");
		BufferedReader b=new BufferedReader(f);
		String s=b.readLine();
		System.out.println(s);

	}

}
