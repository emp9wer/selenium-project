package com.cydeo.tests.day03_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP1_etsy_title_verification {
    public static void main(String[] args) {
        //HWP #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.xpath("//input[@data-id='search-query']"));
        searchBox.sendKeys("wooden spoon");
        searchBox.sendKeys(Keys.ENTER);
        //4. Verify title:
        //Expected: “Wooden spoon - Etsy”
        String titleExpected = "Wooden spoon - Etsy";
        String titleActual = driver.getTitle();
        System.out.println("titleExpected = " + titleExpected);
        System.out.println("titleActual = " + titleActual);
        if(titleExpected.equals(titleActual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();

    }
}
