package strings2020;

public class StringFns1 {

	public static void main(String[] args) {
		String a="abcd";
		String b="xyz";
		String c="abcd xyz klmn 1234 4567";
		int alen=a.length();
		int blen=b.length();
		int clen=c.length();
		if(alen>blen&&alen<clen)
		{
			System.out.println("Lenght of a is greater than b and less than c");
		}
		else
		{
			System.out.println("Lenght of a is not greater than b and not less than c");
		}
		String ab=a.concat(b);
		System.out.println("concat of a & b:"+ab+" and its length:"+ab.length());
		if(ab.length()<clen || ab.length()>5)
		{
			System.out.println("ab length is less than c or greater than 5");
		}
		else
		{
			System.out.println("false");
		}
		if(a.startsWith("ab")==true && b.endsWith("yz")!=true)
		{
			System.out.println(a+" starts with ab and "+b+" do not ends with yz");
		}
		else
		{
			System.out.println(a+" do not starts with ab and "+b+" ends with yz");
		}
		if(c.contains(" ")==true && c.contains("9")==false)
		{
			System.out.println("c contains space and do not contain 9");
		}
		else
		{
			System.out.println("c do not contains space and do contain 9");
		}
		System.out.println(c.charAt(7));
		System.out.println(c.indexOf('k'));
		if((c.charAt(7)=='y'||c.charAt(7)=='z')&&(c.indexOf('k')==9||c.indexOf('k')==10))
		{
			System.out.println("char at 7 is "+c.charAt(7)+" and the position of k is "+c.indexOf('k'));
		}
		else
		{
			System.out.println("false");
		}
		String csplit[]=c.split(" ");
		//System.out.println(csplit.length);
		if(csplit.length==4||csplit.length==5)
		{
			System.out.println("lenght is "+csplit.length);
		}
		else
		{
			System.out.println("lenght is "+csplit.length);
		}
		for(int i=0; i<csplit.length;i++)
		{
			System.out.println(csplit[i]);		
		}
		if(csplit[0]==a || csplit[2]!=a)
		{
			System.out.println("First string of c is same as a and 3rd dtring of c is not same as a variable");
		}
		else 
		{
			System.out.println("false");
		}
		
		
	}

}
