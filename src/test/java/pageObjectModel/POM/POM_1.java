package pageObjectModel.POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_1 
{

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		WebElement ele=driver.findElement(By.name("user_name"));
		ele.sendKeys("admin");
		Thread.sleep(2000);
		driver.navigate().refresh();
		ele.sendKeys("admin");
		
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();

//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//
//		Thread.sleep(2000);
//		driver.close();

	}
}
