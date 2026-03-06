package Tests;

import TestComponents.BaseTest;
import org.testng.annotations.Test;


public class BootstrapProgressBar extends BaseTest{

    //==================================================================================================================
    // Bootstrap Progress Bar - Positive Testing
    // Title: Verify Bootstrap Progress Bar When Clicking Download Button
    // Description: Click "Download".
    // Expected Result: Should be able to reach 100% percentage.
    @Test(priority = 1)
    public void testProgressDownload() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.ProgressBarAndSliders, "Menu List [All Examples]: The element 'Progress Bars & Sliders' was clicked");
        helper.clickElement(menuHandler.BootstrapProgressBar, "Menu List [Progress Bars & Sliders]: The element 'Bootstrap Progress bar' was clicked");
        helper.smoothScrollToElement(menuHandler.progressBarText);
        helper.clickElement(bootstrapProgressBarObj.downloadButton, "Bootstrap Progress Bar [Progress Bar]: The button 'Download' was clicked");
        helper.waitForTextInElement(bootstrapProgressBarObj.progressPercentage, "100%");
        helper.assertEqualsTo(helper.getElementStringValue(bootstrapProgressBarObj.progressPercentage), "100%");
    }
}
