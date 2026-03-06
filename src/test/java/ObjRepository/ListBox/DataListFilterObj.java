package ObjRepository.ListBox;

import BaseUtilities.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;


public class DataListFilterObj extends Helper {

    public DataListFilterObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='input-search']")
    public WebElement searchField;
    public By listItems = By.className("items");

    public void validateElementsContainingText(By locator, String expected){
        List<WebElement> elementsList = driver.findElements(locator);
        elementsList.stream()
                .filter(item -> item.getText().contains(expected))
                .map(item -> item.getText()) //Filter and extract the text
                .peek(name -> System.out.println("Text found: \n\n" + name))
                .forEach(name ->   Assert.assertTrue(name.contains(expected), "not found in the element text"));// Iterates to find the element
    }

}
