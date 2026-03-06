package ObjRepository.ListBox;

import BaseUtilities.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;


public class BootstrapListBoxObj extends Helper {

    public BootstrapListBoxObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='well text-right']//input[@placeholder='search']")
    public WebElement leftSearchField;

    @FindBy(xpath = "//div[@class='well']//input[@placeholder='search']")
    public WebElement rightSearchField;

    @FindBy(xpath = "//div[@class='dual-list list-left col-md-5']//li[@class='list-group-item']")
    public WebElement leftListItem;

    @FindBy(xpath = "//div[@class='dual-list list-right col-md-5']//li[@class='list-group-item']")
    public WebElement rightListItem;

    @FindBy(xpath = "//div[@class='dual-list list-left col-md-5']//li[@class='list-group-item active']")
    public WebElement leftActiveListItem;

    @FindBy(xpath = "//div[@class='dual-list list-right col-md-5']//li[@class='list-group-item active']")
    public WebElement rightActiveListItem;

    @FindBy(xpath = "//div[@class='well text-right']//i[@class='glyphicon glyphicon-unchecked']")
    public WebElement selectAllLeft;

    @FindBy(xpath = "//div[@class='well']//i[@class='glyphicon glyphicon-unchecked']")
    public WebElement selectAllRight;


    @FindBy(xpath = "//span[@class='glyphicon glyphicon-chevron-right']")
    public WebElement moveRight;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-chevron-left']")
    public WebElement moveLeft;


    public By listLeftGroup = By.xpath("//div[@class='well text-right']//ul[@class='list-group']//li");

    public By listRightGroup = By.xpath("//div[@class='well']//ul[@class='list-group']//li");





}
