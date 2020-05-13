package packone;

public class ConstructOverload {
	int a,b,c;
	ConstructOverload(int m, int n)
	{
		a=m;
		b=n;
	}
	ConstructOverload(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	void total()
	{
		System.out.println(a+b);
	}
	void total1()
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		ConstructOverload o1=new ConstructOverload(30,20);
		o1.total();
		ConstructOverload o2=new ConstructOverload(40, 30, 15);
		o2.total1();
		
		

	}

}
