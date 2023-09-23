package co.VTiger.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.BaseClass;

import pom.classes.HomePage;

public class TC_01_CreateOrganizationTest extends BaseClass
{

	
	@Test
	public void createOrg() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.getOrgPageLink().click();
	}
}
