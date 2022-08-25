package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class YandexMaps {

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();

            WebDriver webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

            webDriver.get("https://yandex.ru/maps");

            webDriver.findElement(By.xpath("//a[@href='/maps/50/perm/routes/']")).click();

            webDriver.findElement(By.xpath("//div[@aria-label='Пешком']")).click();

            WebElement inputFromWhere = webDriver.findElement(By.xpath("//input[@placeholder='Откуда']"));
            inputFromWhere.sendKeys("Ленина 50");
           //webDriver.findElement(By.xpath("//input[@value='Ленина]")).click();
            Thread.sleep(7000);
            //нажать самостоятельно на нужную улицу(не придумала как выбрать автоматически пока

            WebElement inputWhere = webDriver.findElement(By.xpath("//input[@placeholder='Куда']"));
            inputWhere.sendKeys("улица Попова, 3");
            Thread.sleep(7000);

            webDriver.quit();
        }
}
