import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ExcelReadExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/Book1.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheetByIndex = workbook.getSheetAt(0);
        Sheet sheet1 = workbook.getSheet("Sheet1");

        int numberOfRows = sheet1.getPhysicalNumberOfRows();
        System.out.println(numberOfRows);

        for (int i = 0; i < numberOfRows; i++) {
            Row row = sheet1.getRow(i);
            int numberOfCells = row.getPhysicalNumberOfCells();
            for (int j = 0; j < numberOfCells; j++) {
                Cell cell = row.getCell(j);
                CellType cellType = cell.getCellType();
                if(cellType == CellType.STRING) {
                    String stringCellValue = cell.getStringCellValue();
                    System.out.print(stringCellValue + " ");
                } else if(cellType == CellType.NUMERIC) {
                    double numericCellValue = cell.getNumericCellValue();
                    System.out.print(numericCellValue + " ");
                }

            }
            System.out.println();
        }
    }
}
