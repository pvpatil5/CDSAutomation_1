package com.findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> refrence = driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));

		for (int i = 0; i <refrence.size(); i++)
		{
			System.out.println(refrence.get(i).getText());
		}
		
	}

}
