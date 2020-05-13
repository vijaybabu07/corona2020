package oopsss;
class Parents1
{
	void land()
	{
		System.out.println("land");
	}
}
class Child1 extends Parents1
{
	void shares()
	{
		System.out.println("shares");
	}
}
public class Child2 extends Parents1{

	void flat()
	{
		System.out.println("flat");
	}
	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.land();
		c1.shares();	
		Child2 c2=new Child2();
		c2.land();
		c2.flat();

	}

}
