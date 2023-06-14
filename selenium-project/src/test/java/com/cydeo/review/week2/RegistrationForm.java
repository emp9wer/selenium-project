package com.cydeo.review.week2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationForm {

WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
    }

    @Test (priority = 1)
    public void registrationFormPageTest(){
        // TC#3: Registration Form Page Testing

        // 3. Verify title is as expected:
        // Expected: "Registration Form"
        Assert.assertEquals(driver.getTitle(),"Registration Form","Title verification is failed!");
    }

    @Test (priority = 2)
    public void registrationFormPageFillingFormTest(){
        // TC#4: Registration Form Page Filling Form Test



        // 3. Enter First name: "John"
       // WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameField.sendKeys("John");

        // 4. Enter Last name: "Smith"
        WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='last name']"));
        lastNameField.sendKeys("Smith");

        // 5. Enter Username: "johnsmith123"
        WebElement userNameField = driver.findElement(By.xpath("//input[@placeholder='username']"));
        userNameField.sendKeys("johnsmith123");

        // 6. Enter Email address: "john.smith@email.com"
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.sendKeys("john.smith@email.com");

        // 7. Enter password: "John1234"
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("John1234");

        // 8. Enter Phone number: "123-456-7890"
        WebElement PhoneField = driver.findElement(By.xpath("//input[@name='phone']"));
        PhoneField.sendKeys("123-456-7890");

        //!!!!!!!!!!!!!!
        // 9. Click to "Male" from Gender
        //WebElement genderMaleButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement genderMaleButton = driver.findElement(By.xpath("//input[@value='male']"));
        genderMaleButton.click();

        Assert.assertTrue(genderMaleButton.isSelected(),"genderMaleButton verification is failed");

        // 10. Enter Date of birth "01/28/1990"
        // 11. Select "Department of Engineering" from Department/Office dropdown
        // 12. Select "SDET" from Job title dropdown
        // 13. Click to "Java" from languages
        // 14. Click to "Sign up" button
        // 15. Verify text displayed on page
        //     Expected: "Well done!"
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
