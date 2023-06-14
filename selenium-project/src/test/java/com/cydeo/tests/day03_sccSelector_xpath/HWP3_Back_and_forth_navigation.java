package com.cydeo.tests.day03_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP3_Back_and_forth_navigation {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Click to Gmail from top right.
        WebElement gmailLink = driver.findElement(By.xpath("//a[@class='gb_v']"));
        gmailLink.click();
        //4- Verify title contains:
        //Expected: Gmail
        System.out.println("Verify title contains: Expected: Gmail");
        String titleExpected = "Gmail";
        String titleActual = driver.getTitle();
        System.out.println("titleExpected = " + titleExpected);
        System.out.println("titleActual = " + titleActual);
        if(titleActual.contains(titleExpected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Google
        System.out.println("Verify title equals: Expected: Google");
         titleExpected = "Google";
         titleActual = driver.getTitle();
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
