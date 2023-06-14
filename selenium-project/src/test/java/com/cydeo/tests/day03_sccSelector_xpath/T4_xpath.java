package com.cydeo.tests.day03_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_xpath {
    public static void main(String[] args) {
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        System.out.println("locating element using .xpath()----------\"//tagName[@attribute='value']\"----------");
            //locating element using .xpath()--------------------
        // "//tagName[@attribute='value']"
            //using type attribute value
       // WebElement logInButton = driver.findElement(By.xpath("//input[@type='submit']"));
            //using value attribute value
       // WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
            //using class attribute value
        WebElement logInButton = driver.findElement(By.xpath("//input[@class='login-btn']"));

        String loginButtonTextExpected = "Log In";
        String loginButtonTextActual = logInButton.getAttribute("value");

        System.out.println("loginButtonTextExpected = " + loginButtonTextExpected);
        System.out.println("loginButtonTextActual = " + loginButtonTextActual);

        if(loginButtonTextExpected.equals(loginButtonTextActual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();

        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from

    }
}
