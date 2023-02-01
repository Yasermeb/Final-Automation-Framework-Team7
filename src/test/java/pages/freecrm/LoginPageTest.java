package pages.freecrm;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonAPI {
	LoginPage loginPage;
	public LoginPageTest(){
		super();
	}

	@Test(priority=1)
	public void loginPageTitleTest(){
		Assert.assertTrue(false);
		HomePage homePage =new HomePage(driver);
		homePage.clickOnLogin();
		Assert.assertTrue(false);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
//		String title = loginPage.validateLoginPageTitle();
//		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}
	
//	@Test(priority=2)
//	public void crmLogoImageTest(){
//		boolean flag = loginPage.validateCRMImage();
//		Assert.assertTrue(flag);
//	}
//
//	@Test(priority=3)
//	public void loginTest(){
//
//	}
}