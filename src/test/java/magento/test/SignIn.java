package magento.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.magento.HomePage;
import pages.magento.SignInPage;

public class SignIn extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestSearch.class.getName());
    Faker fakeData = new Faker();
    String emailAddress = fakeData.internet().emailAddress();
    String password = fakeData.internet().password();
//    String fullName = fakeData.name().fullName();
//    String email = fakeData.internet().emailAddress();
    @Test
    public void signIn() throws InterruptedException {
        HomePage homePage= new HomePage(getDriver());
        SignInPage signInPage = new SignInPage(getDriver());


        String title = getCurrentTitle();
        Assert.assertEquals(title,"Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing" +
                " | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites " +
                "Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
            LOG.info("land to home page success");

            homePage.clickOnSignInButton();
//            Thread.sleep(3000);

//            signInPage.typeEmailAddress();
        signInPage.typeEmailAddress(emailAddress);
//            Thread.sleep(3000);

//            signInPage.password();
        signInPage.password(password);
            Thread.sleep(3000);

            signInPage.SignInButton2();
            Thread.sleep(6000);


        }
        @Test
    public void failedSignIn () throws InterruptedException {
            HomePage homePage= new HomePage(getDriver());
            SignInPage signInPage = new SignInPage(getDriver());
            String title = getCurrentTitle();
            Assert.assertEquals(title,"Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing" +
                    " | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites " +
                    "Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
            LOG.info("land to home page2 success");
            homePage.clickOnSignInButton();
            signInPage.typeEmailAddress(emailAddress);
            signInPage.password(password);
            Thread.sleep(3000);

            signInPage.SignInButton2();
            Thread.sleep(6000);
            String errorMessage = signInPage.incorrectCred();
            Assert.assertEquals(errorMessage,"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
            LOG.info("error message shows up");
            Thread.sleep(4000);

        }
}