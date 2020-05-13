package ddt;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class B1_ToNotePad {

	public static void main(String[] args) throws Exception{
		FileWriter f=new FileWriter("E:\\Sel\\DDT\\test12.txt");
		BufferedWriter b=new BufferedWriter(f);
		b.write("This is bj");
		b.close();

	}

}
