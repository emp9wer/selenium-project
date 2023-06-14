package com.cydeo.tests.day03_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP2_Zero_Bank_header_verification {
    public static void main(String[] args) {
        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        String headerTextExpected = "Log in to ZeroBank";
        String headerTextActual = headerText.getText();

        System.out.println("headerTextExpected = " + headerTextExpected);
        System.out.println("headerTextActual = " + headerTextActual);

        if(headerTextActual.equals(headerTextExpected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();
    }
}
