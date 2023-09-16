package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocator extends DriverSetup {
    @Test
    public void testGoogleSearch() throws InterruptedException {
        driver.get("https://www.google.com");
        // Locate using id
//        WebElement searchBox =  driver.findElement(By.id("APjFqb"));

        // Locate using name
//        WebElement searchBox =  driver.findElement(By.name("q"));

        // Locate using Class name
//        WebElement searchBox =  driver.findElement(By.className("gLFyf"));

        // Locate using Tag name
        WebElement searchBox =  driver.findElement(By.tagName("textarea"));

        searchBox.sendKeys("Test Automation");
        Thread.sleep(2000);
        searchBox.clear();

        // Locate using Link text
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        System.out.println(gmailLink.getText());
//        gmailLink.click();

        // Locate using partial Link text
        WebElement imageSearchLink = driver.findElement(By.partialLinkText("mages"));
        System.out.println(imageSearchLink.getText());

        // Locate using CSS selector
        WebElement countyName = driver.findElement(By.cssSelector("div[class='uU7dJb']"));

        System.out.println(countyName.getText());

        // Locate using xpath selector
        WebElement languageOption = driver.findElement(By.xpath("//div[@id='SIvCob']"));

        System.out.println(languageOption.getText());
        Thread.sleep(5000);
    }
}
