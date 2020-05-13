package strings2020;

public class StringFns {

	public static void main(String[] args) {
		String a="abcdef";
		String b="xyz1234";
		String c="abcxy";
		String d="AbcXy";
		int alen=a.length();
		int blen=b.length();
		int clen=c.length();
		System.out.println("length of a="+alen);
		System.out.println("length of b="+blen);
		System.out.println("length of c="+clen);
		if(alen>clen&&alen<blen)
		{
			System.out.println("Lenght of a is greater than c and less than b");
		}
		else
		{
			System.out.println("False");
		}
		if(a.equals(b)==false && a.equals(c)!=true)
		{
			System.out.println("a is not same as b and c");
		}
		else
		{
			System.out.println("false");
		}
		if(c.equalsIgnoreCase(d)==true)
		{
			System.out.println("c variable is same as d variable");
		}
		else
		{
			System.out.println("false");
		}
		if(a.contains("cd")==true&&a.contains("xy")==false)
		{
			System.out.println(a+" contains cd and doesnt contain xy");
		}
		else
		{
			System.out.println("false");
		}
		String bupper=b.toUpperCase();
		System.out.println("B upper case:"+bupper);
		if(bupper.contains("Z")==true&&bupper.contains("z")==false)
		{
			System.out.println("bupper contians Z");
		}
		else
		{
			System.out.println("bupper contians z");
		}
	}

}
