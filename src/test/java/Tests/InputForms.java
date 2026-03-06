package Tests;

import TestComponents.BaseTest;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import java.io.IOException;

public class InputForms extends BaseTest {

    //==================================================================================================================
    // Simple Forms - Single Input Field - Positive Testing
    // Title: Verify Single Input Field Using Valid Input.
    // Description: Input "Hello" and click "Show Message".
    // Expected Result: "Hello" should be displayed.
    @Step
    @Test(priority = 1, description = "Valid scenario of 'Hello' and click 'Show Message'")
    public void testSimpleMessageVisibility() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.SimpleFormDemo, "Menu List [Input Forms]: The element 'Simple Form Demo' was clicked");
        helper.sendKeys(simpleFormObj.inputMessage, "Hello", "Simple Form [Single Input Field]: ");
        helper.clickElement(simpleFormObj.showMessageButton, "Simple Form [Single Input Field]: The button 'Show Message' was clicked");
        helper.assertEqualsTo(helper.getElementStringValue(simpleFormObj.actualMessage), "Hello");

    }

    // Simple Forms - Single Input Field - Negative Testing
    // Title: Verify Single Input Field
    // Description: Attempt to click the "Show Message" button without entering any message.
    // Expected Result: No input should be displayed.
    @Test(priority = 2)
    public void testSimpleEmptyButtonClick() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.SimpleFormDemo, "Menu List [Input Forms]: The element 'Simple Form Demo' was clicked");
        helper.sendKeys(simpleFormObj.inputMessage, "", "Simple Form [Single Input Field]: ");
        helper.clickElement(simpleFormObj.showMessageButton, "Simple Form [Single Input Field]: The button 'Show Message' was clicked");
        helper.assertElementInvisibility(simpleFormObj.actualMessage);
    }
    //==================================================================================================================
    // Simple Forms - Two Input Fields - Positive Testing
    // Title: Verify Two Input Fields Using Valid Inputs.
    // Description: Enter valid numeric values for both 'a' and 'b' then click the "Get Total" button.
    // Expected Result: Should be able to display sum of two numeric values.
    @Test(priority = 3)
    public void testSimpleValidSumCalculation() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.SimpleFormDemo, "Menu List [Input Forms]: The element 'Simple Form Demo' was clicked");
        helper.smoothScrollToElement(menuHandler.inputFormsText);
        helper.sendKeys(simpleFormObj.inputValue1, "20", "Simple Form [Two Input Fields]: ");
        helper.sendKeys(simpleFormObj.inputValue2, "30", "Simple Form [Two Input Fields]: ");
        helper.clickElement(simpleFormObj.getTotalButton, "Simple Form [Two Input Fields]: The button 'Get Total' was clicked");
        helper.assertEqualsTo(helper.getElementStringValue(simpleFormObj.actualValue), "50");
        
    }

    // Simple Forms - Two Input Fields - Negative Testing
    // Title: Verify Two Input Fields When Leaving Input Fields Empty.
    // Description: Leave one or both input fields empty.
    // Expected Result: "NaN" should be displayed.
    @Test(priority = 4)
    public void testSimpleEmptyInput() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.SimpleFormDemo, "Menu List [Input Forms]: The element 'Simple Form Demo' was clicked");
        helper.sendKeys(simpleFormObj.inputValue1, "", "Simple Form [Two Input Fields]: ");
        helper.sendKeys(simpleFormObj.inputValue2, "", "Simple Form [Two Input Fields]: ");
        helper.clickElement(simpleFormObj.getTotalButton, "Simple Form [Two Input Fields]: The button 'Get Total' was clicked");
        helper.assertEqualsTo(helper.getElementStringValue(simpleFormObj.actualValue), "NaN");

    }
    //==================================================================================================================
    // Checkbox - Single Checkbox Demo - Positive Testing
    // Title: Verify Checkbox Success Messages After Clicking On First Check Box.
    // Description: Click on first check box.
    // Expected Result: "Success - Check box is checked" should be displayed.
    @Test(priority = 5)
    public void testCheckboxSuccessMessageAfterCheckboxClick() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.CheckboxDemo, "Menu List [Input Forms]: The element 'Checkbox Demo' was clicked");
        helper.clickElement(checkboxObj.singleCheckbox, "Checkbox [Single Checkbox]: The checkbox 'Click on this check box' was clicked");
        helper.waitForTextInElement(checkboxObj.actualMessage, "Success - Check box is checked");
        helper.assertEqualsTo(helper.getElementAttributeValue(checkboxObj.actualMessage, "innerHTML"), "Success - Check box is checked");
        
    }

    // Checkbox - Single Checkbox Demo - Negative Testing
    // Title: Verify Checkbox Success Messages Without Any Interaction.
    // Description: Don't click on any checkbox.
    // Expected Result: No message should be displayed.
    @Test(priority = 6)
    public void testCheckboxNoSuccessMessageWithoutInteraction() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.CheckboxDemo, "Menu List [Input Forms]: The element 'Checkbox Demo' was clicked");
        helper.waitForTextInElement(checkboxObj.actualMessage, "");
        helper.assertElementInvisibility(checkboxObj.actualMessage);
        
    }
    //==================================================================================================================
    // Checkbox - Multiple Checkbox Demo - Positive Testing
    // Title: Verify Checkboxes After Unchecking One Checkbox
    // Description: Click the "Check All" button, then uncheck at least one checkbox.
    // Expected Result: "Check All" button should be displayed, and one checkbox should be unchecked.
    @Test(priority = 7)
    public void testCheckboxCheckAllButtonVisibilityAfterUncheckingOne() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.CheckboxDemo, "Menu List [Input Forms]: The element 'Checkbox Demo' was clicked");
        helper.smoothScrollToElement(menuHandler.checkboxText);
        helper.clickElement(checkboxObj.checkAllButton, "Checkbox [Multiple Checkbox]: The button 'Check All' was clicked");
        helper.clickElement(checkboxObj.Option4, "Checkbox [Multiple Checkbox]: The checkbox 'Option 4' was clicked");
        helper.waitForAttributeValueInElement(checkboxObj.checkButton, "value", "Check All");
        helper.assertEqualsTo(helper.getElementAttributeValue(checkboxObj.checkButton, "value"), "Check All");
        
    }

    // Checkbox - Multiple Checkbox Demo - Positive Testing
    // Title: Verify Checkboxes After Checking All Checkboxes.
    // Description: Click "Check All" button.
    // Expected Result: "Uncheck All" button should be displayed.
    @Test(priority = 8)
    public void testCheckboxCheckAllButtonFunctionality() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.CheckboxDemo, "Menu List [Input Forms]: The element 'Checkbox Demo' was clicked");
        helper.smoothScrollToElement(menuHandler.checkboxText);
        helper.clickElement(checkboxObj.checkAllButton, "Checkbox [Multiple Checkbox]: The button 'Check All' was clicked");
        helper.waitForAttributeValueInElement(checkboxObj.checkButton, "value", "Uncheck All");
        helper.assertEqualsTo(helper.getElementAttributeValue(checkboxObj.checkButton, "value"), "Uncheck All");
        
    }

    // Checkbox - Multiple Checkbox Demo - Positive Testing
    // Title: Verify Checkboxes After Unchecking All Checkboxes.
    // Description: Click "Check All" button, then click the "Uncheck All" button.
    // Expected Result: "Check All" button should be displayed.
    @Test(priority = 9)
    public void testCheckboxUncheckAllButtonFunctionality() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.CheckboxDemo, "Menu List [Input Forms]: The element 'Checkbox Demo' was clicked");
        helper.smoothScrollToElement(menuHandler.checkboxText);
        helper.clickElement(checkboxObj.checkAllButton, "Checkbox [Multiple Checkbox]: The button 'Check All' was clicked");
        helper.clickElement(checkboxObj.uncheckAllButton, "Checkbox [Multiple Checkbox]: The button 'Uncheck All' was clicked");
        helper.waitForAttributeValueInElement(checkboxObj.checkButton, "value", "Check All");
        helper.assertEqualsTo(helper.getElementAttributeValue(checkboxObj.checkButton, "value"), "Check All");
        
    }
    //==================================================================================================================
    // Radio Buttons - Radio Button - Positive Testing
    // Title: Verify Radio Button When Clicking "Female".
    // Description: Click on "Female" radio button and click "Get Checked value" button.
    // Expected Result: "Radio button 'Female' is checked" should be displayed.
    @Test(priority = 10)
    public void testRadioCheckedValueRetrievalForFemaleRadioButton() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.RadioButtonsDemo, "Menu List [Input Forms]: The element 'Radio Buttons Demo' was clicked");
        helper.clickElement(radioButtonObj.femaleRadioButton, "Radio Buttons [Radio Button]: The radio button 'Female' was clicked");
        helper.clickElement(radioButtonObj.getCheckedValueButton, "Radio Buttons [Radio Button]: The button 'Get Checked Value' was clicked");
        helper.waitForTextInElement(radioButtonObj.actualMessage, "Radio button 'Female' is checked");
        helper.assertEqualsTo(helper.getElementStringValue(radioButtonObj.actualMessage), "Radio button 'Female' is checked");
        
    }

    // Radio Buttons - Radio Button - Negative Testing
    // Title: Verify Radio Button When Not Clicking Anything.
    // Description: Attempt to click the "Get Checked Value" button without selecting either the 'Male' or 'Female' radio button.
    // Expected Result: "Radio button is Not checked" should be displayed.
    @Test(priority = 11)
    public void testRadioErrorMessageWhenNoRadioButtonSelected() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.RadioButtonsDemo, "Menu List [Input Forms]: The element 'Radio Buttons Demo' was clicked");
        helper.clickElement(radioButtonObj.getCheckedValueButton, "Radio Buttons [Radio Button]: The button 'Get Checked Value' was clicked");
        helper.waitForTextInElement(radioButtonObj.actualMessage, "Radio button is Not checked");
        helper.assertEqualsTo(helper.getElementStringValue(radioButtonObj.actualMessage), "Radio button is Not checked");
        
    }
    //==================================================================================================================
    // Radio Buttons - Group Radio Buttons - Positive Testing
    // Title: Verify Radio Buttons When Clicking "Female" and "15 to 50".
    // Description: Click "Female" radio button, and "15 to 50" radio button, and click "Get values" button.
    // Expected Result: "Sex : Female" and "Age group: 15 - 50" should be displayed.
    @Test(priority = 12)
    public void testRadioMessageVisibilityOnFemaleAnd15to50Selection() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.RadioButtonsDemo, "Menu List [Input Forms]: The element 'Radio Buttons Demo' was clicked");
        helper.smoothScrollToElement(menuHandler.radioText);
        helper.clickElement(radioButtonObj.groupFemaleRadioButton, "Radio Buttons [Radio Button]: The radio button 'Female' was clicked");
        helper.clickElement(radioButtonObj.ageGroup15to50, "Radio Buttons [Radio Button]: The radio button '15 to 50' was clicked");
        helper.clickElement(radioButtonObj.getValuesButton, "Radio Buttons [Radio Button]: The button 'Get values' was clicked");
        helper.waitForTextInElement(radioButtonObj.actualMessages, "Sex : Female\n" + "Age group: 15 - 50");
        helper.assertEqualsTo(helper.getElementStringValue(radioButtonObj.actualMessages), "Sex : Female\n" + "Age group: 15 - 50");
        
    }

    // Radio Buttons - Group Radio Buttons - Negative Testing
    // Title: Verify Radio Buttons When Not Clicking Anything.
    // Description: Attempt to click the "Get values" button without selecting any radio button.
    // Expected Result: "Sex : " and "Age group: " should be displayed.
    @Test(priority = 13)
    public void testRadioMessageVisibilityWithoutRadioButtonSelection() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.RadioButtonsDemo, "Menu List [Input Forms]: The element 'Radio Buttons Demo' was clicked");
        helper.smoothScrollToElement(menuHandler.radioText);
        helper.clickElement(radioButtonObj.getValuesButton, "Radio Buttons [Radio Button]: The button 'Get values' was clicked");
        helper.waitForTextInElement(radioButtonObj.actualMessages, "Sex :\n" + "Age group:");
        helper.assertEqualsTo(helper.getElementStringValue(radioButtonObj.actualMessages), "Sex :\n" + "Age group:");
        
    }

    //==================================================================================================================
    // Select Dropdown List - Select List - Positive Testing
    // Title: Verify Select Dropdown When Selecting "Thursday".
    // Description: Select "Thursday" from the dropdown and verify if the message "You selected: Thursday" appears.
    // Expected Result: "Day selected :- Thursday" should be visible.
    @Test(priority = 14)
    public void testDropdownMessageAfterSelectingThursday() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.SelectDropdownList, "Menu List [Input Forms]: The element 'Select Dropdown List' was clicked");
        helper.selectOptionByVisibleText(selectDropdownObj.dropdownList, "Thursday", "Select Dropdown List [Select List]: The option 'Thursday' was selected");
        helper.waitForTextInElement(selectDropdownObj.actualMessage, "Day selected :- Thursday");
        helper.assertEqualsTo(helper.getElementStringValue(selectDropdownObj.actualMessage), "Day selected :- Thursday");
        
    }

    // Select Dropdown List - Select List - Negative Testing
    // Title: Verify Select Dropdown When Not Selecting Anything.
    // Description: Don't select any option from the dropdown list and verify if a message appears.
    // Expected Result: No message should be displayed.
    @Test(priority = 15)
    public void testDropdownNoOptionSelected() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.SelectDropdownList, "Menu List [Input Forms]: The element 'Select Dropdown List' was clicked");
        helper.waitForTextInElement(selectDropdownObj.actualMessage, "");
        helper.assertElementInvisibility(selectDropdownObj.actualMessage);
        
    }

    //==================================================================================================================
    // Select Dropdown List - Multi Select List - Positive Testing
    // Title: Verify Select Dropdown List When Selecting "Pennsylvania".
    // Description: Validate message after selecting "Pennsylvania" option and clicking "First Selected" button.
    // Expected Result: "First selected option is : Pennsylvania"
    @Test(priority = 16)
    public void testDropdownFirstSelectedFunctionality() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.SelectDropdownList, "Menu List [Input Forms]: The element 'Select Dropdown List' was clicked");
        helper.smoothScrollToElement(menuHandler.dropdownText);
        helper.selectOptionByVisibleText(selectDropdownObj.multiselectList, "Pennsylvania", "Select Dropdown List [Multi Select List]: The option 'Pennsylvania' was selected");
        helper.clickElement(selectDropdownObj.firstSelectedButton, "Select Dropdown List [Multi Select List]: The button 'First Selected' was clicked");
        helper.waitForTextInElement(selectDropdownObj.actualMessages, "First selected option is : Pennsylvania");
        helper.assertEqualsTo(helper.getElementStringValue(selectDropdownObj.actualMessages), "First selected option is : Pennsylvania");
        
    }

    // Select Dropdown List - Multi Select List - Positive Testing
    // Title: Verify Select Dropdown List When Selecting "Texas".
    // Description: Validate message after selecting "Texas" option and clicking "Get All Selected" button.
    // Expected Result: "Options selected are : Texas" should be displayed.
    @Test(priority = 17)
    public void testDropdownGetAllSelectedFunctionality() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.SelectDropdownList, "Menu List [Input Forms]: The element 'Select Dropdown List' was clicked");
        helper.smoothScrollToElement(menuHandler.dropdownText);
        helper.selectOptionByVisibleText(selectDropdownObj.multiselectList, "Texas", "Select Dropdown List [Multi Select List]: The option 'Texas' was selected");
        helper.clickElement(selectDropdownObj.getAllSelectedButton, "Select Dropdown List [Multi Select List]: The button 'Get All Selected' was clicked");
        helper.waitForTextInElement(selectDropdownObj.actualMessages, "Options selected are : Texas");
        helper.assertEqualsTo(helper.getElementStringValue(selectDropdownObj.actualMessages), "Options selected are : Texas");
        
    }

    // Select Dropdown List - Multi Select List - Negative Testing
    // Title: Verify Select Dropdown List When Not Selecting Anything.
    // Description: Don't select any option from the dropdown list and verify if a message appears.
    // Expected Result: "First selected option is : undefined" should be displayed.
    @Test(priority = 18)
    public void testDropdownVerifyMessageWhenNoOptionSelected() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.SelectDropdownList, "Menu List [Input Forms]: The element 'Select Dropdown List' was clicked");
        helper.smoothScrollToElement(menuHandler.dropdownText);
        helper.clickElement(selectDropdownObj.firstSelectedButton, "Select Dropdown List [Multi Select List]: The button 'First Selected' was clicked");
        helper.waitForTextInElement(selectDropdownObj.actualMessages, "First selected option is : undefined");
        helper.assertEqualsTo(helper.getElementStringValue(selectDropdownObj.actualMessages), "First selected option is : undefined");
        
    }

    //==================================================================================================================
    // Input Form Submit - Positive Testing
    // Title: Verify Input Form Submit When Entering Valid Inputs.
    // Description: Click 'Send' button after entering valid inputs.
    // Expected Result: Should be able to click "Send".
    @Test(priority = 19)
    public void testInputVerifyValidInputs() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.InputFormSubmit, "Menu List [Input Forms]: The element 'Input Form Submit' was clicked");
        helper.sendKeys(inputFormObj.firstName, "Powder", "Input Form Submit [Input Form]: ");
        helper.sendKeys(inputFormObj.lastName, "Dela Cruz", "Input Form Submit [Input Form]: ");
        helper.sendKeys(inputFormObj.emailAddress, "powder@yopmail.com", "Input Form Submit [Input Form]: ");
        helper.sendKeys(inputFormObj.phoneNumber, "9123456789", "Input Form Submit [Input Form]: ");
        helper.sendKeys(inputFormObj.address, "616 Greenview Ave.,", "Input Form Submit [Input Form]: ");
        helper.sendKeys(inputFormObj.city, "Houston City", "Input Form Submit [Input Form]: ");
        helper.selectOptionByVisibleText(inputFormObj.state, "Texas", "Input Form Submit [Input Form]: The option 'Texas' was selected");
        helper.sendKeys(inputFormObj.zipcode, "77034", "Input Form Submit [Input Form]: ");
        helper.smoothScrollToElement(inputFormObj.sendButton);
        helper.sendKeys(inputFormObj.website, "www.google.com", "Input Form Submit [Input Form]: ");
        helper.clickElement(inputFormObj.yesRadio, "Input Form Submit [Input Form]: The radio button 'Yes' was clicked");
        helper.sendKeys(inputFormObj.projectDescription, "Google is a popular internet search engine.", "Input Form Submit [Input Form]: ");
        helper.clickElement(inputFormObj.sendButton, "Input Form Submit [Input Form]: The button 'Send' was clicked");
        helper.isButtonClickable(inputFormObj.sendButton, true);

    }

    // Input Form Submit - Positive Testing
    // Title: Verify Input Form Submit When Entering Valid Inputs.
    // Description: Click 'Send' button after entering valid inputs, using Data Driven.
    // Expected Result: Should be able to click "Send".
    @Test(priority = 20)
    public void testInputVerifyValidInputsDataDriven() throws InterruptedException, IOException {
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.InputFormSubmit, "Menu List [Input Forms]: The element 'Input Form Submit' was clicked");

        Object[][] testData = DataDriven.readTestData(
                "/Users/LianAlucema/Downloads/Sel/src/test/testData.xlsx",
                "data1");

        for (Object[] data : testData) {
            // Assigning values from test data to each fields
            String firstName = data[0].toString();
            String lastName = data[1].toString();
            String emailAddress = data[2].toString();
            String phoneNumber = data[3].toString().trim();
            String address = data[4].toString();
            String city = data[5].toString();
            String zipCode = data[6].toString().trim();
            String website = data[7].toString();
            String description = data[8].toString();

            helper.sendKeys(inputFormObj.firstName, firstName, "Input Form Submit [Input Form]: ");
            helper.sendKeys(inputFormObj.lastName, lastName, "Input Form Submit [Input Form]: ");
            helper.sendKeys(inputFormObj.emailAddress, emailAddress, "Input Form Submit [Input Form]: ");
            helper.sendKeys(inputFormObj.phoneNumber, phoneNumber, "Input Form Submit [Input Form]: ");
            helper.sendKeys(inputFormObj.address, address, "Input Form Submit [Input Form]: ");
            helper.sendKeys(inputFormObj.city, city, "Input Form Submit [Input Form]: ");
            helper.selectOptionByVisibleText(inputFormObj.state, "Texas", "Input Form Submit [Input Form]: The option 'Texas' was selected");
            helper.sendKeys(inputFormObj.zipcode, zipCode, "Input Form Submit [Input Form]: ");
            helper.smoothScrollToElement(inputFormObj.sendButton);
            helper.sendKeys(inputFormObj.website, website, "Input Form Submit [Input Form]: ");
            helper.clickElement(inputFormObj.yesRadio, "Input Form Submit [Input Form]: The radio button 'Yes' was clicked");
            helper.sendKeys(inputFormObj.projectDescription, description, "Input Form Submit [Input Form]: ");
            helper.clickElement(inputFormObj.sendButton, "Input Form Submit [Input Form]: The button 'Send' was clicked");
            helper.isButtonClickable(inputFormObj.sendButton, true);
        }
    }

    // Input Form Submit - Negative Testing
    // Title: Verify Input Form Submit When Not Entering Anything.
    // Description: Click 'Send' button without entering anything.
    // Expected Result: Errors should be displayed.
    @Test(priority = 21)
    public void testInputInvalidInputs() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.InputFormSubmit, "Menu List [Input Forms]: The element 'Input Form Submit' was clicked");
        helper.waitForElementToBeClickable(inputFormObj.sendButton);
        helper.clickElement(inputFormObj.sendButton, "Input Form Submit [Input Form]: The button 'Send' was clicked");
        inputFormObj.isErrorShown();
        helper.isButtonClickable(inputFormObj.sendButton, false);

    }

    //==================================================================================================================
    // Ajax Form Submit - Positive Testing
    // Title: Verify Ajax Form When Entering Valid Inputs.
    // Description: Click 'Submit' button with entering valid inputs.
    // Expected Result: "Form submited Successfully!" should be displayed.
    @Test(priority = 22)
    public void testAjaxVerifyValidInputsUsingSubmitButton() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.AjaxFormSubmit, "Menu List [Input Forms]: The element 'Ajax Form Submit' was clicked");
        helper.sendKeys(ajaxFormObj.fieldName, "Powder Dela Cruz", "Ajax Form Submit [Ajax Form]: ");
        helper.sendKeys(ajaxFormObj.fieldComment, "Meow meow meow", "Ajax Form Submit [Ajax Form]: ");
        helper.clickElement(ajaxFormObj.submitButton, "Ajax Form Submit [Ajax Form]: The button 'Submit' was clicked");
        helper.waitForTextInElement(ajaxFormObj.actualMessage, "Form submited Successfully!");
        helper.assertEqualsTo(helper.getElementAttributeValue(ajaxFormObj.actualMessage, "innerHTML"), "Form submited Successfully!");
        
    }

    // Ajax Form Submit - Negative Testing
    // Title: Verify Ajax Form Without Entering Any Inputs.
    // Description: Click 'Submit' button without entering anything.
    // Expected Result: "Name*" should be displayed.
    @Test(priority = 23)
    public void testAjaxVerifyInvalidInputsUsingSubmitButton() throws InterruptedException{
        helper.smoothScrollToElement(menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.AjaxFormSubmit, "Menu List [Input Forms]: The element 'Ajax Form Submit' was clicked");
        helper.clickElement(ajaxFormObj.submitButton, "Ajax Form Submit [Ajax Form]: The button 'Submit' was clicked");
        helper.waitForTextInElement(ajaxFormObj.errorNameField, "*");
        helper.assertEqualsTo(helper.getElementAttributeValue(ajaxFormObj.errorNameField, "innerHTML"), "*");
        
    }
    //==================================================================================================================
    // JQuery Select Dropdown - Single Select - Positive Testing
    // Title: Verify JQuery Select When Selecting A Valid Country.
    // Description: Select "Japan" in the dropdown.
    // Expected Result: Should be able to select "Japan".
    @Test(priority = 24)
    public void testJQuerySelectValidInput() throws InterruptedException{
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.JQuerySelectDropdown, "Menu List [Input Forms]: The element 'JQuery Select Dropdown' was clicked");
        helper.clickElement(jQueryDropdownObj.dropdownCountry, "JQuery Select Dropdown [Single Select]: The dropdown 'Select Country' was clicked");
        helper.sendKeys(jQueryDropdownObj.selectSingleField, "Japan", "JQuery Select Dropdown [Single Select]: ");
        helper.pressEnter(jQueryDropdownObj.selectSingleField, "JQuery Select Dropdown [Single Select]:");
        helper.assertEqualsTo(helper.getElementAttributeValue(jQueryDropdownObj.inputField, "title"), "Japan");

    }

    // JQuery Select Dropdown - Single Select - Negative Testing
    // Title: Verify JQuery Select When Searching For An Invalid Country.
    // Description: Search for "Philippines" in the search bar field.
    // Expected Result: "No results found" should be displayed.
    @Test(priority = 25)
    public void testJQuerySingleSelectInvalidInput() throws InterruptedException{
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.JQuerySelectDropdown, "Menu List [Input Forms]: The element 'JQuery Select Dropdown' was clicked");
        helper.clickElement(jQueryDropdownObj.dropdownCountry, "JQuery Select Dropdown [Single Select]: The dropdown 'Select Country' was clicked");
        helper.sendKeys(jQueryDropdownObj.selectSingleField, "Philippines", "JQuery Select Dropdown [Single Select]: ");
        helper.pressEnter(jQueryDropdownObj.selectSingleField, "JQuery Select Dropdown [Single Select]:");
        helper.assertEqualsTo(helper.getElementStringValue(jQueryDropdownObj.errorMessage), "No results found");

    }
    //==================================================================================================================
    // JQuery Select Dropdown - Multi Select - Select Multiple Values - Positive Testing
    // Title: Verify JQuery Select When Selecting Valid Countries.
    // Description: Select "Hawaii" and "Alabama".
    // Expected Result: Should be able to select "Hawaii" and "Alabama".
    @Test(priority = 26)
    public void testJquerySelectMultipleValidInputs() throws InterruptedException{
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.JQuerySelectDropdown, "Menu List [Input Forms]: The element 'JQuery Select Dropdown' was clicked");
        helper.clickElement(jQueryDropdownObj.dropdownState, "JQuery Select Dropdown [Multi Select]: The dropdown 'Select State' was clicked");
        helper.sendKeys(jQueryDropdownObj.dropdownState, "Hawaii", "JQuery Select Dropdown [Multi Select]: ");
        helper.pressEnter(jQueryDropdownObj.dropdownState, "JQuery Select Dropdown [Multi Select]:");
        helper.clickElement(jQueryDropdownObj.dropdownState, "JQuery Select Dropdown [Multi Select]: The dropdown 'Select State' was clicked");
        helper.sendKeys(jQueryDropdownObj.dropdownState, "Alabama", "JQuery Select Dropdown [Multi Select]: ");
        helper.pressEnter(jQueryDropdownObj.dropdownState, "JQuery Select Dropdown [Multi Select]:");
        helper.assertEqualsTo(helper.getElementAttributeValue(jQueryDropdownObj.multipleStates("Alabama"), "title"), "Alabama");
        helper.assertEqualsTo(helper.getElementAttributeValue(jQueryDropdownObj.multipleStates("Hawaii"), "title"), "Hawaii");
        
    }

    // JQuery Select Dropdown - Multi Select - Select Multiple Values - Negative Testing
    // Title: Verify JQuery Select When Searching Invalid Countries.
    // Description:  Select "Philippines".
    // Expected Result: "No results found" should be displayed.
    @Test(priority = 27)
    public void testJQuerySelectInvalidInputs() throws InterruptedException{
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.JQuerySelectDropdown, "Menu List [Input Forms]: The element 'JQuery Select Dropdown' was clicked");
        helper.clickElement(jQueryDropdownObj.dropdownState, "JQuery Select Dropdown [Multi Select]: The dropdown 'Select State' was clicked");
        helper.sendKeys(jQueryDropdownObj.dropdownState, "Philippines", "JQuery Select Dropdown [Multi Select]: ");
        helper.pressEnter(jQueryDropdownObj.dropdownState, "JQuery Select Dropdown [Multi Select]:");
        helper.assertEqualsTo(helper.getElementStringValue(jQueryDropdownObj.errorMessage), "No results found");

    }
    //==================================================================================================================
    // JQuery Select Dropdown - Multi Select - Drop Down with Disabled Values - Positive Testing
    // Title: Verify JQuery Select When Selecting A Valid Country.
    // Description: Select "Puerto Rico".
    // Expected Result: Should be able to select "Puerto Rico".
    @Test(priority = 28)
    public void testJQueryDisabledValuesSelectValidInput() throws InterruptedException{
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.JQuerySelectDropdown, "Menu List [Input Forms]: The element 'JQuery Select Dropdown' was clicked");
        helper.smoothScrollToElement( jQueryDropdownObj.title);
        helper.clickElement(jQueryDropdownObj.dropdownTerritories, "JQuery Select Dropdown [Multi Select]: The dropdown 'Select US Outlying Territories' was clicked");
        helper.sendKeys(jQueryDropdownObj.selectSingleField, "Puerto Rico", "JQuery Select Dropdown [Multi Select]: ");
        helper.pressEnter(jQueryDropdownObj.selectSingleField, "JQuery Select Dropdown [Multi Select]:");
        helper.assertEqualsTo(helper.getElementAttributeValue(jQueryDropdownObj.disabledDropdown("Puerto Rico"), "title"), "Puerto Rico");
        
    }

    // JQuery Select Dropdown - Multi Select - Drop Down with Disabled Values - Negative Testing
    // Title: Verify JQuery Select When Searching For An Invalid Country.
    // Description: Select "Philippines".
    // Expected Result: "No results found" should be displayed.
    @Test(priority = 29)
    public void testJQueryDisabledValuesSelectInvalidInput() throws InterruptedException{
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.JQuerySelectDropdown, "Menu List [Input Forms]: The element 'JQuery Select Dropdown' was clicked");
        helper.smoothScrollToElement( jQueryDropdownObj.title);
        helper.clickElement(jQueryDropdownObj.dropdownTerritories, "JQuery Select Dropdown [Multi Select]: The dropdown 'Select Country' was clicked");
        helper.sendKeys(jQueryDropdownObj.selectSingleField, "Philippines", "JQuery Select Dropdown [Multi Select]: ");
        helper.pressEnter(jQueryDropdownObj.selectSingleField, "JQuery Select Dropdown [Multi Select]:");
        helper.assertEqualsTo(helper.getElementStringValue(jQueryDropdownObj.errorMessage), "No results found");
        
    }
    //==================================================================================================================
    // JQuery Select Dropdown - Multi Select - Drop-down with Category related options - Positive Testing
    // Title: Verify JQuery Select When Selecting A Valid Option.
    // Description: Select "Ruby".
    // Expected Result: Should be able to select "Ruby".
    @Test(priority = 30)
    public void testJQueryCategorySelectValidInput() throws InterruptedException{
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.InputForms, "Menu List [All Examples]: The element 'Input Forms' was clicked");
        helper.clickElement(menuHandler.JQuerySelectDropdown, "Menu List [Input Forms]: The element 'JQuery Select Dropdown' was clicked");
        helper.smoothScrollToElement( jQueryDropdownObj.title);
        helper.clickElement(jQueryDropdownObj.dropdownScripting, "JQuery Select Dropdown [Multi Select]: The dropdown 'Select a file' was clicked");
        helper.selectOptionByVisibleText(jQueryDropdownObj.dropdownScripting, "Ruby", "JQuery Select Dropdown [Multi Select]: The option 'Ruby' was clicked");
        helper.clickElement(jQueryDropdownObj.selectText);
        helper.assertEqualsTo(helper.getElementAttributeValue(jQueryDropdownObj.categoryOption("Ruby"), "innerHTML"), "Ruby");
        
    }

}














