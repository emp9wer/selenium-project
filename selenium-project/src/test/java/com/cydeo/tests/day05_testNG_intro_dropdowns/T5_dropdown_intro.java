package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_dropdown_intro {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC#5: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simple_dropdowns_test(){

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
//locating dropdown as a web element
       WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
//creating select class object and passing the dropdown web element into constructor
        Select select = new Select(simpleDropdown);

        String expectedDefaultValue = "Please select an option";
        String actualDefaultValue = select.getFirstSelectedOption().getText();
        //do our assertion
        Assert.assertEquals(actualDefaultValue,expectedDefaultValue);
        Assert.assertTrue(actualDefaultValue.equals(expectedDefaultValue));

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        //create selectObject and also locate dropdown itself in my constructor
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedDefaultStateValue = "Select a State";
        //actual
        String actualDefaultStateValue = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDefaultStateValue,expectedDefaultStateValue);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
