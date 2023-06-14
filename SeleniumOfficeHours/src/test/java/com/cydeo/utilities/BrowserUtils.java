package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /**
     * Sleep method
     * @param second
     */
    public static void sleep(int second){
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Switches Windows And Verifies if given Sting expectedInTitle contained in Title
     * @param driver
     * @param expectedInURL
     * @param expectedInTitle
     */
    public static void switchWindowAndVerify(WebDriver driver,String expectedInURL, String expectedInTitle){
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);

            if(driver.getCurrentUrl().contains("expectedInURL")){
                break;
            }
        }
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /**
     * verifies Title matches String expectedTitle
     * @param driver
     * @param expectedTitle
     */
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    /**
     * verifies Title contains String expectedInTitle
     * @param driver
     * @param expectedInTitle
     */
    public static void verifyTitleContains(WebDriver driver, String expectedInTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedInTitle));
    }

}
