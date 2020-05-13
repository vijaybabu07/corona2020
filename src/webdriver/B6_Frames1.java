package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B6_Frames1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		WebElement f1=driver.findElement(By.name("packageFrame"));
		WebElement f2=driver.findElement(By.name("packageListFrame"));
		//driver.switchTo().frame(f1);
		String name=driver.switchTo().frame(f1).findElement(By.xpath("//a[contains(@href,'AbstractMap.html')]")).getText();
		System.out.println(name);
		driver.switchTo().parentFrame();
		String name1=driver.switchTo().frame(f2).findElement(By.xpath("//a[contains(@href,'org/w3c/dom/package-fr')]")).getText();
		System.out.println(f1+"="+name);
		System.out.println(f2+"="+name1);
		driver.switchTo().parentFrame();  //switch to parent frame
		WebElement f3=driver.findElement(By.name("classFrame")); //switch to required frame
		//get links from required frame
		List<WebElement> links=driver.switchTo().frame(f2).findElements(By.tagName("a")); 
		System.out.println("No of links="+links.size());
		for(int i=0;i<links.size();i++)
		{
			String lname=links.get(i).getText();
			System.out.println(lname);
		}
		driver.close();
	}

}
