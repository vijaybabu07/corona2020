package packone;

public class NonStaticVar {
	//Creating Non static variable
	public int a=10;
	public int b=3;

	public static void main(String[] args) {
		NonStaticVar o=new NonStaticVar();
		System.out.println(o.a*o.b);

	}

}
