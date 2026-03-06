package ObjRepository.Table;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;


public class TableObj extends Helper{
    private final WebDriver driver;

    public TableObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //PageFactory
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchField;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement firstRow;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    public WebElement emptyTable;

















}
