package com.ait.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;

public class FirstSeleniumTest {

    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        //driver.navigate().to( "https://demowebshop.tricentis.com/");

       // driver.navigate().back();
       // driver.navigate().forward();
       // driver.navigate().refresh();
    }

    //test
    @Test
    public void openDemowebshop() {
        System.out.println("Demowebshop opened!");
    }


    //after - tearDown
    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}
