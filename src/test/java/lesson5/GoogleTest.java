package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTest {

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
        driver.get("https://www.google.com/");
        actions.scrollToElement(driver.findElement(By.xpath("//div[@jsname=\"LgbsSe\"]")))
               .click()
               .perform();
        actions.moveToElement(driver.findElement(By.xpath("//*[contains(text(), 'Тёмная тема')]"))).click();

        Assertions.assertEquals(driver.findElement(By.xpath("//*[contains(text(), 'Тёмная тема')]")), "Тёмная ночь");

    }


    @AfterEach
    void tearDown() {
        driver.quit();
    }



}
