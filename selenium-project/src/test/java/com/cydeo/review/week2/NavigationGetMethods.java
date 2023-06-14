package com.cydeo.review.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigationGetMethods {
    public static void main(String[] args) {
// // TC#1: Navigations and Get methods Practice
//
//      // 1. Open a chrome browser

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//      // 2. Go to: https://www.etsy.com
        driver.get("https://www.etsy.com");
//      // 3. Navigate to https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//      // 4. Navigate back, forward and refresh
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
//      // 5. Write “selenium” in search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("selenium");
//      // 6. Press search button to search
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();
//      // 7. Verify title is "Amazon.com : selenium"
        System.out.println("//      // 7. Verify title is \"Amazon.com : selenium\"\n");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com : selenium";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
//      // 8. Verify url contains "selenium"
        System.out.println("//      // 8. Verify url contains \"selenium\"\n");
        String actualURL = driver.getTitle();
        String expectedInURL = "selenium";
        if(actualURL.contains(expectedInURL)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}
