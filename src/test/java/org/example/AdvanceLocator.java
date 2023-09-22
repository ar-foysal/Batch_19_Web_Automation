package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvanceLocator extends DriverSetup{
    @Test
    public void testNopCommerce() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//form/input")).clear();
        driver.findElement(By.cssSelector("form > input")).sendKeys("Apple MacBook Pro 13-inch");
        Thread.sleep(5000);

        String search_btn_text =  driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']")).getText();
        System.out.println(search_btn_text);

        driver.findElement(By.cssSelector("button[type='submit'][class='button-1 search-box-button']")).click();

        Thread.sleep(5000);

        System.out.println(driver.findElement(By.xpath("//h2/a[starts-with(@href, '/apple-macbook-pro')]")).getText());

        driver.findElement(By.cssSelector("a[href^= '/apple-macbook']")).click();

        WebElement element = driver.findElement(By.xpath("//*[contains(@id, 'cart-button-4')]"));
        String addToCart_btn_text =  element.getText();
        System.out.println(addToCart_btn_text);

        driver.findElement(By.cssSelector("[id*='cart-button-4']")).click();
        Thread.sleep(500);

        driver.findElement(By.linkText("shopping cart")).click();

        Thread.sleep(5000);

        String actualUnitPrice = driver.findElement(By.xpath("//tr/td[5]/preceding-sibling::td[1]")).getText();
        String actualTotalPrice = driver.findElement(By.xpath("//tr/td[5]/following-sibling::td[1]")).getText();

        Assert.assertEquals(actualUnitPrice, "$1,800.00");
        Assert.assertEquals(actualTotalPrice, "$3,600.00");


    }
}
