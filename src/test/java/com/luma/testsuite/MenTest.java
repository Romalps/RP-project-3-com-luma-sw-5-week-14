package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {

    HomePage homePage ;
    MenPage menPage ;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage= new HomePage();
        menPage = new MenPage();
    }


    @Test(groups = {"sanity"})
    public void VerifyUserShouldAddProductSuccessfullyToShoppingCart() throws InterruptedException {


        homePage.mouseHoverMenMenu();
        homePage.mouseHoverOnBottoms();
        homePage.clickOnPantsLink();
        menPage.mouseHoverOnProductNameCronusYogaPant();
        menPage.clickOnCronusYogaPantSize32();
        menPage.clickOnCronusYogaPantColourBlack();
        menPage.addCronusYogaPantToCart();

        // Verify the text You added Cronus Yoga Pant to your shopping cart.
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")), "You added Cronus Yoga Pant to your shopping cart.");

        menPage.clickOnShoppingCartLinkIntoMessage();
        // Verify the text ‘Shopping Cart.'
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='base']")), "Shopping Cart");

        // Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")), "Cronus Yoga Pant");

        // Verify the product size ‘32’
        Assert.assertEquals(getTextFromElement(By.xpath("//dd[contains(text(),'32')]")), "32");
        // Verify the product colour ‘Black’
        Assert.assertEquals(getTextFromElement(By.xpath("//dd[contains(text(),'Black')]")), "Black");

    }
}
