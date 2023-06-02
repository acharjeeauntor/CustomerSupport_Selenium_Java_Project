package org.auntor.testCases;

import org.auntor.pageObjects.HomePage;
import org.auntor.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginModuleTest extends BaseClass {


	LoginPage loginPage;
	HomePage homePage;

	@Test(priority = 1, description = "User will be able to login to the portal using valid information.")
	public void portalLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);

		loginPage.signInToPortal(userEmail,userPassword);
		Assert.assertEquals(homePage.isFindTalentElementDisplayed(),true);

	}

}
