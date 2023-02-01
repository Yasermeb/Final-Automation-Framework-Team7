package magento.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.magento.HomePage;
import pages.magento.MyAccount;
import pages.magento.SignInPage;

public class MyAccountTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSearch.class.getName());
    Faker fakeData = new Faker();
    String emailAddress = fakeData.internet().emailAddress();
    String password = fakeData.internet().password();
    @Test
    public void myAccount() throws InterruptedException {
        HomePage homePage =new HomePage(getDriver());
        homePage.clickOnSignInButton();

        SignInPage signInPage= new SignInPage(getDriver());
        signInPage.typeEmailAddress(emailAddress);
        signInPage.password(password);
        signInPage.SignInButton2();

//        CreateAccountPage createAccountPage=new CreateAccountPage(getDriver());
//        createAccountPage.clickOnCreateAnAccount();


        MyAccount myAccount=new MyAccount(getDriver());
        myAccount.arrow();
//        Thread.sleep(3000);
        myAccount.ClickOnMyAccount();
//        Thread.sleep(3000);


    }
}
