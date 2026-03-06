package Tests;

import TestComponents.BaseTest;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

    public class DataDriven extends BaseTest {

        public static Object[][] readTestData(String filePath, String sheetName) throws IOException {
            FileInputStream file = new FileInputStream((filePath));
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getLastRowNum();
            int colCount = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[rowCount][colCount];

            // Iterate over each row in the sheet
            for (int i = 1; i <= rowCount; i++) { // Starting from index 1 to skip header row
                Row row = sheet.getRow(i);
                if (row != null) { // Check if the row is not null (empty row)
                    // Iterate over each cell in the row
                    for (int j = 0; j < colCount; j++) {
                        Cell cell = row.getCell(j);
                        if (cell != null) { // Check if the cell is not null
                            // Convert the cell value to a string and store it in the data array
                            data[i - 1][j] = cell.toString();
                        } else {
                            // If the cell is null, store an empty string in the data array
                            data[i - 1][j] = "";
                        }
                    }
                }
            }

            workbook.close();
            file.close();

            return data;
        }
    }

//


