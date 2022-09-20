package lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson6.lesson6.MainPage;
import lesson6.lesson6.SearchPage;
import lesson6.lesson6.CheckResultBlock;
import org.junit.jupiter.api.*;
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
        new CheckResultBlock(driver);
            }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
