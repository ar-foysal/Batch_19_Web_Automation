package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstWebAutomation {
    @Test
    public void loadGoogleHomePage() throws InterruptedException {
        // Open a browser
        WebDriver driver = new ChromeDriver();

        // browse google home page https://www.google.com
        driver.get("https://www.google.com");

        // observe google home page
        Thread.sleep(10000);

        // Close browser
        driver.close();
    }

}
