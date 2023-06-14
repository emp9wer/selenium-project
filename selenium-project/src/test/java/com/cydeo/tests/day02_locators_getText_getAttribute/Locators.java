package com.cydeo.tests.day02_locators_getText_getAttribute;

public class Locators {
    public static void main(String[] args) {
                //by  checking the texts of all <a> tags, and returning the matching first web element
        //WebElement element = driver.findElement(By.linkText("A/B Testing")); //equalsTo
        //WebElement element = driver.findElement(By.partialLinkText("Testing")); //contains

                 //by name locator uses the "name" attribute's value to locate the web element.
        //WebElement element = driver.findElement(By.name("hp58"));

                //by id (no 2 elements with same id element)
        //WebElement element = driver.findElement(By.id("jk56"))

                //by class name(does not have to be unique - use it carefully)
        //WebElement element = driver.findElement(By.className("gLFyf"))

                //by tag name // not very useful!
        //WebElement element = driver.findElement(By.tagName("div"))


        //googleSearchBox.sendKeys("apple"+ Keys.ENTER); //input


    }
}
