package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_WindowsPractice {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to website: http://practice.cydeo.com/windows
        driver.get("http://practice.cydeo.com/windows");
    }

    @Test
    public void multipleWindowsTest(){
        //TC #5: Window Handle practice
        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        System.out.println("title before click: "+driver.getTitle());

        //5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();


        //6. Switch to new Window.
        //we need to use driver.getWindowHandles() method
        //1-windowHandle - main page
        //2-windowHandle - 2nd window
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            System.out.println("current title while swithcing windows: "+driver.getTitle());
        }
       // System.out.println("title after click: "+driver.getTitle());
        //7. Assert: Title is “New Window”
        Assert.assertEquals(driver.getTitle(),"New Window","does not match");

        //to switch to main window
        System.out.println("switch to main window");
        driver.switchTo().window(mainHandle);
        System.out.println("driver.getTitle() = " + driver.getTitle());

    }
    @AfterMethod
    public void tearDown(){
        driver.quit(); // closes all tabs
    }



}
