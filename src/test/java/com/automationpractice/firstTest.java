package com.automationpractice;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

    @Test
    public  void firstTest(){
        System.setProperty("webdriver.chrome.driver", "C:/ChromeWebDriver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }
}
