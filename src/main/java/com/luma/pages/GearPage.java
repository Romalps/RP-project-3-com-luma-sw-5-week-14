package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffleBag;


    public void clickOnProductNameOvernightDuffle() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on ProductName Overnight Duffle" + overnightDuffleBag.toString());
        clickOnElement(overnightDuffleBag);
        CustomListeners.test.log(Status.PASS," Click on Overnight Duffle Bag"+ overnightDuffleBag);

    }


}
