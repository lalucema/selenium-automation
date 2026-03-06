package ObjRepository.InputForms;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AjaxFormObj extends Helper {
    private final WebDriver driver;

    public AjaxFormObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //PageFactory
    //Ajax Form Submit
    @FindBy(xpath = "//input[@id='title']")
    public WebElement fieldName;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement fieldComment;

    @FindBy(xpath = "//input[@id='btn-submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@id='submit-control']")
    public WebElement actualMessage;

    @FindBy(xpath="//span[@class='title-validation validation-error']")
    public WebElement errorNameField;














}