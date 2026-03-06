package Tests;


import TestComponents.BaseTest;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;



public class AlertsAndModals extends BaseTest {

    //==================================================================================================================================================
    // Alerts & Modals - Bootstrap Alerts - Positive Testing
    // Title: Verify Success Messages Is Visible When Clicking Bootstrap Alert Buttons
    // Description: Click on Bootstrap Alert Buttons for Success Messages.
    // Expected Result: Success Messages should be visible after clicking buttons.
    @Test(priority = 1)
    public void testSuccessMessages() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapAlerts, "Menu List [Alerts & Modals]: The element 'Bootstrap Modals' was clicked");
        helper.clickElement(bootstrapAlertsObj.autocloseableSuccessButton, "Alerts & Modals [Bootstrap Alerts]: The element 'autocloseable success message' was clicked");
        helper.waitForElementVisibility(bootstrapAlertsObj.autocloseableSuccessMessage);
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapAlertsObj.autocloseableSuccessMessage, "innerHTML"), "I'm an autocloseable success  message. I will hide in 5 seconds.");
        helper.clickElement(bootstrapAlertsObj.successButton, "Alerts & Modals [Bootstrap Alerts]: The element 'Normal success message' was clicked");
        helper.waitForElementVisibility(bootstrapAlertsObj.successMessage);
        helper.assertEqualsTo(helper.getElementStringValue(bootstrapAlertsObj.successMessage), "×\n" + "I'm a normal success message. To close use the appropriate button.");
        helper.clickElement(bootstrapAlertsObj.successExitButton, "Alerts & Modals [Bootstrap Alerts]: The button '×' was clicked");
        

    }

    // Alerts & Modals - Bootstrap Alerts - Positive Testing
    // Title: Verify Warning Messages Is Visible When Clicking Bootstrap Alert Buttons
    // Description: Click on Bootstrap Alert Buttons for Warning Messages.
    // Expected Result: Warning Messages should be visible after clicking buttons.
    @Test(priority = 2)
    public void testWarningMessages() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapAlerts, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapAlertsObj.autocloseableWarningButton, "Alerts & Modals [Bootstrap Alerts]: The element 'autocloseable warning message' was clicked");
        helper.waitForElementVisibility(bootstrapAlertsObj.autocloseableWarningMessage);
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapAlertsObj.autocloseableWarningMessage, "innerHTML"), "I'm an autocloseable warning message. I will hide in 3 seconds.");
        helper.clickElement(bootstrapAlertsObj.warningButton, "Alerts & Modals [Bootstrap Alerts]: The element 'Normal warning message' was clicked");
        helper.waitForElementVisibility(bootstrapAlertsObj.warningMessage);
        helper.assertEqualsTo(helper.getElementStringValue(bootstrapAlertsObj.warningMessage), "×\n" + "I'm a normal warning message. To close use the appropriate button.");
        helper.clickElement(bootstrapAlertsObj.warningExitButton, "Alerts & Modals [Bootstrap Alerts]: The button '×' was clicked");
        

    }

    // Alerts & Modals - Bootstrap Alerts - Positive
    // Title: Verify Danger Messages Is Visible When Clicking Bootstrap Alert Buttons
    // Description: Click on Bootstrap Alert Buttons for Danger Messages.
    // Expected Result: Danger Messages should be visible after clicking buttons.
    @Test(priority = 3)
    public void testDangerMessages() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapAlerts, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapAlertsObj.autocloseableDangerButton, "Alerts & Modals [Bootstrap Alerts]: The element 'autocloseable danger message' was clicked");
        helper.waitForElementVisibility(bootstrapAlertsObj.autocloseableDangerMessage);
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapAlertsObj.autocloseableDangerMessage, "innerHTML"), "I'm an autocloseable danger message. I will hide in 5 seconds.");
        helper.clickElement(bootstrapAlertsObj.dangerButton, "Alerts & Modals [Bootstrap Alerts]: The element 'Normal danger message' was clicked");
        helper.waitForElementVisibility(bootstrapAlertsObj.dangerMessage);
        helper.assertEqualsTo(helper.getElementStringValue(bootstrapAlertsObj.dangerMessage), "×\n" + "I'm a normal danger message. To close use the appropriate button.");
        helper.clickElement(bootstrapAlertsObj.dangerExitButton, "Alerts & Modals [Bootstrap Alerts]: The button '×' was clicked");
        

    }

    // Alerts & Modals - Bootstrap Alerts - Positive Testing
    // Title: Verify Info Messages Is Visible When Clicking Bootstrap Alert Buttons
    // Description: Click on Bootstrap Alert Buttons for Info Messages.
    // Expected Result: Info Messages should be visible after clicking buttons.
    @Test(priority = 4)
    public void testInfoMessages() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapAlerts, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapAlertsObj.autocloseableInfoButton, "Alerts & Modals [Bootstrap Alerts]: The element 'Autocloseable info message' was clicked");
        helper.waitForElementVisibility(bootstrapAlertsObj.autocloseableInfoMessage);
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapAlertsObj.autocloseableInfoMessage, "innerHTML"), "I'm an autocloseable info message. I will hide in 6 seconds.");
        helper.clickElement(bootstrapAlertsObj.infoButton, "Alerts & Modals [Bootstrap Alerts]: The element 'Normal info message' was clicked");
        helper.waitForElementVisibility(bootstrapAlertsObj.infoButton);
        helper.assertEqualsTo(helper.getElementStringValue(bootstrapAlertsObj.infoMessage), "×\n" + "I'm a normal info message. To close use the appropriate button.");
        helper.clickElement(bootstrapAlertsObj.infoExitButton, "Alerts & Modals [Bootstrap Alerts]: The button '×' was clicked");
        

    }

    //==================================================================================================================================================
    // Alerts & Modals - Bootstrap Modals - Positive Testing
    // Title: Verify Single Modal When Clicking Save Changes.
    // Description: Click "Launch Modal" button and click "Save changes".
    // Expected Result: Modal should be displayed and website should be refreshed after clicking "Save changes".
    @Test(priority = 5)
    public void testSingleModalWhenClickingSaveChanges() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapModals, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapModalsObj.singleLaunchButton, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.waitForElementVisibility(bootstrapModalsObj.singleModalMessage);
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapModalsObj.singleModalMessage, "innerHTML"), "This is the place where the content for the modal dialog displays");
        helper.clickElement(bootstrapModalsObj.saveChangesButton, "Alerts & Modals [Bootstrap Modals]: The button 'Save changes' was clicked");
        
    }

    // Alerts & Modals - Bootstrap Modals - Positive Testing
    // Title: Verify Single Modal When Clicking Close.
    // Description: Click "Launch Modal" button and click "Close".
    // Expected Result: Modal should be displayed and modal should be closed after clicking "Close".
    @Test(priority = 6)
    public void testSingleModalWhenClickingClose() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapModals, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapModalsObj.singleLaunchButton, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.waitForElementVisibility(bootstrapModalsObj.singleModalMessage);
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapModalsObj.singleModalMessage, "innerHTML"), "This is the place where the content for the modal dialog displays");
        helper.clickElement(bootstrapModalsObj.closeButton, "Alerts & Modals [Bootstrap Modals]: The button 'Close' was clicked");
        
    }

    // Alerts & Modals - Bootstrap Modals - Positive Testing
    // Title: Verify Single Modal When Clicking Exit Button.
    // Description: Click "Launch Modal" button and click "×".
    // Expected Result: Modal should be displayed and modal should be closed after clicking "×".
    @Test(priority = 7)
    public void testSingleModalWhenClickingExit() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapModals, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapModalsObj.singleLaunchButton, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.waitForElementVisibility(bootstrapModalsObj.singleModalMessage);
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapModalsObj.singleModalMessage, "innerHTML"), "This is the place where the content for the modal dialog displays");
        helper.clickElement(bootstrapModalsObj.exitButton, "Alerts & Modals [Bootstrap Modals]: The button '×' was clicked");
        
    }

    // Alerts & Modals - Bootstrap Modals - Positive Testing
    // Title: Verify Multiple Modal When Clicking Save Changes Button.
    // Description: Click "Launch Modal" button and click "Save changes".
    // Expected Result: Modal should be displayed and website should be refreshed after clicking "Save changes".
    @Test(priority = 8)
    public void testMultipleModalWhenClickingSaveChanges() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapModals, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapModalsObj.firstMultipleLaunchButton, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.assertElementVisibility(bootstrapModalsObj.firstMultipleModalMessage);
        helper.clickElement(bootstrapModalsObj.firstSaveChangesButton, "Alerts & Modals [Bootstrap Modals]: The button 'Save changes' was clicked");
        
    }

    // Alerts & Modals - Bootstrap Modals - Positive Testing
    // Title: Verify Multiple Modal When Clicking Close.
    // Description: Click "Launch Modal" button and click "Close".
    // Expected Result: Modal should be displayed and modal should be closed after clicking "Close".
    @Test(priority = 9)
    public void testMultipleModalWhenClickingClose() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapModals, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapModalsObj.firstMultipleLaunchButton, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.assertElementVisibility(bootstrapModalsObj.firstMultipleModalMessage);
        helper.clickElement(bootstrapModalsObj.firstCloseButton, "Alerts & Modals [Bootstrap Modals]: The button 'Close' was clicked");
        
    }

    // Alerts & Modals - Bootstrap Modals - Positive Testing
    // Title: Verify Multiple Modal When Clicking Exit Button.
    // Description: Click "Launch Modal" button and click "×".
    // Expected Result: Modal should be displayed and modal should be closed after clicking "×".
    @Test(priority = 10)
    public void testMultipleModalWhenClickingExit() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapModals, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapModalsObj.firstMultipleLaunchButton, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.assertElementVisibility(bootstrapModalsObj.firstMultipleModalMessage);
        helper.clickElement(bootstrapModalsObj.firstExitButton, "Alerts & Modals [Bootstrap Modals]: The button '×' was clicked");
        
    }

    // Alerts & Modals - Bootstrap Modals - Positive Testing
    // Title: Verify Multiple Modals When Clicking Save Changes Button.
    // Description: Click "Launch Modal" button, and click "Launch Modal" again, and click "Save changes".
    // Expected Result: Modals should be displayed and website should be refreshed after clicking "Save changes".
    @Test(priority = 11)
    public void testSecondMultipleModalWhenClickingSaveChanges() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapModals, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapModalsObj.firstMultipleLaunchButton, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.clickElement(bootstrapModalsObj.secondMultipleLaunchModal, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.assertElementVisibility(bootstrapModalsObj.secondMultipleModalMessage);
        helper.clickElement(bootstrapModalsObj.secondMultipleSaveChangesButton, "Alerts & Modals [Bootstrap Modals]: The button 'Save changes' was clicked");
        
    }

    // Alerts & Modals - Bootstrap Modals - Positive Testing
    // Title: Verify Multiple Modals When Clicking Close Button.
    // Description: Click "Launch Modal" button, and click "Launch Modal" again, and click "Close".
    // Expected Result: Modals should be displayed and modals should be closed after clicking "Close".
    @Test(priority = 12)
    public void testSecondMultipleSecondModalClickingClose() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapModals, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapModalsObj.firstMultipleLaunchButton, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.clickElement(bootstrapModalsObj.secondMultipleLaunchModal, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.assertElementVisibility(bootstrapModalsObj.secondMultipleModalMessage);
        helper.clickElement(bootstrapModalsObj.secondMultipleCloseButton, "Alerts & Modals [Bootstrap Modals]: The button 'Close' was clicked");
        
    }

    // Alerts & Modals - Bootstrap Modals - Positive Testing
    // Title: Verify Multiple Modals When Clicking Exit Button.
    // Description: Click "Launch Modal" button, and click "Launch Modal" again, and click "×".
    // Expected Result: Modals should be displayed and modals should be closed after clicking "×".
    @Test(priority = 13)
    public void testSecondMultipleModalWhenClickingExit() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.BootstrapModals, "Menu List [Alerts & Modals]: The element 'Bootstrap Alerts' was clicked");
        helper.clickElement(bootstrapModalsObj.firstMultipleLaunchButton, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.clickElement(bootstrapModalsObj.secondMultipleLaunchModal, "Alerts & Modals [Bootstrap Modals]: The button 'Launch modal' was clicked");
        helper.assertElementVisibility(bootstrapModalsObj.secondMultipleModalMessage);
        helper.clickElement(bootstrapModalsObj.secondMultipleExitButton, "Alerts & Modals [Bootstrap Modals]: The button '×' was clicked");
        
    }

    //==================================================================================================================================================
    // Alerts & Modals - Window Popup Modals - Positive Testing
    // Title: Verify Window Pop Up Twitter Is Visible
    // Description: Click "Follow On Twitter" button.
    // Expected Result: "Twitter" modal should appear.
    @Test(priority = 14)
    public void testWindowPopupTwitter() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.WindowPopup, "Menu List [Alerts & Modals]: The element 'Window Popup Modal' was clicked");
        helper.clickElement(windowPopupObj.followOnTwitterButton, "Alerts & Modals [Window Popup]: The button 'Follow On Twitter' was clicked");
        ArrayList<String> expectedTitleList = new ArrayList<String>();
        expectedTitleList.add("Selenium Easy (@seleniumeasy) / X");
        helper.openAndVerifyPopUp(Duration.ofSeconds(20), expectedTitleList, 2, "Alerts & Modals [Window Popup]: ");
        
    }

    // Alerts & Modals - Window Popup Modals - Positive Testing
    // Title: Verify Window Pop Up Facebook Is Visible
    // Description: Click "Like us On Facebook" button.
    // Expected Result: "Facebook" modal should appear.
    @Test(priority = 15)
    public void testWindowPopupFacebook() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.WindowPopup, "Menu List [Alerts & Modals]: The element 'Window Popup Modal' was clicked");
        helper.clickElement(windowPopupObj.likeUsOnFacebookButton, "Alerts & Modals [Window Popup]: The button 'Like us On Facebook' was clicked");
        ArrayList<String> expectedTitleList = new ArrayList<String>();
        expectedTitleList.add("Selenium Easy | Hyderabad | Facebook");
        helper.openAndVerifyPopUp(Duration.ofSeconds(20), expectedTitleList, 2, "Alerts & Modals [Window Popup]: ");
        
    }

    // Alerts & Modals - Window Popup Modals - Positive Testing
    // Title: Verify Window Pop Up Twitter And Facebook Is Visible
    // Description: Click "Follow Twitter & Facebook" button.
    // Expected Result: "Twitter" & "Facebook" modals should appear.
    @Test(priority = 16)
    public void testWindowPopupTwitterAndFacebook() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.WindowPopup, "Menu List [Alerts & Modals]: The element 'Window Popup Modal' was clicked");
        helper.clickElement(windowPopupObj.followTwitterAndFacebookButton, "Alerts & Modals [Window Popup]: The button 'Follow Twitter & Facebook' was clicked");
        ArrayList<String> expectedTitleList = new ArrayList<String>();
        expectedTitleList.add("Selenium Easy | Hyderabad | Facebook");
        expectedTitleList.add("Selenium Easy (@seleniumeasy) / X");
        helper.openAndVerifyPopUp(Duration.ofSeconds(20), expectedTitleList, 3, "Alerts & Modals [Window Popup]: ");
        
    }

    // Alerts & Modals - Window Popup Modals - Positive Testing
    // Title: Verify Window Pop Up Twitter, Google, And Facebook Is Visible
    // Description: Click "Follow All" button.
    // Expected Result: "Twitter", "Google", and "Facebook" modals should appear.
    @Test(priority = 17)
    public void testWindowPopupTwitterGoogleFacebook() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.AlertsAndModals, "Menu List [All Examples]: The element 'Alerts & Modals' was clicked");
        helper.clickElement(menuHandler.WindowPopup, "Menu List [Alerts & Modals]: The element 'Window Popup Modal' was clicked");
        helper.clickElement(windowPopupObj.followAllButton, "Alerts & Modals [Window Popup]: The button 'Follow All' was clicked");
        ArrayList<String> expectedTitleList = new ArrayList<String>();
        expectedTitleList.add("Selenium Easy (@seleniumeasy) / X");
        expectedTitleList.add("Google Workspace Updates: New community features for Google Chat and an update on Currents");
        expectedTitleList.add("Selenium Easy | Hyderabad | Facebook");
        helper.openAndVerifyPopUp(Duration.ofSeconds(20), expectedTitleList, 4, "Alerts & Modals [Window Popup]: ");
        
    }
}
