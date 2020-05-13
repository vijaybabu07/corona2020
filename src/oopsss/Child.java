//Single Inheritance
package oopsss;
class Parent{
	void land()
	{
		System.out.println("land");
	}
}
public class Child extends Parent{
	void shares()
	{
		System.out.println("Shares");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.land();
		c.shares();
		

	}

}
