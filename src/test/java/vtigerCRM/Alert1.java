package vtigerCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.name("cusid")).sendKeys("543210");
		
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath("//a[text()='Insurance Project']")).click();
		

	}

}
