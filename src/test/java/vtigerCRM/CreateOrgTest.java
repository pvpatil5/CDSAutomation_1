package vtigerCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrgTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td[@class='small']//a[text()='Organizations']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("FP");
		
		driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();
		
		Thread.sleep(2000);
		//handle alert
		//driver.switchTo().alert().accept();
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
		Thread.sleep(2000);
		driver.close();
	}

}
