package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library {
    public static void main(String[] args) {



        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        //PS: Locate username input box using “className” locator
        WebElement emailAddress = driver.findElement(By.className("form-control"));
        emailAddress.sendKeys("incorrect@email.com");


        //4. Enter password: “incorrect password”
        //Locate password input box using “id” locator
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        //5 locate and click "Sign in" button
        //Locate Sign in button using “tagName” locator
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        //6. Verify: visually “Sorry, Wrong Email or Password”
        WebElement message1 = driver.findElement(By.className("alert-danger"));
        String expectedMessage = "Sorry, Wrong Email or Password";
        String actualMessage = message1.getText();

        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);
        if(actualMessage.equals(expectedMessage)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();




    }
}
