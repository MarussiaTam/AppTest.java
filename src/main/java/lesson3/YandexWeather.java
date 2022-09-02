package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YandexWeather {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        webDriver.get("https://yandex.ru/pogoda");

        WebElement inputSearch = webDriver.findElement(By.xpath("//input[@placeholder='Город или район']"));
        inputSearch.sendKeys("Пермь");

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        Thread.sleep(5000);
        webDriver.findElement(By.xpath("//a[.='Пермь']")).click();

        Thread.sleep(5000);
        webDriver.quit();
    }
}
