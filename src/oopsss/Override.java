package oopsss;
class A{
	public void a1()
	{
		System.out.println("m method in A class");
	}
}
class B extends A{
	public void a1()
	{
		System.out.println("m method in B class");
	}
}
class C extends B{
	public void a1()
	{
		System.out.println("m method in C class");
	}
}

public class Override extends C {

	public static void main(String[] args) {
		Override o=new Override();
		o.a1();
		

	}

}
