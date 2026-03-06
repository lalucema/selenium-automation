package BaseUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuHandler {

    public static WebDriver driver;

    public MenuHandler(WebDriver driver) {
        MenuHandler.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Page Factory - Menu List
    @FindBy(xpath = "//ul/li[@class='tree-branch']//a[contains(text(), 'Input Forms')]")
    public WebElement InputForms;

    @FindBy(xpath = "//div[normalize-space()='Two Input Fields']")
    public WebElement inputFormsText;

    @FindBy(xpath = "//ul//li[@style='display: list-item;']//a[contains(text(), 'Simple Form Demo')]")
    public WebElement SimpleFormDemo;

    @FindBy(xpath = "//ul//li[@style='display: list-item;']//a[contains(text(), 'Checkbox Demo')]")
    public WebElement CheckboxDemo;

    @FindBy(xpath = "//div[normalize-space()='Multiple Checkbox Demo']")
    public WebElement checkboxText;

    @FindBy(xpath = "//ul//li[@style='display: list-item;']//a[contains(text(), 'Radio Buttons Demo')]")
    public WebElement RadioButtonsDemo;

    @FindBy(xpath = " //div[normalize-space()='Group Radio Buttons Demo']")
    public WebElement radioText;

    @FindBy(xpath = "//ul//li[@style='display: list-item;']//a[contains(text(), 'Select Dropdown List')]")
    public WebElement SelectDropdownList;

    @FindBy(xpath = "//div[normalize-space()='Multi Select List Demo']")
    public WebElement dropdownText;

    @FindBy(xpath = "//ul//li[@style='display: list-item;']//a[contains(text(), 'Input Form Submit')]")
    public WebElement InputFormSubmit;

    @FindBy(xpath = "//ul//li[@style='display: list-item;']//a[contains(text(), 'Ajax Form Submit')]")
    public WebElement AjaxFormSubmit;

    @FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[normalize-space()='JQuery Select dropdown']")
    public WebElement JQuerySelectDropdown;

    @FindBy(xpath = "//li[@class='tree-branch']//a[@href='#'][normalize-space()='Date pickers']")
    public WebElement DatePicker;

    @FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[normalize-space()='Bootstrap Date Picker']")
    public WebElement BootstrapDatePicker;

    @FindBy(xpath = "//li[@class='tree-branch']//a[@href='#'][normalize-space()='Table']")
    public WebElement Table;

    @FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[normalize-space()='Table Sort & Search']")
    public WebElement TableSortAndSearch;

    @FindBy(xpath = "//a[normalize-space()='Progress Bars & Sliders']")
    public WebElement ProgressBarAndSliders;

    @FindBy(xpath = "//div[normalize-space()='Progress Bar for Download']")
    public WebElement progressBarText;

    @FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[normalize-space()='Bootstrap Progress bar']")
    public WebElement BootstrapProgressBar;

    @FindBy(xpath = "//li[@class='tree-branch']//a[@href='#'][normalize-space()='Alerts & Modals']")
    public WebElement AlertsAndModals;

    @FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[normalize-space()='Bootstrap Alerts']")
    public WebElement BootstrapAlerts;

    @FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[normalize-space()='Bootstrap Modals']")
    public WebElement BootstrapModals;

    @FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[normalize-space()='Window Popup Modal']")
    public WebElement WindowPopup;

    @FindBy(xpath = "//li[@class='tree-branch']//a[@href='#'][normalize-space()='List Box']")
    public WebElement ListBox;

    @FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[normalize-space()='Bootstrap List Box']")
    public WebElement BootstrapListBox;

    @FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[normalize-space()='Data List Filter']")
    public WebElement DataListFilter;


}

