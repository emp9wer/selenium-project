package com.cydeo.review.week2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Navigation_Getmethods {

        WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test1(){
        // // TC#1: Navigations and Get methods Practice
        //
        //      // 1. Open a chrome browser
        //      // 2. Go to: https://www.etsy.com
        driver.get("https://www.etsy.com");
        //      // 3. Navigate to https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //      // 4. Navigate back, forward and refresh
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //      // 5. Write “selenium” in search box
        WebElement amazonSearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        amazonSearchBox.sendKeys("selenium");
        //      // 6. Press search button to search
        WebElement amazonSearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        amazonSearchButton.click();
        //      // 7. Verify title is "Amazon.com : selenium"
        String expectedTitle = "Amazon.com : selenium";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @Test
    public void test2(){
        //      // 8. Verify url contains "selenium"
        driver.get("https://www.amazon.com/");
        WebElement amazonSearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        amazonSearchBox.sendKeys("selenium");
        WebElement amazonSearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

        amazonSearchButton.click();
        String actualUrl = driver.getCurrentUrl();
        String expectedInUrl = "selenium";
        Assert.assertTrue(actualUrl.contains(expectedInUrl));
    }

}
