package com.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_BasicMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//scroll to bottom of the page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		//WebElement ref=driver.findElement(By.xpath("//h2[text()='Birthday store']"));
		
		//scroll to element
		//js.executeScript("arguments[0].scrollIntoView();", ref);
		
		//sendKeys
		WebElement ele=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		js.executeScript("arguments[0].value='Samsung TV';", ele);
		
		Thread.sleep(1000);
		//click
		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
		//js.executeScript("arguments[0].click();", searchbtn);
		searchbtn.click();
	}

}
