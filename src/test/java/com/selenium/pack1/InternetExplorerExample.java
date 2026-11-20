package com.selenium.pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class InternetExplorerExample 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.edge.driver","");
		WebDriver driver=new InternetExplorerDriver();
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
		System.out.println("FaceBook lauched in InternetExplorer Successfully");
	}
}