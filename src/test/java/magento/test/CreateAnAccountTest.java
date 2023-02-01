package magento.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.magento.CreateAccountPage;
import pages.magento.HomePage;

public class CreateAnAccountTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSearch.class.getName());
    Faker fakeData = new Faker();
    String emailAddress = fakeData.internet().emailAddress();
    String password = fakeData.internet().password();
    String name = fakeData.name().firstName();
    String lastNam=fakeData.name().lastName();
    @Test
    public void createAccount() throws InterruptedException {
        HomePage homePage=new HomePage(getDriver());
        CreateAccountPage createAnAccountPage=new CreateAccountPage(getDriver());

        homePage.clickOnSignInButton();
//        Thread.sleep(3000);
        String title1=getCurrentTitle();
        Assert.assertEquals(title1,"Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("land to sign in page");
        createAnAccountPage.clickOnCreateAnAccount();
//        Thread.sleep(3000);
        String title2=getCurrentTitle();
        Assert.assertEquals(title2,"Create New Customer Account Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("land to create account page");
        createAnAccountPage.typeFirstName(name);
        Thread.sleep(5000);
        createAnAccountPage.typeLastName(lastNam);
        Thread.sleep(5000);
        createAnAccountPage.signUpForNewsLetter();
        createAnAccountPage.email();
        createAnAccountPage.typePassword(password);
//        Thread.sleep(3000);
        createAnAccountPage.confirmPassword(password);
//        Thread.sleep(3000);
        createAnAccountPage.createAnAccount();
//        Thread.sleep(3000);

    }
}
