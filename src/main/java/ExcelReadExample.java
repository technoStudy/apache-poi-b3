import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class ExcelReadExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/Book1.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheetByIndex = workbook.getSheetAt(0);
        Sheet sheet1 = workbook.getSheet("Sheet1");

    }
}
