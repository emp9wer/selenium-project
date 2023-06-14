package com.cydeo.tests.day04_findElement_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Draft {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.tesla.com/");

        WebElement a = driver.findElement(By.cssSelector("a[href='https://www.tesla.com/']"));
        a.click();
    }
}
