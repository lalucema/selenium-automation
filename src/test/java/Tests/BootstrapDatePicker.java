package Tests;

import TestComponents.BaseTest;
import org.testng.annotations.Test;

public class BootstrapDatePicker extends BaseTest {
    //==================================================================================================================
    // Bootstrap Date Pickers - Positive Testing
    // Title: Verify Bootstrap Date Picker using Valid Input
    // Description: Select "June 20, 2023".
    // Expected Result: Should be able to select "June 20, 2023".
    @Test(priority = 1)
    public void testDateValidDate() throws InterruptedException {
        helper.smoothScrollToElement( menuHandler.DatePicker);
        helper.clickElement(menuHandler.DatePicker, "Menu List [All Examples]: The element 'Date pickers' was clicked");
        helper.clickElement(menuHandler.BootstrapDatePicker, "Menu List [Input Forms]: The element 'Calendar Picker' was clicked");
        helper.clickElement(bootstrapDatePickerObj.calendarInputField, "Bootstrap Date Pickers [Date]: The element 'Calendar Picker' was clicked");
        bootstrapDatePickerObj.calendarSelector(bootstrapDatePickerObj.calendarTitle, bootstrapDatePickerObj.buttonPrev, "20", "June", "2023");
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapDatePickerObj.calendarInputField, "value"), "20/06/2023");
        
    }

    // Bootstrap Date Pickers - Positive Testing
    // Title: Verify Bootstrap Date Picker using "Today" Button.
    // Description: Click "Today".
    // Expected Result: Should be able to display current date.
    @Test(priority = 2)
    public void testDateTodayButton() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.DatePicker);
        helper.clickElement(menuHandler.DatePicker, "Menu List [All Examples]: The element 'Date pickers' was clicked");
        helper.clickElement(menuHandler.BootstrapDatePicker, "Menu List [Input Forms]: The element 'Calendar Picker' was clicked");
        helper.clickElement(bootstrapDatePickerObj.calendarInputField, "Bootstrap Date Pickers [Date]: The element 'Calendar Picker' was clicked");
        helper.clickElement(bootstrapDatePickerObj.buttonToday, "Bootstrap Date Pickers [Date]: The button 'Today' was clicked");
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapDatePickerObj.calendarInputField, "value"), bootstrapDatePickerObj.dateToday());
        
    }

    // Bootstrap Date Pickers - Positive Testing
    // Title: Verify Bootstrap Date Picker using "Clear" Button.
    // Description: Click "Today" and then click "Clear".
    // Expected Result: Should be able to clear.
    @Test(priority = 3)
    public void testClearButton() throws InterruptedException {
        helper.smoothScrollToElement( menuHandler.DatePicker);
        helper.clickElement(menuHandler.DatePicker, "Menu List [All Examples]: The element 'Date pickers' was clicked");
        helper.clickElement(menuHandler.BootstrapDatePicker, "Menu List [Input Forms]: The element 'Calendar Picker' was clicked");
        helper.clickElement(bootstrapDatePickerObj.calendarInputField, "Bootstrap Date Pickers [Date]: The element 'Calendar Picker' was clicked");
        helper.clickElement(bootstrapDatePickerObj.buttonToday, "Bootstrap Date Pickers [Date]: The button 'Today' was clicked");
        helper.clickElement(bootstrapDatePickerObj.calendarInputField, "Bootstrap Date Pickers [Date]: The element 'Calendar Picker' was clicked");
        helper.clickElement(bootstrapDatePickerObj.buttonClear, "Bootstrap Date Pickers [Date]: The button 'Clear' was clicked");
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapDatePickerObj.calendarInputField, "value"), "");
        
    }

    // Bootstrap Date Pickers - Negative Testing
    // Title: Verify Bootstrap Date Picker using a Sunday.
    // Description: Select "April 07, 2024", a Sunday.
    // Expected Result: Should not be able to display "April 07, 2024", will display current date instead.
    @Test(priority = 4)
    public void testDateDisabledDate() throws InterruptedException {
        helper.smoothScrollToElement( menuHandler.DatePicker);
        helper.clickElement(menuHandler.DatePicker, "Menu List [All Examples]: The element 'Date pickers' was clicked");
        helper.clickElement(menuHandler.BootstrapDatePicker, "Menu List [Input Forms]: The element 'Calendar Picker' was clicked");
        helper.sendKeys(bootstrapDatePickerObj.calendarInputField, "07/05/2024", "Bootstrap Date Pickers [Date]: " );
        helper.pressEnter(bootstrapDatePickerObj.calendarInputField, "Bootstrap Date Pickers [Date]: " );
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapDatePickerObj.calendarInputField, "value"), bootstrapDatePickerObj.dateToday());
        
    }

    //==================================================================================================================
    // Bootstrap Date Range - Positive Testing
    // Title: Verify Bootstrap Date Range using Valid Inputs.
    // Description: Select "April 2, 2024", to "April 10, 2024".
    // Expected Result: Should be able to select "April 2, 2024", to "April 10, 2024".
    @Test(priority = 5)
    public void testDateRangeValidInputs() throws InterruptedException {
        helper.smoothScrollToElement( menuHandler.DatePicker);
        helper.clickElement(menuHandler.DatePicker, "Menu List [All Examples]: The element 'Date pickers' was clicked");
        helper.clickElement(menuHandler.BootstrapDatePicker, "Menu List [Input Forms]: The element 'Calendar Picker' was clicked");
        helper.smoothScrollToElement( bootstrapDatePickerObj.selectDateTitle);
        helper.clickElement(bootstrapDatePickerObj.startDate, "Bootstrap Date Pickers [Date]: The field 'Start date' was clicked");
        bootstrapDatePickerObj.calendarSelector(bootstrapDatePickerObj.calendarTitle, bootstrapDatePickerObj.buttonPrev, "2", "April", "2024");
        helper.clickElement(bootstrapDatePickerObj.endDate, "Bootstrap Date Pickers [Date]: The field 'End date' was clicked");
        bootstrapDatePickerObj.calendarSelector(bootstrapDatePickerObj.calendarTitle, bootstrapDatePickerObj.buttonPrev, "10", "April", "2024");
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapDatePickerObj.startDate, "value"),"02/04/2024");
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapDatePickerObj.endDate, "value"),"10/04/2024");
        
    }
}
