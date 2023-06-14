package com.cydeo.tests.day02_locators_getText_getAttribute.extraPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4 {
    public static void main(String[] args) {
        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        //3- Click to “Home” link
        //PS: Locate “Home” link using “className” locator
        driver.findElement(By.className("nav-link")).click();
        //4- Verify title is as expected:
        //Expected: Practice
        String titleExpected = "Practice";
        String titleActual = driver.getTitle();
        System.out.println("titleExpected = " + titleExpected);
        System.out.println("titleActual = " + titleActual);
        if (titleActual.equals(titleExpected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();
    }
}
