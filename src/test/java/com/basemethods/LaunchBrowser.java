package com.basemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
	
	   WebDriver driver = new ChromeDriver();
	   
	   Thread.sleep(3000);
	   
	   driver.get("https://www.selenium.dev/");
	   
	   // maximize browser
	   driver.manage().window().maximize();
	   
	   Thread.sleep(3000);
	   
	   driver.manage().window().minimize();
	   
	   Thread.sleep(3000);
	   
	   driver.close();
	   
	   
	   
		
	
		

	}
	
	
}
