package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(SearchPage.class.getName());

    public CreateAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath ="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span" )
    WebElement clickOnCreateAnAccount;


    @FindBy(xpath = "//*[@id=\"firstname\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"is_subscribed\"]")
    WebElement signUpForNewsLetter;

    @FindBy(xpath = "//*[@id=\"email_address\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"password-confirmation\"]")
    WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button/span")
    WebElement createAnAccount;

//REUSABLE STEPS
public void clickOnCreateAnAccount(){
    clickOn(clickOnCreateAnAccount);
    LOG.info("click on create an account success");
}

    public void typeFirstName(String name){
        type(firstName,name);
        LOG.info("first name typed successfully");
    }

    public void typeLastName(String lastNam){
        type(lastName,lastNam);
        LOG.info("last name typed successfully");
    }

    public void signUpForNewsLetter(){
        clickOn(signUpForNewsLetter);
        LOG.info("sign up for news letter successfully");
    }

    public void email(){
        type(email,"roni_cost@example.com");
        LOG.info("writing email success");
    }


    public void typePassword(String passWord){
        type(password,passWord);
        LOG.info("password typed successfully");
    }

    public void confirmPassword(String confirmPassword){
        type(password,confirmPassword);
        LOG.info("password confirmation typed successfully");
    }
    public void createAnAccount(){
        clickOn(createAnAccount);
        LOG.info("click on create an account successfully");
    }

}
