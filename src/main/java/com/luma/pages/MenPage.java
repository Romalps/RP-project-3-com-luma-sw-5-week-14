package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement cronusYogaPantSize32;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement cronusYogaPantColourBlack;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCartLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;


    // Mouse Hover on product name Cronus Yoga Pant
    public void mouseHoverOnProductNameCronusYogaPant() {
        Reporter.log("Mouse Hover On product name Cronus Yoga Pant" + cronusYogaPant.toString());
        mouseHoverToElement(cronusYogaPant);
        CustomListeners.test.log(Status.PASS, "Mouse Hover On product name Cronus Yoga Pant" + cronusYogaPant);
    }

    //click on size 32.
    public void clickOnCronusYogaPantSize32() {
        Reporter.log("Click on Cronus Yoga Pant size 32" + cronusYogaPantSize32.toString());
        clickOnElement(cronusYogaPantSize32);
        CustomListeners.test.log(Status.PASS, "Click on Cronus Yoga Pant size 32" + cronusYogaPantSize32);
    }

    //click on colour Black.
    public void clickOnCronusYogaPantColourBlack() {
        Reporter.log("Click on Cronus Yoga Pant colour Black" + cronusYogaPantColourBlack.toString());
        clickOnElement(cronusYogaPantColourBlack);
        CustomListeners.test.log(Status.PASS, "Click on Cronus Yoga Pant colour Black" + cronusYogaPantColourBlack);
    }


    // click on ‘Add To Cart’ Button.
    public void addCronusYogaPantToCart() {
        Reporter.log("Click on Add to Cart Link" + addToCartLink.toString());
        clickOnElement(addToCartLink);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart Link" + addToCartLink);

    }

    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCartLinkIntoMessage() {
        Reporter.log("Click on Shopping Cart Link" + shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Click on Shopping Cart Link" + shoppingCartLink);

    }


}
