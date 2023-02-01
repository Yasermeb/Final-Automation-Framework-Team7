package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public MyAccount(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")
    WebElement myOrders;

    @FindBy(css = "div[class='panel header'] button[type='button']")
    WebElement arrow;


    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")
    WebElement myAccount;


//REUSABLE STEPS
    public void orders(){
        clickOn(myOrders);
        LOG.info("click on my orders success");
    }
    public void arrow(){
        clickOn(arrow);
        LOG.info("click on arrow success");
    }

    public void ClickOnMyAccount(){
        clickOn(myAccount);
        LOG.info("click on my account success");
    }
}
