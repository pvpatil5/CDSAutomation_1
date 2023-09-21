package com.Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pom.classes.LoginPage;
import propertyUtils.ReadDataFromPropFile;

public class BaseClass 
{
	public WebDriver driver=null;
	ReadDataFromPropFile readDataPropfile= new ReadDataFromPropFile();
	LoginPage loginPage = null;
	
	/**
	 * This Method will initlize the browser and return driver value
	 * @param browser
	 * @return driver
	 * @throws IOException 
	 */
	@Parameters("browser")
	@BeforeClass
	public WebDriver launchBrowser(String browser) throws IOException 
	{
		//String browser=readDataPropfile.readData("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver= new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		else {
			System.out.println("Pls enter proper browser value");
		}
		
		driver.get(readDataPropfile.readData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		loginPage=new LoginPage(driver);
		return driver;
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException, InterruptedException 
	{
	
		
		loginPage.getUserNameTextFeild().sendKeys(readDataPropfile.readData("username"));
		loginPage.getPasswordTextFeild().sendKeys(readDataPropfile.readData("password"));
		loginPage.getSubmitButton().click();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		System.out.println("========Browser Closed=========");
		Thread.sleep(3000);
		driver.close();
	}
	
}
