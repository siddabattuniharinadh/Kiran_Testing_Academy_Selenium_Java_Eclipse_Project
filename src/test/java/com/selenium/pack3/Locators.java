package com.selenium.pack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators 
{
	@Test
	public void Test1() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("_R_c9l6neappb6amH1_")).sendKeys("hari@gmail.com");
		System.out.println("Username Entered");
		driver.findElement(By.name("pass")).sendKeys("1234567890");
		System.out.println("Password Entered");
		
		
		
		//driver.findElement(By.xpath("//span[text()='Forgotten password?']")).click();
		//System.out.println("Forgot Password clicked");
		
		//driver.findElement(By.linkText("తెలుగు")).click();
		//System.out.println("తెలుగు Clicked");
		
		//driver.findElement(By.partialLinkText("languages…")).click();
		//System.out.println("more languages clicked");
		
		//int linksCount=driver.findElements(By.tagName("a")).size();
		//System.out.println("Total number of links in HomePage = "+linksCount);
		
		//String text=driver.findElement(By.className("x9f619 x1ja2u2z x78zum5 x2lah0s x1n2onr6 x1nhvcw1 x6s0dn4 xozqiw3 x1q0g3np xyri2b x1c1uobl x18d9i69 xyamay9 x1ws5yxj xw01apr")).getText();
		//System.out.println(text);
		
		//driver.findElement(By.xpath("//span[text()='Forgotten password?']")).click();
		
		driver.findElement(By.cssSelector("div[class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1'] div[class='html-div xdj266r xat24cr xexx8yu xyri2b x18d9i69 x1c1uobl x6s0dn4 x78zum5 xl56j7k x1e0frkt xf0ucvx xx2axb6']")).click();
		
		try 
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.quit();
		System.out.println("Test Completed");
	}
}