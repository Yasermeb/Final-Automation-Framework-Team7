package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public ForgotPasswordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"email_address\"]")
    WebElement emailField;


    public void emailForRestoringPass() {
        type(emailField,"roni_cost@example.com");
        LOG.info("email typed successfully");


    }
}

