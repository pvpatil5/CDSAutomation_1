package com.multiple.windows;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling3 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("../AutomationTesting/commondata.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String url=prop.getProperty("url");


		String browser=prop.getProperty("browser");

		if(browser.equalsIgnoreCase("Chrome")) {

			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("Pls enter proper browser value");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Thread.sleep(2000);
		System.out.println("Before Click="+driver.getCurrentUrl());

		driver.findElement(By.xpath("//img[@alt='Twitter']")).click();

		driver.findElement(By.xpath("//img[@alt='Facebook']")).click();

		driver.findElement(By.xpath("//img[@alt='Blogs']")).click();

		Thread.sleep(2000);

		// Switch Control from One window to another

		Set<String> allWindows = driver.getWindowHandles();

		// reference is storing all window ids

		System.out.println(allWindows);

		Iterator<String> windows = allWindows.iterator();

		while (windows.hasNext()) 
		{
			String id=windows.next();
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());

			if(driver.switchTo().window(id).getTitle().contains("Vtiger CRM | Bangalore"))
			{
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				driver.quit();
			}


		}




	}

}
