package ObjRepository.InputForms;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectDropdownObj extends Helper {
    private final WebDriver driver;

    public SelectDropdownObj (WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //PageFactory
    //Select Dropdown List
    @FindBy(xpath = "//select[@id='select-demo']")
    public WebElement dropdownList;

    @FindBy(xpath = "//p[@class='selected-value']")
    public WebElement actualMessage;

    @FindBy(xpath = "//button[@id='printMe']")
    public WebElement firstSelectedButton;

    @FindBy(xpath ="//select[@id='multi-select']")
    public WebElement multiselectList;

    @FindBy(xpath = "//button[@id='printAll']")
    public WebElement getAllSelectedButton;

    @FindBy(xpath = "//p[@class='getall-selected']")
    public WebElement actualMessages;



}
