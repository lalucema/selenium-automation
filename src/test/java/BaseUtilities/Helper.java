package BaseUtilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Helper extends MenuHandler {

    private static final String DEFAULT_PASS_MESSAGE = "Assertion passed";
    private static final String DEFAULT_FAIL_MESSAGE = "Assertion failed";
    private static final String DEFAULT_EMPTY_MESSAGE = "Assertion failed";

    public WebDriver driver;
    private final WebDriverWait wait;


    public Helper(WebDriver driver, Duration timeout) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
        PageFactory.initElements(driver, this);
    }

    //Passed Message
    private static String getPassMessage() {
        return DEFAULT_PASS_MESSAGE + ": Verify values match";
    }

    //Failed Message
    private static String getFailMessage() {
        return DEFAULT_FAIL_MESSAGE + ": Verify values don't match";
    }

    //Empty Value Message
    private static String getEmptyMessage() {
        return DEFAULT_EMPTY_MESSAGE + ": Verify no object values found";
    }


    // This method clicks an element.
    public void clickElement(WebElement webElement, String message) throws InterruptedException {
        try {
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();
            System.out.println(message);
        } catch (NoSuchElementException e) {
            System.out.println("Element not found!");
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element found but could not be clicked!");
        }
    }

    // This method is an overloading of the 'clickElement' method, without 'message' in the parameter.
    public void clickElement(WebElement webElement) throws InterruptedException {
        try {
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found!");

        } catch (ElementClickInterceptedException e) {
            System.out.println("Element found but could not be clicked!");
        }
    }

    // This method sends keys.
    public void sendKeys(WebElement webElement, String inputValue, String message) {
        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.clear();
            webElement.sendKeys(inputValue);
            System.out.println(message + "The value '" + inputValue + "' was entered.");
        } catch (NoSuchElementException e) {
            System.out.println("Element not found!");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }

    }


    // This method smooth scrolls to an element.
    public void smoothScrollToElement(WebElement element) {
        try {
            // Get the location of the element
            int elementPosition = element.getLocation().getY();

            // Get current scroll position
            long currentPosition = (Long) ((JavascriptExecutor) driver).executeScript("return window.pageYOffset;");

            // Calculate the distance to scroll
            long distance = elementPosition - currentPosition;

            // Define the number of steps and time interval for smooth scrolling
            int steps = 50;
            int interval = 5;
            double stepDistance = (double) distance / steps;
            Thread.sleep(1000);

            // Execute JavaScript to perform smooth scrolling
            for (int i = 0; i < steps; i++) {
                currentPosition += (long) stepDistance;
                ((JavascriptExecutor) driver).executeScript("window.scroll(0, " + currentPosition + ");");
                Thread.sleep(interval);
            }
            // Wait until the element is in view
            wait.until(ExpectedConditions.visibilityOf(element));

        } catch (Exception e) {
            System.out.println("Exception occurred while scrolling: " + e.getMessage());
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    // This method gets an element's string value.
    public String getElementStringValue(WebElement webElement) throws InterruptedException {
        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOf(webElement));
            return webElement.getText();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found!");
            return null;
        }
    }

    // This method gets an element's attribute value.
    public Object getElementAttributeValue(WebElement webElement, String attributeName) throws InterruptedException {
        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOf(webElement));
            return webElement.getAttribute(attributeName).trim();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found!");
            return null;
        }
    }

    //------------------------------------------------------------------------------------------------------------------

    // This method checks if a button is clickable.
    public void isButtonClickable(WebElement element, Boolean assertion) throws InterruptedException {
        try {
            Thread.sleep(1000);
            if (assertion) {
                Assert.assertTrue(element.isEnabled(), "Button is not clickable");
            } else {
                Assert.assertFalse(element.isEnabled(), "Button is clickable");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found: " + e.getMessage());
        }
    }

    // This method presses enter key.
    public void pressEnter(WebElement element, String message) {
        try {
            Thread.sleep(1000);
            element.sendKeys(Keys.ENTER);
            System.out.println(message + "The key 'Enter' was pressed.");
        } catch (Exception e) {
            System.out.println("Failed to press Enter: " + e.getMessage());
        }
    }

    // This method counts elements.
    public void countElements(By locator, int expectedCount, String message) {
        List<WebElement> elements = driver.findElements(locator);
        wait.until(ExpectedConditions.numberOfElementsToBe(locator, expectedCount));
        int actualCount = elements.size();
        System.out.println(message + "Expected: " + expectedCount + ", Actual: " + actualCount);
        assertElementCount(locator, expectedCount, actualCount);
    }

    //------------------------------------------------------------------------------------------------------------------
    // This method asserts an element's count.
    private void assertElementCount(By locator, int expectedCount, int actualCount) {
        try {
            String errorMessage = "Unexpected number of elements with locator: " + locator + ". Expected: " + expectedCount + ", Actual: " + actualCount;
            Assert.assertEquals(expectedCount, actualCount, errorMessage);
            System.out.println(getPassMessage());
        } catch (AssertionError e) {
            System.out.println(getFailMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }

    //This method compares two objects for equality, adding a delay before assertion and handling exceptions for empty strings or interruptions.
    public void assertEqualsTo(Object actual, Object expected) {
        try {
            Thread.sleep(1000);
            Assert.assertEquals(actual, expected);
            System.out.println(getPassMessage());
        } catch (AssertionError e) {

            if (actual.equals("")) {
                System.out.println(getEmptyMessage());
//           } else if (actual.equals("") && Double.isNaN(Double.parseDouble((String) actual))) {
//                System.out.println(getEmptyMessage());
            } else {
                System.out.println(getFailMessage());
            }
            throw e;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // This method asserts an element's visibility.
    public void assertElementVisibility(WebElement element) {
        try {
            // Wait until the element becomes visible
            wait.until(ExpectedConditions.visibilityOf(element));
            Assert.assertTrue(element.isDisplayed());
        } catch (AssertionError e) {
            // Log the assertion error message
            System.out.println("Assertion Error: " + e.getMessage());
            throw e; // Re-throw the assertion error to propagate it further
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    // This method asserts an element's invisibility.
    public void assertElementInvisibility(WebElement element) {
        try {
            Thread.sleep(2000);
            // Wait until the element becomes invisible
            wait.until(ExpectedConditions.invisibilityOf(element));
            // Assert that the element is invisible
            Assert.assertFalse(element.isDisplayed(), "Element is still visible");
        } catch (AssertionError e) {
            System.out.println("Assertion Error: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    //------------------------------------------------------------------------------------------------------------------

    // This method selects an option within a dropdown menu, based on its visible text.
    public void selectOptionByVisibleText(WebElement webElement, String optionText, String message) throws InterruptedException {
        try {
            Thread.sleep(1000);
            Select dropDownSelect = new Select(webElement);
            dropDownSelect.selectByVisibleText(optionText);
            System.out.println(message);
        } catch (NoSuchElementException e) {
            System.out.println("Element not found!");

        }
    }

    //------------------------------------------------------------------------------------------------------------------
    // This method opens pop-ups and asserts them each, using an ArrayList of expected titles.
    public void openAndVerifyPopUp(Duration timeout, ArrayList<String> expectedTitle, int expectedCount, String message) throws InterruptedException {
        int counter = 1;
        try {
            // Get main window
            String mainWindow = driver.getWindowHandle();
            // Get list of windows including main window
            Set<String> popupWindowHandle = switchToWindow(expectedCount, timeout);
            for (String handle : popupWindowHandle) {
                // As long as counter is not equal to expectedCount, it will always enter this condition.
                if (counter != expectedCount) {
                    // If the handle is not equal to the mainWindow, it will always enter this loop.
                    if (!handle.equals(mainWindow)) {
                        Thread.sleep(2000);
                        // Switch window, and assigns handle string to WebDriver popupWindow to get title.
                        WebDriver popupWindow = driver.switchTo().window(handle);
                        for (String title : expectedTitle) {
                                wait.until(ExpectedConditions.titleIs(title));
                                Assert.assertEquals(popupWindow.getTitle(), title);
                                System.out.println(message + getPassMessage());
                                Thread.sleep(2000);
                                counter++;
                                expectedTitle.remove(title);
                                driver.close();
                                break;
                            }
                    }
                }
            }
        } catch (AssertionError e) {
            System.out.println(message + getFailMessage());
        }

    }

    // This method switches the windows.
    private Set<String> switchToWindow(int expectedCount, Duration timeout) {
        waitUntilNumberOfWindows(driver, expectedCount, timeout);
        return driver.getWindowHandles();

    }

    //------------------------------------------------------------------------------------------------------------------
    // This method waits for a text in the element [innerHTML].
    public void waitForTextInElement(WebElement element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    // This method waits for an element to be visible.
    public void waitForElementVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // This method waits for a given attribute's value.
    public void waitForAttributeValueInElement(WebElement element, String attributeName, String text) {
        wait.until(ExpectedConditions.attributeContains(element, attributeName, text));
    }

    // This method waits for an element to be clickable.
    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // This method waits until the number of windows in the WebDriver matches the specified count.
    public void waitUntilNumberOfWindows(WebDriver driver, int expectedCount, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.numberOfWindowsToBe(expectedCount));
    }
}





