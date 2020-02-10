package com.automationpractice;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    @Test
    public  void firstTest(){
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        
    }
}
