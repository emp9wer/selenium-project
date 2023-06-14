package com.cydeo.tests.day04_findElement_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practices {

    public static void main(String[] args) {

        //XPATH and CSS Selector PRACTICES
        //
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS

        //locator only (total of 6)
        //a. “Home” link
        //by css selector
        // syntax#1 class attribute value
        //WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        // syntax#2 class attribute value (tagName.classValue)
        //WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        // syntax#3 class attribute value
        WebElement homeLink = driver.findElement(By.cssSelector("a[href='/']"));
        //by xpath
        // WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
       // homeLink.click();


        //b. “Forgot password” header
        //locate header, using xpath using text of h2
        WebElement header_ex1 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        //locate header, using cssSelector  locate parent element and move down to h2
        WebElement header_ex2 = driver.findElement(By.cssSelector("div[class='example']>h2"));
        //locate header, using cssSelector  locate parent element and move down to h2
        WebElement header_ex3 = driver.findElement(By.cssSelector("div.example>h2"));
        //using xpath
        WebElement header_ex4 = driver.findElement(By.xpath("//h2"));


        //c. “E-mail” text
        //locate email element label using xpath

        WebElement emailLabel1 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLabel2 = driver.findElement(By.xpath("//label[.='E-mail']"));


        //d. E-mail input box
        //using xpath
        WebElement emailInput1 = driver.findElement(By.xpath("//input[@name='email']"));
        //using xpath contains method
        //tagName[contains(@attribute, value)]
        WebElement emailInput2 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));

        //e. “Retrieve password” button
        //locate using xpath
        WebElement retrievePasswordButton1 = driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement retrievePasswordButton2 = driver.findElement(By.xpath("//button[@type='submit']"));


        //f. “Powered by Cydeo text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel1.isDisplayed() = " + emailLabel1.isDisplayed());
        System.out.println("retrievePasswordButton1.isDisplayed() = " + retrievePasswordButton1.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());


        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible

        driver.close();













    }

}
