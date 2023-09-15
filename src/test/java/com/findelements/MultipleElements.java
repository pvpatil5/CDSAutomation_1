package com.findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for ?']")).click();
		
		
		List<WebElement> refrence = driver.findElements(By.xpath("//div[contains(@class,'SearchInputDropdown')]//a"));

		for (int i = 0; i <refrence.size(); i++)
		{
			System.out.println(refrence.get(i).getText());
		}
		
	}

}
