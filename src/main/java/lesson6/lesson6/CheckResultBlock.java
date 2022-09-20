package lesson6.lesson6;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckResultBlock extends BasePage {
    public CheckResultBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class=\"serp-adv__found\"]")
    private WebElement displayResult;

    public void checkDisplayResult() {
        Assertions.assertTrue(driver.findElement(By.xpath("//div[@class=\"serp-adv__found\"]")).isDisplayed());
    }
}