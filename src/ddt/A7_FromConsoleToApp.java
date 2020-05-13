package ddt;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7_FromConsoleToApp {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter URL:");
		String url=s.nextLine();
		System.out.println(url);
		System.out.println("Enter tag:");
		String tag=s.nextLine();
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> tagno=driver.findElements(By.tagName(tag));
		System.out.println("No of tags(links/imgs)"+tagno.size());
		
	}

}
