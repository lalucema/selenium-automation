package ObjRepository.ProgressBar;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BootstrapProgressBarObj extends Helper {
        private final WebDriver driver;

        public BootstrapProgressBarObj(WebDriver driver) {
            super(driver, Duration.ofSeconds(20));
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//button[@id='cricle-btn']")
        public WebElement downloadButton;

        @FindBy(xpath = "//div[@class='percenttext']")
        public WebElement progressPercentage;











}
