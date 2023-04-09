package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Edge";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver =new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        // Open URL
        driver.get(baseUrl);

        // Maximise the window
        driver.manage().window().maximize();

        // We give Implicit wait to driver by implicit method
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        //Print the title of the page
        System.out.println("Title of the page : " + driver.getTitle());

        //Print the current Url
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page source is : " + driver.getPageSource());

        //Enter the username to username field
        driver.findElement(By.id("user-name")).sendKeys("Megha Mehta");

        //Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("Megha12345");

        //Close the browser
        driver.close();

    }
}
