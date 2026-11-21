package com.selenium.pack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	public static void main(String[] args) 
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
		
		driver.findElement(By.partialLinkText("languages…")).click();
		System.out.println("more languages clicked");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		System.out.println("Test Completed");
	}
}