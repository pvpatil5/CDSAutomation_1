

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 
{
	@Test(dataProvider = "getValue")
	public void test1(String src, String dest) 
	{
		//System.out.println(src+"---->"+dest);
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");

		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();

		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

		driver.findElement(By.id("fromCity")).sendKeys(src);
		driver.findElement(By.xpath("//div[text()='"+src+"']")).click();
		
		driver.findElement(By.id("toCity")).sendKeys(dest);
		driver.findElement(By.xpath("//div[text()='"+dest+"']")).click();
		
		
	}

	@DataProvider
	public Object[][] getValue() 
	{

		Object arr[][]= new Object[4][2];	

		arr[0][0]="BOM";
		arr[0][1]="PNQ";

		arr[1][0]="DEL";
		arr[1][1]="BLR";

		arr[2][0]="HYD";
		arr[2][1]="CNN";

		arr[3][0]="DXB";
		arr[3][1]="JFK";

		return arr;
	}
}
