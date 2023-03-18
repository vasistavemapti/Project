package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class textboxprogram {
    @Test
    public void Test()  throws Exception {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://demoqa.com/automation-practice-form");

       Thread.sleep(1000);

        WebElement username = driver.findElement(By.cssSelector("#userEmail"));
        if (username.isDisplayed())
        {
            if(username.isEnabled())
            {
                username.click();
                username.sendKeys("abcd@gmail.com");
                System.out.println(username.getAttribute("value"));
              Thread.sleep(3000);
            }
            else
                System.out.println("The window is not enabled");
        }
        else
            System.out.println("The window is not displayed");
    }
}
