package com.cydeo.tests.day02_locators_getText_getAttribute.extraPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2 {
    public static void main(String[] args) {
        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        String headerTextExpected = "Log in to ZeroBank";
        String headerTextActual = driver.findElement(By.className("page-header")).getText();
        System.out.println("headerTextExpected = " + headerTextExpected);
        System.out.println("headerTextActual = " + headerTextActual);
        if(headerTextActual.equals(headerTextExpected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}
