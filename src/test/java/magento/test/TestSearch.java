package magento.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.magento.HomePage;
import pages.magento.SearchPage;

public class TestSearch extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSearch.class.getName());
    @Test
    public void testSearchHoodie() throws InterruptedException {

        String actualHomePageTitle = getCurrentTitle();
        String expectedHomePageTitle = actualHomePageTitle;
        LOG.info("actual home page title" + actualHomePageTitle);
        Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
        LOG.info("land to luma home page success");

        String item = "hoodie";
        HomePage homePage = new HomePage(getDriver());
        homePage.typeItemToSearch(item);
//        Thread.sleep(3000);

        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.clickOnHoodiePicture();
//        Thread.sleep(3000);










    }
}
