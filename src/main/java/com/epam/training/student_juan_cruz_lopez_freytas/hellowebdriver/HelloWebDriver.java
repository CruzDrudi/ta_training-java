package com.epam.training.student_juan_cruz_lopez_freytas.hellowebdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class HelloWebDriver {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");

        WebElement searchInput = waitUntilElementLocated(driver, By.id("query"));
        searchInput.sendKeys("selenium java");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id='search']/form/input[2]"));
        searchButton.click();

        Thread.sleep(10000); // Recordá que este sleep es solo para ver el resultado, no es buena práctica.

        driver.quit();
    }

    private static WebElement waitUntilElementLocated(WebDriver driver, By by) {

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
    }
}
