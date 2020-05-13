package packone;

public class MethodOverload {
	public static void opensheet(String sname)
	{
		System.out.println("Sheet "+sname+" is opened");
	}
	public static void opensheet(int sno)
	{
		System.out.println("Sheet "+sno+" is opened");
	}

	public static void main(String[] args) {
		opensheet(5);
		opensheet("employee");
		

	}

}
