package TestComponents;

import BaseUtilities.Helper;
import BaseUtilities.MenuHandler;
import ObjRepository.AlertsAndModals.BootstrapAlertsObj;
import ObjRepository.AlertsAndModals.BootstrapModalsObj;
import ObjRepository.AlertsAndModals.WindowPopupObj;
import ObjRepository.DatePickers.BootstrapDatePickerObj;
import ObjRepository.InputForms.*;
import ObjRepository.ListBox.BootstrapListBoxObj;
import ObjRepository.ListBox.DataListFilterObj;
import ObjRepository.ProgressBar.BootstrapProgressBarObj;
import ObjRepository.Table.TableObj;
import Tests.*;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    public Helper helper;
    public MenuHandler menuHandler;
    public SimpleFormObj simpleFormObj;
    public CheckboxObj checkboxObj;
    public RadioButtonObj radioButtonObj;
    public SelectDropdownObj selectDropdownObj;
    public InputFormObj inputFormObj;
    public AjaxFormObj ajaxFormObj;
    public JQueryDropdownObj jQueryDropdownObj;
    public BootstrapDatePickerObj bootstrapDatePickerObj;
    public TableObj tableObj;
    public BootstrapProgressBarObj bootstrapProgressBarObj;
    public BootstrapAlertsObj bootstrapAlertsObj;
    public BootstrapModalsObj bootstrapModalsObj;
    public WindowPopupObj windowPopupObj;
    public BootstrapListBoxObj bootstrapListBoxObj;
    public DataListFilterObj dataListFilterObj;
    public InputForms inputForms;
    public BootstrapDatePicker bootstrapDatePicker;
    public Table table;
    public BootstrapProgressBar bootstrapProgressBar;
    public AlertsAndModals alertsAndModals;
    public ListBox listBox;
    public DataDriven dataDriven;


    public WebDriver initializeDriver() throws IOException {
        //Properties class
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//Resources//GlobalData//GlobalData.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        //firefox
        else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        //edge
        else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }

    public void goToURL() {
        try {
            driver.get("http://demo.seleniumeasy.com/");
        } catch (TimeoutException e) {
            System.out.println("Timeout occurred while navigating to the website: " + e.getMessage());
        } catch (WebDriverException e) {
            System.out.println("WebDriver encountered an error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while navigating to the website: " + e.getMessage());
        }
    }

    public void initializePageObject(WebDriver driver) {
        helper = new Helper(driver, Duration.ofSeconds(20));
        menuHandler = new MenuHandler(driver);
        simpleFormObj = new SimpleFormObj(driver);
        checkboxObj = new CheckboxObj(driver);
        radioButtonObj = new RadioButtonObj(driver);
        selectDropdownObj = new SelectDropdownObj(driver);
        inputFormObj = new InputFormObj(driver);
        ajaxFormObj = new AjaxFormObj(driver);
        jQueryDropdownObj = new JQueryDropdownObj(driver);
        bootstrapDatePickerObj = new BootstrapDatePickerObj(driver);
        tableObj = new TableObj(driver);
        bootstrapProgressBarObj = new BootstrapProgressBarObj(driver);
        bootstrapAlertsObj = new BootstrapAlertsObj(driver);
        bootstrapModalsObj = new BootstrapModalsObj(driver);
        windowPopupObj = new WindowPopupObj(driver);
        bootstrapListBoxObj = new BootstrapListBoxObj(driver);
        dataListFilterObj = new DataListFilterObj(driver);
        dataDriven = new DataDriven();
        inputForms = new InputForms();
        bootstrapDatePicker = new BootstrapDatePicker();
        table = new Table();
        bootstrapProgressBar = new BootstrapProgressBar();
        alertsAndModals = new AlertsAndModals();
        listBox = new ListBox();
    }

    @BeforeMethod
    public void launchApplication() throws IOException {
        driver = initializeDriver();
        initializePageObject(driver);
        goToURL();

    }

    @AfterMethod
    public void closeWebDriver() {
        try {
            Thread.sleep(1000);
            if (driver != null) {
                driver.quit();
                System.out.println("WebDriver closed successfully");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while closing WebDriver: " + e.getMessage());
        }
    }

}



