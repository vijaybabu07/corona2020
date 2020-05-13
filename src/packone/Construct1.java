package packone;

public class Construct1 {

	Construct1()
	{
		System.out.println("This is constructor");
	}
	public void meth()
	{
		System.out.println("This is method");
	}
	public static void main(String[] args) {
		Construct1 o=new Construct1();
		o.meth();
	}

}
