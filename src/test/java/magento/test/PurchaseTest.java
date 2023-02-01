package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.magento.HomePage;
import pages.magento.PurchasePage;
import pages.magento.SearchPage;

public class PurchaseTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(PurchaseTest.class.getName());

  @Test
    public void purchaseHoodie() throws InterruptedException {
    String item="hoodie";
    HomePage homePage=new HomePage(getDriver());
    SearchPage searchPage=new SearchPage(getDriver());
    homePage.typeItemToSearch(item);

    String title= getCurrentTitle();
    Assert.assertEquals(title,"Search results for: 'hoodie' Magento Commerce - website to practice selenium |" +
            " demo website for automation testing | selenium practice sites");
    LOG.info("land to search hoodie page");

    searchPage.clickOnHoodiePicture();
//    Thread.sleep(3000);
    String hoodieTitle= getCurrentTitle();
    Assert.assertEquals(hoodieTitle,"Bruno Compete Hoodie Magento Commerce - website to practice selenium | " +
            "demo website for automation testing | selenium practice sites");

    PurchasePage purchasePage = new PurchasePage(getDriver());
    purchasePage.clickOnSize();
//    Thread.sleep(3000);

    purchasePage.ChooseColor();
//    Thread.sleep(3000);
    purchasePage.typeOnQuantity();
    Thread.sleep(3000);

    purchasePage.addItemToCart2();
    Thread.sleep(3000);
    homePage.clickOnCartLink();
    Thread.sleep(3000);
    purchasePage.ViewAndEditCart();
//    String editCartTitle=getCurrentTitle();
//    Assert.assertEquals(editCartTitle,"String cartTitle=getCurrentTitle();\n" +
//            "    Assert.assertEquals(cartTitle,\"\");");
//    LOG.info("land to edit cart page");


    }
}
