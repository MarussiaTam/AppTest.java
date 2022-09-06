package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

public class AfishaTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private Object element;


    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get("https://afisha.ru");
    }

    @Test
    void goToOkkoTest() throws InterruptedException {
    //((JavascriptExecutor)driver).executeScript("let element = document.evaluate(\"//div[@data-test='HONEY-AD AD-ad_1']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null) element.singleNodeValue.remove()");
    //Thread.sleep(10000);
    actions.moveToElement(driver.findElement(By.xpath("/a[.='КИНО']"))).perform();

    }    @AfterEach
    void tearDown() {

        driver.quit();
    }
}
