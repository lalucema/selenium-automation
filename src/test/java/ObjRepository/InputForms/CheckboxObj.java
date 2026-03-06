package ObjRepository.InputForms;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckboxObj extends Helper {
    private final WebDriver driver;

    public CheckboxObj (WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Page Factory
    //Checkbox

    @FindBy(xpath = "//input[@id='isAgeSelected']")
    public WebElement singleCheckbox;

    @FindBy(xpath = "//label[normalize-space()='Default Disabled']")
    public WebElement disabledCheckbox;

    @FindBy(xpath = "//div[@id='txtAge']")
    public WebElement actualMessage;

    @FindBy(xpath = "//label[normalize-space()='Option 1']")
    public WebElement Option1;

    @FindBy(xpath = "//label[normalize-space()='Option 2']")
    public WebElement Option2;

    @FindBy(xpath = "//label[normalize-space()='Option 3']")
    public WebElement Option3;

    @FindBy(xpath = "//label[normalize-space()='Option 4']")
    public WebElement Option4;

    @FindBy(xpath = "//input[@value='Check All']")
    public WebElement checkAllButton;

    @FindBy(xpath = "//input[@value='Uncheck All']")
    public WebElement uncheckAllButton;

    @FindBy(xpath = "//input[@id='check1']")
    public WebElement checkButton;


}
