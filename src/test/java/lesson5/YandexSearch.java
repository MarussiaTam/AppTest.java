package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YandexSearch {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }

    @Test
    void inputYandexTest() throws InterruptedException {
        driver.get("https://ya.ru");
        driver.findElement(By.xpath("//input[@class=\"search3__input mini-suggest__input\"]")).sendKeys("Как сделать домашку?");

        driver.findElement(By.xpath("//button[@class=\"search3__button mini-suggest__button\"]")).click();

        Assertions.assertTrue(driver.findElement(By.xpath("//div[@class=\"serp-adv__found\"]")).isDisplayed());
    }

    @AfterEach
    void tearDown() {

        driver.quit();
    }
}
