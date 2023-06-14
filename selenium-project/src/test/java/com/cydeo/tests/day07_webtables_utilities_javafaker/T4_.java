package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_ {
    //TC #4: Login scenario
    //1. Create new test and make set ups
    //2. Go to: http://login1.nextbasecrm.com/
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        //1. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to : https://www.amazon.com
        driver.get("http://login1.nextbasecrm.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void test1(){
        //login using method in CRM_utilities class
        //USERNAME hr100@cybertekschool.com
        //PASSWORD UserUser
        CRM_Utilities.login_crm(driver);

        //6. Verify title is as expected: "(5) Portal"
        BrowserUtils.sleep(1);
        BrowserUtils.verifyTitle(driver,"(5) Portal");
    }


    @Test
    public void test2(){
        //login using method in CRM_utilities class
        //USERNAME hr1@cybertekschool.com
        //PASSWORD UserUser
        CRM_Utilities.login_crm(driver,"hr1@cybertekschool.com","UserUser");

        //6. Verify title is as expected: Portal
        BrowserUtils.sleep(1);
        BrowserUtils.verifyTitle(driver,"(1) Portal");
    }

    @Test
    public void test3(){
        //login using method in CRM_utilities class
        //USERNAME hr1@cybertekschool.com
        //PASSWORD UserUser
        CRM_Utilities.login_crm(driver,"hr2@cybertekschool.com","UserUser");

        //6. Verify title is as expected: Portal
        BrowserUtils.sleep(1);
        BrowserUtils.verifyTitle(driver,"(1) Portal");
    }

}
