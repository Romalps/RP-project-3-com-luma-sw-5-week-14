package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.*;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.jcp.xml.dsig.internal.dom.DOMUtils.getAttributeValue;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {

    HomePage homePage ;
    GearPage gearPage ;
    OvernightDuffleBagPage overnightDuffleBagPage;
    ShoppingPage shoppingPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage= new HomePage();
        gearPage= new GearPage();
        overnightDuffleBagPage = new OvernightDuffleBagPage();
        shoppingPage = new ShoppingPage();
    }

    @Test(groups = {"smoke"})
    public void verifyUserShouldAddProductSuccessfullyToShoppingCart() throws InterruptedException {

        homePage.mouseHoverOnGearMenu();//Mouse Hover on Gear Menu
        homePage.clickOnBagsLink();//Click on Bags
        gearPage.clickOnProductNameOvernightDuffle(); // Click on Product Name ‘Overnight Duffle’
        // Verify the text ‘Overnight Duffle’
        Assert.assertEquals( getTextFromElement(By.xpath("//span[@class='base']")),"Overnight Duffle");

        overnightDuffleBagPage.changeQty1To3(); // Change Qty 3
        overnightDuffleBagPage.clickOnAddToCartButtonInOvernightDuffleBag();// Click on ‘Add to Cart’ Button.
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals( getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")),"You added Overnight Duffle to your shopping cart.");
        // Click on ‘shopping cart’ Link into message
        overnightDuffleBagPage.clickOnShoppingCartLinkIntoMessage();
        // Verify the product name ‘Overnight Duffle’
        Assert.assertEquals( getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']")),"Overnight Duffle");

        //Verify the Qty is ‘3’

        Assert.assertEquals(getAttributeValue(By.xpath("//input[@title='Qty']"), "value"), "3");
        //waitUntilVisibilityOfElementLocated(By.xpath("(//span[@class='cart-price']//span)[2]"), 10);
        // Verify the product price ‘$135.00’
        Assert.assertEquals( getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]")),"$135.00");

        shoppingPage.changeOvernightDuffleQtyTo5();// Change Qty to ‘5’
        shoppingPage.clickOnUpdateShoppingCartButton();// Click on ‘Update Shopping Cart’ button
       // waitUntilVisibilityOfElementLocated(By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']"), 20);
        // Verify the product price ‘$225.00’
        Assert.assertEquals( getTextFromElement(By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")),"$225.00");


    }


}
