package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        // maximizes the browser
        driver.manage().window().maximize();

        // full screen
        //  driver.manage().window().fullscreen(); -- not for windows! buggy

        //go to tesla.com
        driver.get("https://www.tesla.com");

        // use .getCurrentUrl method to print current URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //get title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //user navigate back() to go back
        driver.navigate().back();

        //Stop execution for 3 seconds
        Thread.sleep(1000);

        //user navigate().forward() to go forward
        driver.navigate().forward();

        //Stop execution for 3 seconds
        Thread.sleep(1000);

        //user refreshes the page using navigate().refresh();
        driver.navigate().refresh();

        //Stop execution for 3 seconds
        Thread.sleep(1000);

        //navigate to google.com using navigate().to() method
        driver.navigate().to("https://www.google.com");

        // use .getCurrentUrl method to print current URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //get title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //closes  only focused browser window/tab
        driver.close();

        //closing all open browsers , closes session //(session id)
        //driver.quit();






    }


}
