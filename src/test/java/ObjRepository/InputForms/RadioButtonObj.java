package ObjRepository.InputForms;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RadioButtonObj extends Helper {
    WebDriver driver;

    public RadioButtonObj (WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //PageFactory
    //Radio Button Demo
    @FindBy(xpath = "//label[normalize-space()='Female']//input[@name='optradio']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//button[@id='buttoncheck']")
    public WebElement getCheckedValueButton;

    @FindBy(xpath = "//p[@class='radiobutton']")
    public WebElement actualMessage;

    @FindBy(xpath = "//label[normalize-space()='Female']//input[@name='gender']")
    public WebElement groupFemaleRadioButton;

    @FindBy(xpath = "//input[@value='15 - 50']")
    public WebElement ageGroup15to50;

    @FindBy(xpath = "//button[normalize-space()='Get values']")
    public WebElement getValuesButton;

    @FindBy(xpath = "//p[@class='groupradiobutton']")
    public WebElement actualMessages;



































}
