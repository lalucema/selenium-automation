package Tests;

import TestComponents.BaseTest;
import org.testng.annotations.Test;


public class ListBox extends BaseTest {

    //==================================================================================================================
    // List Box - Dual List Box - Positive Testing
    // Title: Verify Dual List Box When Moving Items To The Right List
    // Description: Select "bootstrap-duallist" and move to the right list.
    // Expected Result: Should be able to move "bootstrap-duallist" to the right list.
    @Test(priority = 1)
    public void testDualListBoxToRight() throws InterruptedException {
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.ListBox, "Menu List [All Examples]: The element 'List Box' was clicked");
        helper.clickElement(menuHandler.BootstrapListBox, "Menu List [Alerts & Modals]: The element 'Bootstrap List Box' was clicked");
        helper.clickElement(bootstrapListBoxObj.leftSearchField, "List Box [Bootstrap List Box]: The field 'search' was clicked");
        helper.sendKeys(bootstrapListBoxObj.leftSearchField, "bootstrap-duallist", "List Box [Bootstrap List Box]: ");
        helper.clickElement(bootstrapListBoxObj.leftListItem, "List Box [Bootstrap List Box]: The element 'bootstrap-duallist' was clicked");
        helper.clickElement(bootstrapListBoxObj.moveRight, "List Box [Bootstrap List Box]: The element '>' was clicked");
        helper.sendKeys(bootstrapListBoxObj.rightSearchField, "bootstrap-duallist", "List Box [Bootstrap List Box]: ");
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapListBoxObj.rightActiveListItem, "innerHTML"), "bootstrap-duallist");
        
    }



    // List Box - Dual List Box - Positive Testing
    // Title: Verify Dual List Box When Moving Items To The Left List
    // Description: Select "Cras justo odio" and move to the left list.
    // Expected Result: Should be able to move "Cras justo odio" to the left list.
    @Test(priority = 2)
    public void testDualListBoxToLeft() throws InterruptedException {
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.ListBox, "Menu List [All Examples]: The element 'List Box' was clicked");
        helper.clickElement(menuHandler.BootstrapListBox, "Menu List [Alerts & Modals]: The element 'Bootstrap List Box' was clicked");
        helper.clickElement(bootstrapListBoxObj.rightSearchField, "List Box [Bootstrap List Box]: The field 'search' was clicked");
        helper.sendKeys(bootstrapListBoxObj.rightSearchField, "Cras justo odio", "List Box [Bootstrap List Box]: ");
        helper.clickElement(bootstrapListBoxObj.rightListItem, "List Box [Bootstrap List Box]: The element 'Cras justo odio' was clicked");
        helper.clickElement(bootstrapListBoxObj.moveLeft, "List Box [Bootstrap List Box]: The element '<' was clicked");
        helper.sendKeys(bootstrapListBoxObj.leftSearchField, "Cras justo odio", "List Box [Bootstrap List Box]: ");
        helper.assertEqualsTo(helper.getElementAttributeValue(bootstrapListBoxObj.leftActiveListItem, "innerHTML"), "Cras justo odio");


    }


    // List Box - Dual List Box - Positive Testing
    // Title: Verify Dual List Box When Moving All Items To The Right List
    // Description: Select all items and move to the right list.
    // Expected Result: Should be able to move all items to the right list.
    @Test(priority = 3)
    public void testDualListBoxMoveAllToRight() throws InterruptedException {
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.ListBox, "Menu List [All Examples]: The element 'List Box' was clicked");
        helper.clickElement(menuHandler.BootstrapListBox, "Menu List [Alerts & Modals]: The element 'Bootstrap List Box' was clicked");
        helper.clickElement(bootstrapListBoxObj.selectAllLeft, "List Box [Bootstrap List Box]: The button 'Select All' was clicked");
        helper.clickElement(bootstrapListBoxObj.moveRight, "List Box [Bootstrap List Box]: The button '>' was clicked");
        helper.countElements(bootstrapListBoxObj.listRightGroup, 10,"List Box [Bootstrap List Box]: ");
        
    }


    // List Box - Dual List Box - Positive Testing
    // Title: Verify Dual List Box When Moving All Items To The Left List
    // Description: Select all items and move to the left list.
    // Expected Result: Should be able to move all items to the left list.
    @Test(priority = 4)
    public void testDualListBoxMoveAllToLeft() throws InterruptedException {
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.ListBox, "Menu List [All Examples]: The element 'List Box' was clicked");
        helper.clickElement(menuHandler.BootstrapListBox, "Menu List [Alerts & Modals]: The element 'Bootstrap List Box' was clicked");
        helper.clickElement(bootstrapListBoxObj.selectAllRight, "List Box [Bootstrap List Box]: The button 'Select All' was clicked");
        helper.clickElement(bootstrapListBoxObj.moveLeft, "List Box [Bootstrap List Box]: The button '<' was clicked");
        helper.countElements(bootstrapListBoxObj.listLeftGroup, 10,"List Box [Bootstrap List Box]: ");
        
    }


    // List Box - Data List Filter - Positive Testing
    // Title: Verify Data List Filter When Using Valid Inputs
    // Description: Search for "Burn" and get the details.
    // Expected Result: Should be able to get Burn's details.
    @Test(priority = 5)
    public void testDataListFilter() throws InterruptedException {
        helper.smoothScrollToElement( menuHandler.InputForms);
        helper.clickElement(menuHandler.ListBox, "Menu List [All Examples]: The element 'List Box' was clicked");
        helper.clickElement(menuHandler.DataListFilter, "Menu List [Alerts & Modals]: The element 'Data List Filter' was clicked");
        helper.sendKeys(dataListFilterObj.searchField, "Glenn", "List Box [Data List Filter]: ");
        dataListFilterObj.validateElementsContainingText(dataListFilterObj.listItems, "Glenn");
        
    }




}
