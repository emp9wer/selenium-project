package com.cydeo.tests.day02_locators_getText_getAttribute.extraPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3 {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.className("gb_v"));
        gmail.click();
        //4- Verify title contains:
        //Expected: Gmail
        System.out.println("//4- Verify title contains:" +
                " //Expected: Gmail");
        String gmailTitleExpected = "Gmail";
        String gmailTitleActual = driver.getTitle();
        System.out.println("gmailTitleExpected = " + gmailTitleExpected);
        System.out.println("gmailTitleActual = " + gmailTitleActual);
        if (gmailTitleActual.contains(gmailTitleExpected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Google
        System.out.println("//6- Verify title equals:" +
                " //Expected: Google");
        String googleTitleExpected = "Google";
        String googleTitleActual = driver.getTitle();
        System.out.println("googleTitleExpected = " + googleTitleExpected);
        System.out.println("googleTitleActual = " + googleTitleActual);
        if (googleTitleExpected.equals(googleTitleActual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.close();
    }
}
