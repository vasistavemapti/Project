package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class  screenshotprogram {
    public static void main(String[] args) throws IOException {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com");
        driver.findElement(By.id("signupbtn_topnav")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./Screenshots/Image1.png"));
        //way2 string of type
        //String base64Code =ts.getScreenshotAs(OutputType.BASE64);
        // byte[] byteArr= Base64.getDecoder().decode(base64Code);
        // FileOutputStream fos=new FileOutputStream(new File("./Screenshots/Image2.jpeg"));
        //fos.write(byteArr);
        // fos.close();
        //way3
        // byte[]  byteArr=ts.getScreenshotAs(OutputType.BYTES);
        // FileOutputStream fos=new FileOutputStream(new File("./Screenshots/Image3.jpg"));
        // fos.write(byteArr);
        // fos.close();

    }
}
