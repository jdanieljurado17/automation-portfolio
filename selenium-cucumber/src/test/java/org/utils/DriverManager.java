package org.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class DriverManager {
    private static WebDriver driver;

    @BeforeClass
    public static void initializeDriver(){
        if (driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    public static WebDriver getDriver(){
        if(driver == null){
            initializeDriver();
        }
        return driver;
    }

    @AfterClass
    public static void quitDriver(){
        if(driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }
}
