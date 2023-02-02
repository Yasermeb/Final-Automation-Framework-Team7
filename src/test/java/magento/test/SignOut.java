package magento.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.magento.HomePage;
import pages.magento.MyAccount;
import pages.magento.SignInPage;
import pages.magento.SignOutPage;

public class SignOut extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSearch.class.getName());
    Faker fakeData = new Faker();
    String emailAddress = fakeData.internet().emailAddress();
    String password = fakeData.internet().password();
    @Test
    public void signOut() throws InterruptedException {
        HomePage homePage=new HomePage(getDriver());
        homePage.clickOnSignInButton();
        SignInPage signInPage=new SignInPage(getDriver());
        signInPage.typeEmailAddress(emailAddress);
        signInPage.password(password);
        signInPage.SignInButton2();

        MyAccount myAccount=new MyAccount(getDriver());
        myAccount.arrow();

        SignOutPage signOutPage=new SignOutPage(getDriver());
        signOutPage.signOut();

    }

    }
