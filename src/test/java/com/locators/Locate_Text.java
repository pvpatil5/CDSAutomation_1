package com.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_Text {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);

		// implicit wait statement
		// Page load time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.linkText("Create new account")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("CDS");
		driver.findElement(By.name("lastname")).sendKeys("Java");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("9876543210");
		
		
		driver.findElement(By.xpath("/html/body/div/"));

	}

}
