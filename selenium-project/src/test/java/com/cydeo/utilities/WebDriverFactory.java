package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverFactory {
    /**
     * creates Webdriver with parameter of browser
     * @param browserType
     * @return
     */
    public static WebDriver getDriver(String browserType){

        if(browserType.equalsIgnoreCase("chrome")){         // 1 case

            WebDriverManager.chromedriver().setup();
             return new ChromeDriver();


        }else if (browserType.equalsIgnoreCase("firefox")) { // 2 case

            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        } else if (browserType.equalsIgnoreCase("edge")){ // 2 case

                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();

            }else{                                                         // 3 case

            System.out.println("Given string doesn't represent any browser.");
            System.out.println("Either that browser does not exist or not currently supported");
            System.out.println("diver = null");
            return null;

        }

    }
}
