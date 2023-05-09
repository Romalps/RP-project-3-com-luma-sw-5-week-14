package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.JacketPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {

    HomePage homePage;

    JacketPage jacketPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        jacketPage = new JacketPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.clickOnJacketsLink();
        jacketPage.selectSortByFilterProductName();
        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketPage.jacketNameListAfter, jacketPage.jacketsNameListBefore);
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        homePage.mouseHoverOnWomenMenu();// Mouse Hover on Women Menu
        homePage.mouseHoverOnTops();// Mouse Hover on Tops
        homePage.clickOnJacketsLink();//Click on Jackets
        jacketPage.selectSortByFilterPrice();

        // Verify the products price display in Low to High
        Assert.assertEquals(jacketPage.jacketPriceListAfter, jacketPage.jacketPriceListBefore);
    }


}
