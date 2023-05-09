package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qtyTo5;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateCartButton;

    // Change Qty to ‘5’
    public void changeOvernightDuffleQtyTo5() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Change Overnight Duffle Bag quantity 1 to 5" + qtyTo5.toString());
        qtyTo5.clear();
        sendTextToElement(qtyTo5, "5");
        CustomListeners.test.log(Status.PASS, "Change Overnight Duffle Bag quantity 1 to 5" + qtyTo5);
    }

    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateShoppingCartButton() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click on Update shopping Button" + updateCartButton.toString());
        clickOnElement(updateCartButton);
        CustomListeners.test.log(Status.PASS, "Click on Update shopping Button" + updateCartButton);
    }


}
