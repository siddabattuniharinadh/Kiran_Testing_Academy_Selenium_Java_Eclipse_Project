package com.selenium.pack1;
import java.nio.file.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class OperaExample
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*", "--start-maximized");
		//options.setBinary(Paths.get(System.getenv("LOCALAPPDATA"), "Programs", "Opera", "140.0.6074.36", "opera.exe").toString());
		options.setBinary("C:\\Users\\HARI\\AppData\\Local\\Programs\\Opera\\140.0.6074.36\\opera.exe");
		System.setProperty("SE_CHROMEDRIVER_VERSION", "157");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(10000);
		driver.quit();
		System.out.println("FaceBook lauched in Opera Successfully");
	}
}