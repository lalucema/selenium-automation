package Tests;

import TestComponents.BaseTest;
import org.testng.annotations.Test;


public class Table extends BaseTest {


    //==================================================================================================================
    // Table - Sort And Search - Positive Testing
    // Title: Verify Table Using A Valid Input
    // Description: Search "Wagner".
    // Expected Result: B. Wagner's details should be displayed.
    @Test(priority = 1)
    public void testTableValidInput() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.Table);
        helper.clickElement(menuHandler.Table, "Menu List [All Examples]: The element 'Table' was clicked");
        helper.clickElement(menuHandler.TableSortAndSearch, "Menu List [Input Forms]: The element 'Table Sort & Search' was clicked");
        helper.clickElement(tableObj.searchField, "Table [Table Sort & Search]: The field 'Search' was clicked");
        helper.sendKeys(tableObj.searchField, "Wagner", "Table [Table Sort & Search]: ");
        helper.assertEqualsTo(helper.getElementStringValue(tableObj.firstRow), "B. Wagner");
    }

    // Table - Sort And Search - Negative Testing
    // Title: Verify Table Using An Invalid Input
    // Description: Search "Powder".
    // Expected Result: "No matching records found" should be displayed.
    @Test(priority = 2)
    public void testTableInvalidInput() throws InterruptedException {
        helper.smoothScrollToElement(menuHandler.Table);
        helper.clickElement(menuHandler.Table, "Menu List [All Examples]: The element 'Table' was clicked");
        helper.clickElement(menuHandler.TableSortAndSearch, "Menu List [Input Forms]: The element 'Table Sort & Search' was clicked");
        helper.clickElement(tableObj.searchField, "Table [Table Sort & Search]: The field 'Search' was clicked");
        helper.sendKeys(tableObj.searchField, "Powder", "Table [Table Sort & Search]: ");
        helper.assertEqualsTo(helper.getElementStringValue(tableObj.emptyTable), "No matching records found");
    }
}
