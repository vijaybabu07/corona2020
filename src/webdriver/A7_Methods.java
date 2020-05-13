package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7_Methods {

	public WebDriver driver;
	
	public void launchApp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void closeApp()
	{
		driver.close();
	}
	public void elementEnabled(String loc, boolean exp)
	{
		boolean act=driver.findElement(By.id(loc)).isEnabled();
		if(act==exp)
		{
			System.out.println("Element is enabled");
		}
		else
		{
			System.out.println("Element is not enabled");
		}
	}
	public void linksCount(int lexp)
	{
		List<WebElement> l=driver.findElements(By.tagName("a"));
		int lcount=l.size();
		if(lcount==lexp)
		{
			System.out.println("Actual links count:"+lcount+" is same as "+lexp);
		}
		else
		{
			System.out.println("Actual links count:"+lcount+" is not same as "+lexp);
		}
	}
	public void titleLength(int texp)
	{
		String t=driver.getTitle();
		int tlength=t.length();
		if(tlength==texp)
		{
			System.out.println("Actual title length:"+tlength+" is same as "+texp);
		}
		else
		{
			System.out.println("Actual title length:"+tlength+" is not same as "+texp);
		}
	}
	public void url(String s)
	{
		String u=driver.getCurrentUrl();
		if(u.contains(s)==true)
		{
			System.out.println(u+" contains "+s);
		}
		else
		{
			System.out.println(u+" do not contains "+s);
		}
		
	}
	public void titleStarts(String tstarts)
	{
		String t=driver.getTitle();
		if(t.startsWith(tstarts)==true)
		{
			System.out.println(t+" starts with "+tstarts);
		}
		else
		{
			System.out.println(t+" do not starts with "+tstarts);
		}
	}

}
