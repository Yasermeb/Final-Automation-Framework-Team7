package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.magento.ForgotPasswordPage;
import pages.magento.HomePage;
import pages.magento.SignInPage;

public class ForgotPassword extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSearch.class.getName());

    @Test
    public void forgotPassword() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInButton();


        SignInPage signInPage = new SignInPage(getDriver());

        signInPage.forgotPassword();
//        Thread.sleep(3000);
        String forgotPassword =getCurrentTitle();
        Assert.assertEquals(forgotPassword,"Forgot Your Password? Magento Commerce - website to practice" +
                " selenium | demo website for automation testing | selenium practice sites");
        LOG.info("log to forgot password");

        ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage(getDriver());
        forgotPasswordPage.emailForRestoringPass();
//        Thread.sleep(3000);
        signInPage.resetMyPasswordBtn();
//        Thread.sleep(3000);
        String error= signInPage.getRequiredField();
        Assert.assertEquals(error,"This is a required field.");
        LOG.info("error message shows up");
//        Thread.sleep(3000);

    }





}



