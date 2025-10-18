package com.epam.training.student_juan_cruz_lopez_freytas.hellowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        WebElement buttonPlaceholder = driver.findElement(By.className("DocSearch-Button-Placeholder"));
        buttonPlaceholder.click();
        WebElement searchInput = driver.findElement(By.id("docsearch-input"));
        searchInput.sendKeys("selenium java" + Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();
    }
}
