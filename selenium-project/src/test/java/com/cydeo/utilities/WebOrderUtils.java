package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WebOrderUtils {

    /**
     * This method accepts a costumerName and returns the costumer order date as a String.
     * @param driver
     * @param customerName
     * @return
     */
    public static String returnOrderDate(WebDriver driver, String customerName){
        //Method #1 info:
        //• Name: returnOrderDate ()
        //• Arg1: WebDriver driver
        //• Arg2: String costumerName

//        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";
//        WebElement customerDateCell = driver.findElement(By.xpath(locator));
//        return customerDateCell.getText();
        return driver.findElement(By.xpath("//td[.='"+customerName+"']/following-sibling::td[3]")).getText();
    }

    /**
     * This method accepts costumerName and expectedOrderDate arguments and internally assert expectedOrderDate matching actualOrderDate.
     * @return
     */
    public static void orderVerify (WebDriver driver, String costumerName, String expectedOrderDate){
        //Method #2 info:
        //• Name: orderVerify ()
        //• Return type: void
        //• Arg1: WebDriver driver
        //• Arg2: String costumerName
        //• Arg3: String expectedOrderDate
        //using returnOrderDate method

        Assert.assertEquals(WebOrderUtils.returnOrderDate(driver,costumerName),expectedOrderDate);

    }
}
