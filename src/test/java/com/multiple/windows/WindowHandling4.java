package com.multiple.windows;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling4 {
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
		
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
//		driver.navigate().to("https://facebook.com");
//		Thread.sleep(2000);
//		driver.navigate().to("https://amazon.in");
		
		

	}

}
