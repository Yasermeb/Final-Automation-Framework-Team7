package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(SearchPage.class.getName());
    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[8]/div/a/span/span/img")
    WebElement HoodiePicture;
//    @FindBy(xpath = "")
//    WebElement x;
//
//    @FindBy(xpath = "")
//    WebElement y;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img")
    WebElement selectedWatch;

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    WebElement addPinkWatch;
//HOVER OVER
    @FindBy(xpath = "/html/body")
    WebElement hoverOverWatch;



    //REUSABLE STEPS
    public void clickOnHoodiePicture() throws InterruptedException {
        clickOn(HoodiePicture);
        LOG.info("click on hoodie picture success");
    }

    public void hoverOverGear(WebDriver driver) throws InterruptedException {
        hoverOverGear(driver);
//        hoverOver(driver,hoverOverWatch);
    }

    public void selectedWatch(){
        clickOn(selectedWatch);
        LOG.info("click on selected watch  success");
    }

    public void addPinkWatch(){
        clickOn(addPinkWatch);
        LOG.info("click on selected watch  success");
    }








}