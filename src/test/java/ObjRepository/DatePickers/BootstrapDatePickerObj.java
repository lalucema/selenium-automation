package ObjRepository.DatePickers;

import BaseUtilities.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BootstrapDatePickerObj extends Helper {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public BootstrapDatePickerObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    //PageFactory
    @FindBy(xpath = "//input[@placeholder='dd/mm/yyyy']")
    public WebElement calendarInputField;

    @FindBy(css = "div[class='datepicker-days'] th[class='datepicker-switch']")
    public WebElement calendarTitle;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev'][normalize-space()='«']")
    public WebElement buttonPrev;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
    public WebElement buttonNext;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='today'][normalize-space()='Today']")
    public WebElement buttonToday;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='clear'][normalize-space()='Clear']")
    public WebElement buttonClear;

    @FindBy(xpath = "//div[@id='sandbox-container2']//h4[contains(text(),'Select Date')]")
    public WebElement selectDateTitle;

    @FindBy(xpath = "//input[@placeholder='Start date']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@placeholder='End date']")
    public WebElement endDate;



    public void calendarSelector(WebElement monthElement, WebElement elementPrevious, String selectedDay, String selectedMonth, String selectedYear) throws InterruptedException {
        String monthYearValue = monthElement.getText();
        String month = monthYearValue.split(" ")[0].trim();
        String year = monthYearValue.split(" ")[1].trim();

            while (!(month.equals(selectedMonth) && year.equals(selectedYear))) {
                Thread.sleep(1000);
                elementPrevious.click();
                wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(calendarTitle, monthYearValue)));
                monthYearValue = calendarTitle.getText();
                month = monthYearValue.split(" ")[0].trim();
                year = monthYearValue.split(" ")[1].trim();
            }
                waitForTextInElement(calendarTitle, monthYearValue);
                driver.findElement(By.xpath("//td[normalize-space()='" + selectedDay + "']")).click();
                System.out.println("Bootstrap Date Pickers [Date]: Month: " + month + ", Year: " + year);
            }

        public String dateToday(){
            LocalDate date = LocalDate.now();
            // Specify the desired date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return date.format(formatter);
        }


}









