package com.selenium.pack4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Java6_Switch 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		String browser="ie";
		switch(browser)
		{
		case "chrome" :
			ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito","--start-maximized");
            driver = new ChromeDriver(options);
			break;
		case "edge" :
			EdgeOptions eo=new EdgeOptions();
			eo.addArguments("--inprivate","--start-maximized");
			driver=new EdgeDriver(eo);
			break;
		case "firefox" :
			FirefoxOptions fo=new FirefoxOptions();
			fo.addArguments("--private-window");
			driver=new FirefoxDriver(fo);
			driver.manage().window().maximize();
			break;
		case "ie" :
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			break;
		default :
			ChromeOptions co = new ChromeOptions();
            co.addArguments("--incognito","--start-maximized");
			driver=new ChromeDriver(co);
			break;
		}
		driver.get("https://www.youtube.com");
		Thread.sleep(10000);
		driver.quit();
	}
}