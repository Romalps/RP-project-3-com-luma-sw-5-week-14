package com.luma.pages;

import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JacketPage extends Utility {


    public ArrayList jacketsNameListBefore;
    public ArrayList jacketNameListAfter;
    public ArrayList jacketPriceListBefore;
    public ArrayList jacketPriceListAfter;


    public void selectSortByFilterProductName() {
        // Storing jackets names in list
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();

        for (WebElement value : jacketsElementsList) {

            jacketsNameListBefore.add(value.getText());
        }
        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Product Name");
        // After Sorting value
        jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketNameListAfter = new ArrayList<>();

        for (WebElement value : jacketsElementsList) {
            jacketNameListAfter.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
    }

    public void selectSortByFilterPrice() throws InterruptedException {
        Thread.sleep(2000);
        // Storing jackets price in list
        List<WebElement> jacketPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));

        }
       Thread.sleep(2000);
        // Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Price");
        // After Sorting Products by Price
        jacketPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketPriceListAfter = new ArrayList<>();

        for (WebElement value : jacketPriceElementList) {
            //Converting price in to Double and Removing $ from price

            jacketPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }

        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketPriceListBefore);
    }

}
