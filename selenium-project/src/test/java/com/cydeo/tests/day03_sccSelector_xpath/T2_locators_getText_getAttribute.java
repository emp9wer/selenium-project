package com.cydeo.tests.day03_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locators_getText_getAttribute {
    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        System.out.println("Verify “remember me” label text is as expected:");
        WebElement loginCheckBoxLabelText = driver.findElement(By.className("login-item-checkbox-label"));
        String loginCheckBoxLabelTextExpected = "Remember me on this computer";
        String loginCheckBoxLabelTextActual = loginCheckBoxLabelText.getText();
        System.out.println("loginCheckBoxLabelTextExpected = " + loginCheckBoxLabelTextExpected);
        System.out.println("loginCheckBoxLabelTextActual = " + loginCheckBoxLabelTextActual);
        if(loginCheckBoxLabelTextActual.equals(loginCheckBoxLabelTextExpected)){
            System.out.println("loginCheckBoxLabelText TEST PASSED");
        }else {
            System.out.println("loginCheckBoxLabelText TEST FAILED");
        }
        System.out.println("------------------------------------------------------------");

        //4- Verify “forgot password” link text is as expected:
        //Expected: FORGOT YOUR PASSWORD?
        System.out.println("Verify “forgot password” link text is as expected:");
        WebElement forgotPasswordLinkText = driver.findElement(By.className("login-link-forgot-pass"));
        String forgotPasswordLinkTextExpected = "FORGOT YOUR PASSWORD?";
        String forgotPasswordLinkTextActual = forgotPasswordLinkText.getText();
        System.out.println("forgotPasswordLinkTextExpected = " + forgotPasswordLinkTextExpected);
        System.out.println("forgotPasswordLinkTextActual = " + forgotPasswordLinkTextActual);
        if(forgotPasswordLinkTextActual.equals(forgotPasswordLinkTextExpected)){
            System.out.println("forgotPasswordLinkText TEST PASSED");
        }else {
            System.out.println("forgotPasswordLinkText TEST FAILED");
        }
        System.out.println("------------------------------------------------------------");

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        System.out.println("Verify “forgot password” href attribute’s value contains expected:");
        String forgotPasswordLinkTextHrefValueExpected = "forgot_password=yes";
        String forgotPasswordLinkTextHrefValueActual = forgotPasswordLinkText.getAttribute("href");
        System.out.println("forgotPasswordLinkTextHrefValueExpected = " + forgotPasswordLinkTextHrefValueExpected);
        System.out.println("forgotPasswordLinkTextHrefValueActual = " + forgotPasswordLinkTextHrefValueActual);

        if(forgotPasswordLinkTextHrefValueActual.contains(forgotPasswordLinkTextHrefValueExpected)){
            System.out.println("forgotPasswordLinkTextHrefValue TEST PASSED");
        }else {
            System.out.println("forgotPasswordLinkTextHrefValue TEST FAILED");
        }
        driver.close();
        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
