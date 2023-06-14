package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T8_ {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        //TC #8: Selecting value from non-select dropdown
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void t1() throws InterruptedException {

        //3. Click to non-select dropdown
        Thread.sleep(1000);
        WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectDropdown.click();
        //4. Select Facebook from dropdown
        Thread.sleep(1000);
        WebElement faceBookDropdownElement = driver.findElement(By.xpath("//a[.='Facebook']"));
        faceBookDropdownElement.click();

        //5. Verify title is “Facebook - Log In or Sign Up”
        String expected = "Facebook - Log In or Sign Up";
        String actual = driver.getTitle();

        Assert.assertEquals(actual,expected);


    }


}