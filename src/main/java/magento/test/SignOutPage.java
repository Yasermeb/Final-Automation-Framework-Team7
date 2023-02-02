package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public SignOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //object
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
    WebElement signOut;





    //REUSABLE STEPS
    public void signOut(){
        clickOn(signOut);
    }

}
