package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public WebDriver driver=null;
	
	/**
	 * This Method will initlize the browser and return driver value
	 * @param browser
	 * @return driver
	 */
	public WebDriver launchBrowser(String browser) 
	{
		
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
		return driver;
	}

}
