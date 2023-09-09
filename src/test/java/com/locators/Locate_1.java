package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// for locating elements on web page selenium has 2 methods 
		// 1. find Element
		// 2. find Elements
		
		// Locators
		
		driver.findElement(By.id("email")).sendKeys("Pavan");
		driver.findElement(By.id("pass")).sendKeys("123");
		

	}

}
