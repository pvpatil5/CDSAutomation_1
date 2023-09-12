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

public class WindowHandling {
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

		//driver.findElement(By.xpath("//img[@alt='Facebook']")).click();

		Thread.sleep(2000);

		// Switch Control from One window to another

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> allWindows = windows.iterator();

		while (allWindows.hasNext())
		{
			String str = allWindows.next();
			System.out.println();

			driver.switchTo().window(str);
			Thread.sleep(1000);
			System.out.println(driver.getCurrentUrl());

		}

		// [36D1FAFD46B247579D6FA1D76A9BCC93, 52FF7D9FC6CB85FD8CE8534B7D57F2C4]
		// [84631D3B95066F46FD08C79489BFD007, 7EF4F22258DDFA30A5FF37D1D8896049, 5E8C0B851993FD60948DDBE42D817A43]


		//System.out.println("After Click="+driver.getCurrentUrl());



	}

}
