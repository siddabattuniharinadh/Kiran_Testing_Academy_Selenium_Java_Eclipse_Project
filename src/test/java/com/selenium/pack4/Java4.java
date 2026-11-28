package com.selenium.pack4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.findElement(By.id("menuUserLink")).click();
		driver.findElement(By.name("username")).sendKeys("Harinadh");
		driver.findElement(By.name("password")).sendKeys("0123456Hari");
		driver.findElement(By.name("remember_me")).click();
		driver.findElement(By.id("sign_in_btn")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("menuUserLink")).click();
		driver.findElement(By.xpath("(//label[@translate='Sign_out'])[2]")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}