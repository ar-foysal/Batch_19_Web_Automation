package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{
    @Test
    public void testWebElement() throws InterruptedException {
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement textBox = driver.findElement(By.cssSelector("#autocomplete"));
        String tagName = textBox.getTagName();
        System.out.println(tagName);

        textBox.sendKeys("Hello");
        Thread.sleep(1000);
        textBox.clear();
        Thread.sleep(1000);
        System.out.println(textBox.getAttribute("placeholder"));
        Thread.sleep(1000);
        System.out.println(textBox.isDisplayed());
        WebElement checkBoxOption =driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        System.out.println("Is selected " + checkBoxOption.isSelected());
        checkBoxOption.click();
        System.out.println("Is selected " + checkBoxOption.isSelected());
        System.out.println(checkBoxOption.isEnabled());
        Thread.sleep(1000);
        System.out.println(checkBoxOption.getCssValue("padding"));
    }

}
