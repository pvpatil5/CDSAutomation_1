package co.VTiger.TestCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Base.BaseClass;

import pom.classes.HomePage;
import pom.classes.HomePage1;

public class TC_02_CreateOrganizationWIthDDTest extends BaseClass implements HomePage1
{

	@Test
	public void createOrgwithDD() throws InterruptedException {
		System.out.println("Executing TC_02_CreateOrganizationWIthDDTest");
		
		selectValueDD(HomePage1.homePagelink, null);
	
		
	}
}
