package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {
        /*
        TC #1: Cydeo practice tool verifications
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com
    3. Verify URL contains
        Expected: cydeo
    4. Verify title:
        Expected: Practice
         */


        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
        //driver.navigate().to("https://practice.cydeo.com"); - possible!

        //3. Verify URL contains
        //        Expected: cydeo
        String expectedInUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains(expectedInUrl)){
            System.out.println("Url verification passed: "+actualUrl+" contains "+expectedInUrl);
        }else{
            System.out.println("Url verification failed");
        }



        //  4. Verify title:
        //        Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Ttile verification is passed: "+ actualTitle+" matching "+ expectedTitle);
        }else {
            System.out.println("Ttile verification is NOT passed: " + actualTitle + " is not matching " + expectedTitle);
        }
        //close browser
        driver.close();



    }

}
