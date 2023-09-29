package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTagHandling extends DriverSetup{


    @Test
    public void testSelectTag() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        dropDown.click();
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option3");
        Thread.sleep(5000);

        select.selectByIndex(2);
        Thread.sleep(5000);
        select.selectByValue("option1");
        Thread.sleep(5000);
        select.selectByIndex(0);
        Thread.sleep(5000);
        System.out.println(select.getFirstSelectedOption().getText());


    }
}
