package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        //Expected: Registration form
        WebElement pageHeader =  driver.findElement(By.tagName("h2"));
        String pageHeaderExpected = "Registration form";
        String pageHeaderActual = pageHeader.getText();

        System.out.println("pageHeaderExpected = " + pageHeaderExpected);
        System.out.println("pageHeaderActual = " + pageHeaderActual);
        if(pageHeaderExpected.equals(pageHeaderActual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //4- Locate “First name” input box
        WebElement firstNameBox =  driver.findElement(By.className("form-control"));

        //5- Verify placeholder attribute’s value is as expected:
        //Expected: first name
        String firstNameBoxPlaceholderExpected = "first name";
        String firstNameBoxPlaceholderActual = firstNameBox.getAttribute("placeholder");

        System.out.println("firstNameBoxPlaceholderExpected = " + firstNameBoxPlaceholderExpected);
        System.out.println("firstNameBoxPlaceholderActual = " + firstNameBoxPlaceholderActual);

        if(firstNameBoxPlaceholderActual.equals(firstNameBoxPlaceholderExpected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();

    }
}
