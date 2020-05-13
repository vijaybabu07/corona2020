package packone;

public class Methods {
	public static void a()
	{
		int a=10,b=5;
		System.out.println(a*b);
	}
	public void b()
	{
		int a=2,b=4;
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		a(); //Calling Static method
		Methods o=new Methods();
		o.b(); //Calling Non 1Static method
		//o.a();
		
	}

}
