package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.SpecificMethods;
import pages.LoginPage;

public class CreateLead extends SpecificMethods{
	@Test
	public void runCreateLead() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUsername()
		.enterPassword()
		.clickOnLoginButton()
		.clickCRMLink()
		.clickLeads()
		.clickOnCreateLead()
		.enterFirstname()
		.enterLasttname()
		.enterCompanyname()
		.enterCreateLead()
		.verifyFirstname();
	}

}
