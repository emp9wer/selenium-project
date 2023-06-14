package com.cydeo.tests.day05_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Intro {

    @BeforeClass
    public void setUp(){
        System.out.println("!!!before Class is running...");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println(">>>before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("<<<after method is running...");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("---Test 1 is running...");
        //AssertEquals method will compare 2 of the same values true or false

        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
        //test stops if assert fails (better to put in the end)


    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("---Test 2 is running...");

        String actual ="white";
        String expected ="white";

        Assert.assertTrue(actual.equals(expected));

    }


}
