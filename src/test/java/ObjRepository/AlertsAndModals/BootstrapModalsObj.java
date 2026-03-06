package ObjRepository.AlertsAndModals;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BootstrapModalsObj extends Helper {

    private final WebDriver driver;

    public BootstrapModalsObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Single Modal
    @FindBy(xpath = "//a[@href='#myModal0'][normalize-space()='Launch modal']")
    public WebElement singleLaunchButton;

    @FindBy(xpath = "//div[@id='myModal0']//div[@class='modal-body']")
    public WebElement singleModalMessage;

    @FindBy(xpath = "//div[@id='myModal0']//a[@class='btn btn-primary'][normalize-space()='Save changes']")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//div[@id='myModal0']//a[@class='btn'][normalize-space()='Close']")
    public WebElement closeButton;

    @FindBy(xpath = "//div[@id='myModal0']//button[@type='button'][normalize-space()='×']")
    public WebElement exitButton;



    //First Multiple Modal
    @FindBy(xpath = "//a[@href='#myModal'][normalize-space()='Launch modal']")
    public WebElement firstMultipleLaunchButton;

    @FindBy(xpath = "//div[@id='myModal']//div[@class='modal-body'][contains(text(),'This is the place where the content for the modal ')]")
    public WebElement firstMultipleModalMessage;

    @FindBy(xpath = "//div[@id='myModal']//a[@class='btn btn-primary'][normalize-space()='Save changes']")
    public WebElement firstSaveChangesButton;

    @FindBy(xpath = "//div[@id='myModal']//a[@class='btn'][normalize-space()='Close']")
    public WebElement firstCloseButton;

    @FindBy(xpath = "//div[@id='myModal']//button[@type='button'][normalize-space()='×']")
    public WebElement firstExitButton;

    //Multiple Second Modal
    @FindBy(xpath = "//div[@class='modal-body']//a[@class='btn btn-primary'][normalize-space()='Launch modal']")
    public WebElement secondMultipleLaunchModal;

    @FindBy(xpath = "//div[@id='myModal2']//a[@class='btn btn-primary'][normalize-space()='Save changes']")
    public WebElement secondMultipleSaveChangesButton;

    @FindBy(xpath = "//div[@id='myModal2']//a[@class='btn'][normalize-space()='Close']")
    public WebElement secondMultipleCloseButton;

    @FindBy(xpath = "//div[@id='myModal2']//div[@class='modal-body'][contains(text(),'This is the place where the content for the modal ')]")
    public WebElement secondMultipleModalMessage;

    @FindBy(xpath = "//div[@id='myModal2']//button[@type='button'][normalize-space()='×']")
    public WebElement secondMultipleExitButton;


}

