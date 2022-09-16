package lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YandexSearchTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }
    @Test
    void YandexSearchTest() {
        driver.get("https://ya.ru");
        new MainPage(driver).clickSearchLine();
        new SearchPage(driver).searchPhrase("Как сделать домашку?");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
