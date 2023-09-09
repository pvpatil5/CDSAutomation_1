package com.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_Class {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/pvpat/OneDrive/Desktop/classname.html");
		driver.manage().window().maximize();
		//Thread.sleep(3000);

		// implicit wait statement
		// Page load time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.findElement(By.className("information")).clear();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.className("information")).sendKeys("Java Handbook");

		//driver.findElement(By.tagName("input")).click();
		
		
		driver.findElement(By.id("name")).sendKeys("Pune");
		
		
	}

}
