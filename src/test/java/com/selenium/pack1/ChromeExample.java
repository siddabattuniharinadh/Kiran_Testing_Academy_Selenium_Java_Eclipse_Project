package com.selenium.pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExample 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");		
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.quit();
		System.out.println("FaceBook lauched in Chrome Successfully");
	}
}