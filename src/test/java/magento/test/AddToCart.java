package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.magento.HomePage;
import pages.magento.PurchasePage;
import pages.magento.SearchPage;

public class AddToCart extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSearch.class.getName());
//    @Test
//    public void addToCart() throws InterruptedException {
//HomePage homePage = new HomePage(getDriver());
//            homePage.hoverOverFloatingMenu(driver);
//            Thread.sleep(5000);
//            homePage.clickOnWatches();
//            Thread.sleep(5000);
//    }
        @Test
        public void addToCart1() throws InterruptedException {
            HomePage homePage = new HomePage(getDriver());
            homePage.hoverOverFloatingMenu(driver);
            homePage.clickOnWatches();
            String title=getCurrentTitle();
            Assert.assertEquals(title,"Watches - Gear Magento Commerce - website to practice selenium" +
                    " | demo website for automation testing | selenium practice sites");
            LOG.info("land to watches page");
//            Thread.sleep(3000);

            SearchPage searchPage = new SearchPage(getDriver());
            searchPage.selectedWatch();
//            Thread.sleep(3000);
            searchPage.addPinkWatch();
//            Thread.sleep(3000);

        }
        @Test public void addToCart2() throws InterruptedException {
            HomePage homePage = new HomePage(getDriver());
            homePage.hoverOverFloatingMenu(driver);
            homePage.clickOnWatches();
        PurchasePage purchasePage=new PurchasePage(getDriver());
        purchasePage.hoverOverItem(driver);
        Thread.sleep(3000);
        purchasePage.addItemToCart();
//        Thread.sleep(3000);


    }
}
