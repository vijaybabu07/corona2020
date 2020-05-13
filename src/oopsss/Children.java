//multi level Inheritance
package oopsss;

class GrandParents
{
	void land()
	{
		System.out.println("land");
	}
}
class Parents extends GrandParents
{
	void gold()
	{
		System.out.println("gold");
	}
}
public class Children extends Parents {
	void shares()
	{
		System.out.println("shares");
	}

	public static void main(String[] args) {
		Children c=new Children();
		c.land();
		c.gold();
		c.shares();

	}

}
