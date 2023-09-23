package co.VTiger.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_05_ReadMvnTest {

	@Test
	public void read() {
		System.out.println("Read Data");
		
		String UN=System.getProperty("username");
		String pwd=System.getProperty("password");
		
		System.out.println("**UN**="+ UN);
		
		System.out.println("**PWD**="+ pwd);
		
	

	}
}
