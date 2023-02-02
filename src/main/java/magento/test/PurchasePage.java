package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends CommonAPI {
    Logger LOG = LogManager.getLogger(SearchPage.class.getName());

    public PurchasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"option-label-size-143-item-168\"]")
    WebElement size;

    @FindBy(xpath = "//*[@id=\"option-label-color-93-item-53\"]")
    WebElement color;

    @FindBy(xpath = "//*[@id=\"qty\"]")
    WebElement quantity;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/div/div[3]/div/div[1]/form/button")
    WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    WebElement addToCart2;

    @FindBy(xpath = "//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")
    WebElement viewAndEditCart;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/a/span/span/img")
    WebElement hoverOverItem;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/div/div[3]/div/div[1]/form/button/span")
    WebElement clickOnAddToCart;






//REUSABLE STEPS
    public void clickOnSize() throws InterruptedException {
        clickOn(size);
        LOG.info("click on S size  success");
    }

    public void ChooseColor() throws InterruptedException {
        clickOn(color);
        LOG.info("choosing color  success");

    }
//    public void quantity(){
//        PageFactory.initElements(driver,this);
//    }

//    String typeOnQuantity;
    public void typeOnQuantity(){
        quantity.clear();
        quantity.sendKeys("2");
        LOG.info("choosing quantity  success");
    }

//    public void addToCart(){
//        PageFactory.initElements(driver,this);
//    }
    public void addItemToCart(){
        addToCart.click();
        LOG.info("adding to cart  success");
    }

    public void addItemToCart2(){
        addToCart2.click();
        LOG.info("adding to cart  success");
    }

    public void ViewAndEditCart(){
        viewAndEditCart.click();
        LOG.info("click on view and edit  success");
    }

    public void hoverOverItem(WebDriver driver1){
        hoverOver(driver1,hoverOverItem);
        clickOn(clickOnAddToCart);

        LOG.info("click on view and edit  success");
    }


}
