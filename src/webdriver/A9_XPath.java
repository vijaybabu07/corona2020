package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_XPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/index.jsf");
		driver.manage().window().maximize();
		//absolute xpath
		driver.findElement(By.xpath("html/body/div/div[3]/div/div[2]/form/div[2]/input")).sendKeys("vijay");
		
		//relative xpath
		driver.findElement(By.xpath("//input[@id='login-form:password']")).sendKeys("babu");
	}

}
