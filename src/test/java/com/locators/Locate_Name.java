package com.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_Name {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfacebook%20login%20account%7C&placement=&creative=589460569900&keyword=facebook%20login%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-296914611740%26loc_physical_ms%3D9062122%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwxuCnBhDLARIsAB-cq1pa_r3jQkvTgwdfnlcSbFiFVYmJgIjH13fUCoMP_aAfrHCyu0cxOE4aAl4iEALw_wcB");
		driver.manage().window().maximize();
		//Thread.sleep(3000);

		// implicit wait statement
		// Page load time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.name("firstname")).sendKeys("Niraj");

		driver.findElement(By.name("reg_passwd__")).sendKeys("123");


	}

}
