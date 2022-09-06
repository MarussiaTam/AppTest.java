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
import java.util.function.BooleanSupplier;

public class YandexMapTest {
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
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
    }

    @Test
    void searchPlacesTest() throws InterruptedException {
        driver.get("https://yandex.ru/maps/50/perm/?ll=56.229398%2C58.010374&z=12");
        actions.moveToElement(driver.findElement(By.xpath("//input[@placeholder=\"Поиск мест и адресов\"]")))
                .click()
                .sendKeys("Сибирская, 50")
                .click()
                .perform();
        Thread.sleep(200);

        Assertions.assertTrue(driver.findElement(By.xpath("//input[@value=\"Сибирская, 50\"]")).isDisplayed());
    }


    @AfterEach
    void tearDown() {
        driver.quit();
    }


}
