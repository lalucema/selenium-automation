package ObjRepository.AlertsAndModals;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class BootstrapAlertsObj extends Helper {

    public BootstrapAlertsObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='autoclosable-btn-success']")
    public WebElement autocloseableSuccessButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-autocloseable-success']")
    public WebElement autocloseableSuccessMessage;

    @FindBy(xpath = "//button[@id='normal-btn-success']")
    public WebElement successButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-normal-success']")
    public WebElement successMessage;

    @FindBy(xpath = "//div[@class='alert alert-success alert-normal-success']//button[@type='button'][normalize-space()='×']")
    public WebElement successExitButton;

    @FindBy(xpath = "//button[@id='autoclosable-btn-warning']")
    public WebElement autocloseableWarningButton;

    @FindBy(xpath = "//div[@class='alert alert-warning alert-autocloseable-warning']")
    public WebElement autocloseableWarningMessage;

    @FindBy(xpath = "//button[@id='normal-btn-warning']")
    public WebElement warningButton;

    @FindBy(xpath = "//div[@class='alert alert-warning alert-normal-warning']")
    public WebElement warningMessage;

    @FindBy(xpath = "//div[@class='alert alert-warning alert-normal-warning']//button[@type='button'][normalize-space()='×']")
    public WebElement warningExitButton;

    @FindBy(xpath = "//button[@id='autoclosable-btn-danger']")
    public WebElement autocloseableDangerButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-autocloseable-danger']")
    public WebElement autocloseableDangerMessage;

    @FindBy(xpath = "//button[@id='normal-btn-danger']")
    public WebElement dangerButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-normal-danger']")
    public WebElement dangerMessage;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-normal-danger']//button[@type='button'][normalize-space()='×']")
    public WebElement dangerExitButton;

    @FindBy(xpath = "//button[@id='autoclosable-btn-info']")
    public WebElement autocloseableInfoButton;

    @FindBy(xpath = "//div[@class='alert alert-info alert-autocloseable-info']")
    public WebElement autocloseableInfoMessage;

    @FindBy(xpath = "//button[@id='normal-btn-info']")
    public WebElement infoButton;

    @FindBy(xpath = "//div[@class='alert alert-info alert-normal-info']")
    public WebElement infoMessage;

    @FindBy(xpath = "//div[@class='alert alert-info alert-normal-info']//button[@type='button'][normalize-space()='×']")
    public WebElement infoExitButton;




}


