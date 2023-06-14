package com.cydeo.review.week2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticePageLogin {

    //// TC#2: Practice page Login test
    //
    //    // 1. Open Chrome browser
    //    // 2. Go to https://practice.cydeo.com/login
    //    // 3. Enter username: "tomsmith"
    //    // 4. Enter password: "SuperSecretPassword"
    //    // 5. Click to Login button
    //    // 6. Verify text displayed on page
    //    //    Expected: "You logged into a secure area!
    @Test
   public void test1(){
        // TC#2: Practice page Login test


        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");


        // 3. Enter username: "tomsmith"
      //WebElement username1 = driver.findElement(By.cssSelector("input[name='username']"));
        WebElement username2 = driver.findElement(By.xpath("//input[@name='username']"));
        username2.sendKeys("tomsmith");


        // 4. Enter password: "SuperSecretPassword"
        WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));

        password1.sendKeys("SuperSecretPassword");


        // 5. Click to Login button
        WebElement loginButton1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        WebElement loginButton2 = driver.findElement(By.xpath("//button[.='Login']"));
        loginButton2.click();


        // 6. Verify text displayed on page
        //    Expected: "You logged into a secure area!"

        WebElement resultText1 = driver.findElement(By.cssSelector(".flash.success"));
        WebElement resultText2 = driver.findElement(By.xpath("//div[normalize-space(text())='You logged into a secure area!']"));

        System.out.println(resultText1.getText());

        String actualText = resultText1.getText();
        String expectedText = "You logged into a secure area!";



    }

}
