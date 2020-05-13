package webdriver;

public class A8_CallingMethods {

	public static void main(String[] args) {
		A7_Methods m=new A7_Methods();
		m.launchApp("http://demo.borland.com/InsuranceWebExtJS/index.jsf");
		m.elementEnabled("login-form:email", true);
		m.linksCount(8);
		m.titleLength(18);
		m.url("z");
		m.titleStarts("Ins");
		m.closeApp();
	}

}
