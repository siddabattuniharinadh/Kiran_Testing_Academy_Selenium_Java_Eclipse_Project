package com.selenium.pack4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Java7_for 
{
	public static void main(String[] args) throws Exception 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito","--start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of links = "+links);
		
		for(int i=0;i<links;i++)
		{
			String text=driver.findElements(By.tagName("a")).get(i).getText();
			System.out.println("text at index "+i+" = "+text);
		}
		
		Thread.sleep(10000);
		driver.quit();
	}
}