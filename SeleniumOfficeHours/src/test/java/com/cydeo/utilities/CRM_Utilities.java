package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
this class will store methods related to CRM project
 */
public class CRM_Utilities {
    /**
     * this method will log in using below credentials
     * @username: hr100@cybertekschool.com
     * @password: UserUser
     * @param driver
     */
    public static void login_crm(WebDriver driver){
        //3. Enter valid username
        WebElement loginTextField = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginTextField.sendKeys("hr100@cybertekschool.com");

        //4. Enter valid password
        WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordTextField.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }

    public static void login_crm(WebDriver driver,String login,String password){
        //3. Enter valid username
        WebElement loginTextField = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginTextField.sendKeys(login);

        //4. Enter valid password
        WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordTextField.sendKeys(password);

        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }
}
