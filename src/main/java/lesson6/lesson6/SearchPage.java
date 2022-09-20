package lesson6.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@class=\"search3__input mini-suggest__input\"]")
    private WebElement searchField;

     public void searchPhrase(String phrase) {
         searchField.sendKeys(phrase);

    }

}
