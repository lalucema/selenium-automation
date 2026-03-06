package ObjRepository.InputForms;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SimpleFormObj extends Helper {

    private final WebDriver driver;

    public SimpleFormObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Single Input Field
    @FindBy(id = "user-message")
    public WebElement inputMessage;

    //
    @FindBy(xpath = "//span[@id='display']")
    public WebElement actualMessage;

    //Show Message Button
    @FindBy(xpath = "//button[contains(text(), 'Show Message')]")
    public WebElement showMessageButton;

    //Two Input Fields
    @FindBy(id = "value1")
    public WebElement inputValue1;
    @FindBy(id = "value2")
    public WebElement inputValue2;

    //Get Total Button
    @FindBy(xpath = "//button[contains(text(), 'Get Total')]")
    public WebElement getTotalButton;

    //Actual Value
    @FindBy(xpath = "//span[@id='displayvalue']")
    public WebElement actualValue;

}