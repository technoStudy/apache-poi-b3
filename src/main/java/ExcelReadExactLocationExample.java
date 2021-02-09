import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ExcelReadExactLocationExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/Book1.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet1 = workbook.getSheet("Sheet2");
        Row row = sheet1.getRow(5);
        Cell cell = row.getCell(2);
        System.out.println(cell.toString());
    }
}
