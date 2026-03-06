package ObjRepository.AlertsAndModals;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;


public class WindowPopupObj extends Helper {

    public final WebDriver driver;

    public WindowPopupObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Follow @seleniumeasy on Twitter']")
    public WebElement followOnTwitterButton;

    @FindBy(xpath = "//a[@title='Follow @seleniumeasy on Facebook']")
    public WebElement likeUsOnFacebookButton;


    @FindBy(xpath = "//a[normalize-space()='Follow Twitter & Facebook']")
    public WebElement followTwitterAndFacebookButton;

    @FindBy(xpath = "//a[@id='followall']")
    public WebElement followAllButton;

}

