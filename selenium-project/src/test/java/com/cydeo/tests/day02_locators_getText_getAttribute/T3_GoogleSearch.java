package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        //TC#3: Google search
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Write “apple” in search box
        //3-1 locate search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        //3-2 enter "apple" key  + 4- Press ENTER to search
       // googleSearchBox.sendKeys("apple");
        googleSearchBox.sendKeys("apple"+ Keys.ENTER); // to remove step 4

        //4- Press ENTER to search
       // Thread.sleep(2000); // advantage of splitting
       // googleSearchBox.sendKeys(Keys.ENTER);


        //5- Verify title:
        //Expected: Title should start with “apple” word

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle.startsWith(expectedTitle) ?");
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        Thread.sleep(2000);

        driver.close();
    }
}
