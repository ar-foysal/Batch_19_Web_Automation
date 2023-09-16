package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstWebAutomation extends DriverSetup {
    @Test
    public void testLoadGoogleHomePage() throws InterruptedException {
        // Open a browser
//        WebDriver driver = new ChromeDriver();

        // browse google home page https://www.google.com
        driver.get("https://www.google.com");

        // observe google home page
        Assert.assertEquals(driver.getTitle(), "Google");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");

        // Close browser
//        driver.close();
    }

    @Test
    public void testLoadFacebookHomePage() throws InterruptedException {
        // Open a browser
//        WebDriver driver = new ChromeDriver();

        // browse google home page https://www.google.com
        driver.get("https://www.facebook.com");

        // observe google home page
        Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");

        // Close browser
//        driver.close();
    }


}
