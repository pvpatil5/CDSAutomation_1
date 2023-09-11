package vtigerCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));

			Actions act = new Actions(driver);
			act.moveToElement(electronics).build().perform();
			
			
	}


}


