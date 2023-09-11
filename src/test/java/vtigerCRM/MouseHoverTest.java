package vtigerCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();

		Thread.sleep(2000);
		//Mouse Related action
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='More']"))).build().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Purchase Order']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		Thread.sleep(2000);
		driver.close();
	}


}


