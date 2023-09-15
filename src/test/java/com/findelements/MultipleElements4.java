package com.findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> ref = driver.findElements(By.xpath("//table[@class='hdrTabBg']//td[@class='tabUnSelected']/a"));
		
		
		for (int i = 0; i < ref.size(); i++) {
			System.out.println(ref.get(i).getText());
			
		}
		
		
		String parentWindow=driver.getWindowHandle();
		
		driver.getWindowHandles();
		
		
		
		
		
		driver.switchTo().window(parentWindow);
		
		
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
		Thread.sleep(2000);
		driver.close();
	}

}
