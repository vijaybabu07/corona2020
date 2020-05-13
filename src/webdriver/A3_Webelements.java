package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_Webelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.id("email"));
		name.sendKeys("vijay");
		name.clear();
		name.sendKeys("babu");
		name.clear();
		name.sendKeys("ashvath");
	}

}
