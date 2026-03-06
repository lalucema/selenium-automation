package ObjRepository.InputForms;

import BaseUtilities.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;

public class JQueryDropdownObj extends Helper {
    private final WebDriver driver;

    public JQueryDropdownObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Single Select - Search and Select country']")
    public WebElement title;

    @FindBy(xpath = "//label[contains(text(),'Select Country')]//following-sibling::span//span//span[@class='select2-selection__arrow']")
    public WebElement dropdownCountry;

    @FindBy(xpath = "//input[@role='textbox']")
    public WebElement dropdownState;

    @FindBy(xpath = "//label[contains(text(),'Select US Outlying Territories :')]//following-sibling::span//span//span[@class='select2-selection__arrow']")
    public WebElement dropdownTerritories;

    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@role='textbox']")
    public WebElement selectSingleField;

    @FindBy(xpath = "//span[@id='select2-country-container']")
    public WebElement inputField;

    @FindBy(xpath = "//li[@role='treeitem']")
    public WebElement errorMessage;

    @FindBy(xpath = "//select[@id='files']")
    public WebElement dropdownScripting;

    @FindBy(xpath = "//label[@for='files']")
    public WebElement selectText;

    @FindBy(xpath = "//optgroup//option[normalize-space()='Ruby']")
    public WebElement selectRuby;


    public WebElement multipleStates(String selectedState){
         return driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']//li[@title='" + selectedState + "']"));
    }

    public WebElement disabledDropdown(String selectedTerritory){
        return driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']//span[@title='" + selectedTerritory + "']"));
    }

    public WebElement categoryOption(String selectedOption){
        return driver.findElement(By.xpath("//optgroup//option[normalize-space()='" + selectedOption + "']"));
    }





}
