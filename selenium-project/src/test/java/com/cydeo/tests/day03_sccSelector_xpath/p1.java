package com.cydeo.tests.day03_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class p1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

      WebElement searchBar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBar.sendKeys("star craft 1");
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);










    }

}
