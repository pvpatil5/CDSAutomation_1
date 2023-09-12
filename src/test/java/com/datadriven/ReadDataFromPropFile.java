package com.datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromPropFile {
	static WebDriver driver= null;
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("../AutomationTesting/commondata.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String url=prop.getProperty("url");


		String browser=prop.getProperty("browser");

		if(browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver= new ChromeDriver(options);
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


		driver.findElement(By.name("user_name")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("submitButton")).click();

		// Script

	}

}
