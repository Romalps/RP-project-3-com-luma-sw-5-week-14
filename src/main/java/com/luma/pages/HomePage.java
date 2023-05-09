package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement tops;


    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacketsLink;

    // Mouse Hover on Women Menu
    public void mouseHoverOnWomenMenu() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(womenMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Women Menu tab"+ womenMenu);
    }

    // Mouse Hover on Tops
    public void mouseHoverOnTops() throws InterruptedException {
    Thread.sleep(2000);
        mouseHoverToElement(tops);
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Tops"+ tops);
    }

    // Click on Jackets
    public void clickOnJacketsLink() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(jacketsLink);
        CustomListeners.test.log(Status.PASS,"click on Jacket Link"+ jacketsLink);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsLink;

    // Mouse Hover on Men Menu
    public void mouseHoverMenMenu() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(menMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover On men Menu tab"+ menMenu);
    }

    // Mouse Hover on Bottoms
    public void mouseHoverOnBottoms() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(bottoms);
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Bottoms"+ bottoms);
    }

    // Click on Pants
    public void clickOnPantsLink() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(pantsLink);
        CustomListeners.test.log(Status.PASS,"Click on Pants Link"+ pantsLink);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bagLink;

    // Mouse Hover on Gear Menu
    public void mouseHoverOnGearMenu() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Mouse Hover On Gear Menu tab"+gearMenu.toString());
        mouseHoverToElement(gearMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Gear Menu tab"+ gearMenu);
    }

    // Click on Bags
    public void clickOnBagsLink() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click on Bag link"+ bagLink.toString());
        mouseHoverToElementAndClick(bagLink);
        CustomListeners.test.log(Status.PASS,"Click on Bag link"+ bagLink);
    }

}
