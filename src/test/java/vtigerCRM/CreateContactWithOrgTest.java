package vtigerCRM;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContactWithOrgTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//td[@class='small']//a[text()='Contacts']")).click();

		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

		driver.findElement(By.name("lastname")).sendKeys("FP");

		String parentWindowId=driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@alt='Select']")).click();

		Set<String> allwins = driver.getWindowHandles();

		Iterator<String> windows = allwins.iterator();

		while(windows.hasNext()) {
			String singlewindow=windows.next();
			driver.switchTo().window(singlewindow);
			if(driver.getCurrentUrl().contains("Accounts"))
			{
				break;
			}

		}
		Thread.sleep(2000);
		driver.findElement(By.id("search_txt")).sendKeys("TCS");
		Thread.sleep(1000);
		driver.findElement(By.name("search")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='small']//a[@id='1']")).click();



		Thread.sleep(2000);
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();




		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		Thread.sleep(2000);
		driver.close();



	}

}
