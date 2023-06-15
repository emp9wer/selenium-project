package com.cydeo.tests.week_01;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC001_TC002_TC003_TC004_TC005 {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void t1(){
        //**  TC001 As a user I should be able to see Login label is displayed
        //
        //  1-open a chrome browser
        //  2-goto https://vytrack.com/
        //  3-verify Login is displayed
        driver.get("https://vytrack.com/");
        Assert.assertTrue(driver.findElement(By.xpath("//a[.='LOGIN']")).isDisplayed());
    }

    @Test
    public void t2(){
        // ** TC002 As a user I should be able to see the login page
        //
        // 1- Setup the "browser driver"
        // 2- Go to "https://vytrack.com"
        // 3- Click Login label
        // 3- Verify the title contains "Login"
        driver.get("https://vytrack.com/");
        driver.findElement(By.xpath("//a[.='LOGIN']")).click();
        Assert.assertTrue(driver.getTitle().contains("Login"));
    }

    @Test
    public void t3() {

            // ** TC003 As a user I should be able to login with valid credentials
            //
            // 1- Setup the "browser driver"
            // 2- Go to "https://vytrack.com"
            driver.get("https://vytrack.com/");
            // 3- Click Login label
            driver.findElement(By.xpath("//a[.='LOGIN']")).click();
            // 4- Login to application with username as "User1" and password as "UserUser123"
            WebElement logInField = driver.findElement(By.xpath("//input[@name='_username']"));
            logInField.sendKeys("User1");

            WebElement passwordField = driver.findElement(By.xpath("//input[@name='_password']"));
            passwordField.sendKeys("UserUser123");

            WebElement loginButton = driver.findElement(By.xpath("//button[.='Log in']"));
            loginButton.click();


            //5 Verify the title contains "Dashboard"
            BrowserUtils.sleep(2);
            Assert.assertTrue(driver.getTitle().contains("Dashboard"));
        }

    @Test
    public void t4(){
        // ** TC004 As a user I should be able to login with valid credentials
        //
        // 1- Setup the "browser driver"
        // 2- Go to "https://vytrack.com"
        driver.get("https://vytrack.com/");
        // 3- Click Login label
        driver.findElement(By.xpath("//a[.='LOGIN']")).click();
        // 4- Login to application with username as "User1" and password as "UserUser123"
        WebElement logInField = driver.findElement(By.xpath("//input[@name='_username']"));
        logInField.sendKeys("User1");

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='_password']"));
        passwordField.sendKeys("UserUser123");

        // 4- Login to application with username as "User1" and password as "UserUser123"
        // 5- Verify the password is hidden
        BrowserUtils.sleep(2);
        Assert.assertTrue(passwordField.isDisplayed());
    }







}
