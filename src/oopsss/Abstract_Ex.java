package oopsss;
abstract class Shape
{
	abstract void draw();
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("triangle");
	}
}

public class Abstract_Ex {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		Triangle t=new Triangle();
		t.draw();
		

	}

}
