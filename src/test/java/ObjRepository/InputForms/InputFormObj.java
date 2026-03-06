package ObjRepository.InputForms;

import BaseUtilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.time.Duration;

public class InputFormObj extends Helper {
    public WebDriver driver;

    public InputFormObj(WebDriver driver) {
        super(driver, Duration.ofSeconds(20));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //PageFactory
    //Select Dropdown List
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='E-Mail Address']")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@placeholder='(845)555-1212']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@placeholder='Address']")
    public WebElement address;

    @FindBy(xpath = "//input[@placeholder='city']")
    public WebElement city;

    @FindBy(xpath = "//select[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@placeholder='Zip Code']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@placeholder='Website or domain name']")
    public WebElement website;

    @FindBy(xpath = "//label[normalize-space()='Yes']")
    public WebElement yesRadio;

    @FindBy(xpath = "//textarea[@placeholder='Project Description']")
    public WebElement projectDescription;

    @FindBy(xpath = "//button[normalize-space()='Send']")
    public WebElement sendButton;

    //Error
    @FindBy(xpath = "//small[normalize-space()='Please supply your first name']")
    public WebElement errorFirstName;

    @FindBy(xpath = "//small[normalize-space()='Please supply your last name']")
    public WebElement errorLastName;

    @FindBy(xpath = "//small[normalize-space()='Please supply your email address']")
    public WebElement errorEmailAddress;

    @FindBy(xpath = "//small[normalize-space()='Please supply your phone number']")
    public WebElement errorPhoneNumber;

    @FindBy(xpath = "//small[normalize-space()='Please supply your street address']")
    public WebElement errorAddress;

    @FindBy(xpath = "//small[normalize-space()='Please supply your city']")
    public WebElement errorCity;

    @FindBy(xpath = "//small[normalize-space()='Please select your state']")
    public WebElement errorState;

    @FindBy(xpath = "//small[normalize-space()='Please supply your zip code']")
    public WebElement errorZipcode;

    @FindBy(xpath = "//small[normalize-space()='Please supply a description of your project']")
    public WebElement errorProjectDescription;


    public void isErrorShown() {
        if (errorFirstName.isDisplayed() ||
                errorLastName.isDisplayed() ||
                errorEmailAddress.isDisplayed() ||
                errorPhoneNumber.isDisplayed() ||
                errorAddress.isDisplayed() ||
                errorCity.isDisplayed() ||
                errorState.isDisplayed() ||
                errorZipcode.isDisplayed() ||
                errorProjectDescription.isDisplayed()) {
            System.out.println("Input Form Submit [Input Form]: The forms contain errors.");
        }

    }


}
