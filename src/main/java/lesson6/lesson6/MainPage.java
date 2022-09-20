package lesson6.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    @FindBy(id = "text")
    public WebElement searchLine;

    public void clickSearchLine() {
        searchLine.click();
    }

    public MainPage(WebDriver driver) {
          super(driver);
    }
}
