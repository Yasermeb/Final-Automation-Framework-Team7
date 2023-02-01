package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //object
    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement searchField;

//    @FindBy(xpath = "//*[@id=\"search_mini_form\"]/div[2]/button")
//    WebElement searchButton;
//
    @FindBy(xpath = "//*[@id=\"ui-id-6\"]/span[2]")
    WebElement floatingMenu;

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"ui-id-27\"]/span")
    WebElement clickOnWatches;

//    @FindBy(css = "")
//    WebElement menuDropdown;
//
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
    WebElement cartLink;

    //reusable steps
    public void typeItemToSearch(String item){
        typeAndEnter(searchField, item);
        LOG.info("item name type success");
    }
//    public void clickOnSearchButton(){
//        clickOn(searchButton);
//        LOG.info("click search success");
//    }
//    public void searchItem(String item){
//        typeAndEnter(searchField, item);
//        LOG.info("item name type and enter success");
//    }
//    public void selectOptionFromMenuDropdown(String option){
//        selectOptionFromDropdown(menuDropdown, option);
//        LOG.info(option+" option selected from the dropdown");
//    }
    public void hoverOverFloatingMenu(WebDriver driver){
        hoverOver(driver, floatingMenu);
        LOG.info("hover over menu success");
    }
    public void clickOnSignInButton(){
        clickOn(signInButton);
        LOG.info("click on login button success");
    }

    public void clickOnWatches(){
        clickOn(clickOnWatches);
        LOG.info("click on watches success");
    }
    public void clickOnCartLink(){
        clickOn(cartLink);
        LOG.info("click on cart link success");
    }
}
