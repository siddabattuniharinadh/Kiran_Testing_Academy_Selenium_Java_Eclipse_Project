package com.selenium.pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxExample 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver","");
		WebDriver driver=new FirefoxDriver();
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
		System.out.println("FaceBook lauched in Firefox Successfully");
	}
}