package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_Validations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create Account")).click();
		String title=driver.getTitle();
		System.out.println("title:"+title);
		String url=driver.getCurrentUrl();
		System.out.println("url:"+url);
		int tlen=title.length();
		System.out.println("title length:"+tlen);
		int ulen=url.length();
		System.out.println("url length:"+ulen);
		if(tlen>ulen)
		{
			System.out.println("title length "+tlen+" is greater than URL length "+ulen);
		}
		else
		{
			System.out.println("title length "+tlen+" is smaller than URL length "+ulen);
		}
		boolean Registeravail=driver.findElement(By.id("Register")).isDisplayed();
		if(Registeravail==true)
		{
			System.out.println("Create my acccount button available");
		}
		else
		{
			System.out.println("Create my acccount button is not available");
		}
		boolean Registerenable=driver.findElement(By.id("Register")).isEnabled();
		if(Registerenable==true)
		{
			System.out.println("Create my acccount button is enabled");
		}
		else
		{
			System.out.println("Create my acccount button is not enabled");
		}
		if(title.contains("Free")==true)
		{
			System.out.println("title contains Free");
		}
		else
		{
			System.out.println("title does not contains Free");
		}
		driver.close();
	}

}
