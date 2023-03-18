package org.example;

import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdownprogram {

    @Test
    public void Test()
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.cssSelector("#continents"));

        if(!dropdown.isDisplayed())
        {
            dropdown.click();
        }

        WebElement dropdownenable = driver.findElement(By.cssSelector("#continents"));

        if(!dropdownenable.isEnabled())
        {
            dropdown.click();
        }
        Select select = new Select(driver.findElement(By.id("continents")));

        List<WebElement> list = select.getOptions();
        WebElement dropdownselect = driver.findElement(By.cssSelector("#continents"));

        if(!dropdownselect.isSelected())
        {
            dropdownselect.click();
            select.selectByIndex(4);

        }


    }
}
