package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_WebTable_order_verify {

    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        //1. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void order_verify_name_test(){
        ////TC #1: Web table practice
        //    //2. Verify Bob’s name is listed as expected.
        //    //Expected: “Bob Martin”
        //  WebElement nameFieldBob = driver.findElement(By.xpath("//table/tbody//tr[7]//td[2]"));
        WebElement nameFieldBob = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));
        //WebElement nameFieldBob = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody//tr[7]//td[2]"));
        System.out.println("nameFieldBob = " + nameFieldBob.getText());
        Assert.assertEquals(nameFieldBob.getText(),"Bob Martin","names are not matching");
        //    //3. Verify Bob Martin’s order date is as expected
        //    //Expected: 12/31/2021
        //WebElement dateFieldBob = driver.findElement(By.xpath("//table/tbody//tr[7]//td[5]"));
        //WebElement dateFieldBob = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/../td[5]"));
        // WebElement dateFieldBob = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));
        WebElement dateFieldBob = driver.findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));
        Assert.assertEquals(dateFieldBob.getText(),"12/31/2021","date is not matching");
    }

    @Test
    public void t2_use_methods() {
        //call method
       String alexandraGray = WebOrderUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("alexandraGray = " + alexandraGray);

        WebOrderUtils.orderVerify(driver,"Alexandra Gray",WebOrderUtils.returnOrderDate(driver,"Alexandra Gray"));
        //TC #2: Web table practice Task1 cont.
        //1. Create a new class called WebTableUtils.
        //2. Create two methods to verify order
    }

    @Test
    public void t2_use_methods2() {
        WebOrderUtils.orderVerify(driver,"John Doe","01/08/2021");
    }






}
