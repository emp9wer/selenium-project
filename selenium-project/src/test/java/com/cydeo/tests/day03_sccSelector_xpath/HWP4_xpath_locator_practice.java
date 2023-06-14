package com.cydeo.tests.day03_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP4_xpath_locator_practice {
    public static void main(String[] args) {
        //HWP #4: Practice Cydeo – xpath locator practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        //3- Click to “Home” link
        //PS: Locate “Home” link using “xpath” locator
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        homeLink.click();
        //4- Verify title is as expected:
        //Expected: Practice
        System.out.println("Verify title is as expected: Expected: Practice");
        String titleExpected = "Practice";
        String titleActual = driver.getTitle();
        System.out.println("titleExpected = " + titleExpected);
        System.out.println("titleActual = " + titleActual);
        if(titleActual.equals(titleExpected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();

    }
}
