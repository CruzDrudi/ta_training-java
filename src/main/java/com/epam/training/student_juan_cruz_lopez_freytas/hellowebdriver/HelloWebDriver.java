package com.epam.training.student_juan_cruz_lopez_freytas.hellowebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        driver.quit();
    }
}
