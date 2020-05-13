package packone;

public class ConsructArgs {
	int a,b;
	ConsructArgs(int m, int n)
	{
		a=m;
		b=n;
	}
	public void total()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		ConsructArgs o=new ConsructArgs(60,80);
		o.total();
		ConsructArgs o1=new ConsructArgs(70,80);
		o1.total();
		

	}

}
