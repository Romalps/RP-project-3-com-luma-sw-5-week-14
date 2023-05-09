package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OvernightDuffleBagPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeQty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;

    // Change Qty 3
    public void changeQty1To3() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Change Quantity 1 to 3" + changeQty.toString());
        changeQty.clear();
        sendTextToElement(changeQty, "3");
        CustomListeners.test.log(Status.PASS, "Change Quantity 1 to 3" + changeQty);

    }

    // Click on ‘Add to Cart’ Button.
    public void clickOnAddToCartButtonInOvernightDuffleBag() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click on Add to Cart Button" + addToCartButton.toString());
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart Button" + addToCartButton);
    }

    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCartLinkIntoMessage() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click On Shopping Cart Link" + shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Click On Shopping Cart Link" + shoppingCartLink);
    }

}
