package task1;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapReader {
    public static void main(String[] args) throws IOException {
        File f = new File("src/main/resources/map.xlsx");
        Workbook workbook = WorkbookFactory.create(f);
        Sheet sheet = workbook.getSheetAt(0);
        int numberOfRows = sheet.getPhysicalNumberOfRows();

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < numberOfRows; i++) {
            Row row = sheet.getRow(i);
            String key = row.getCell(0).toString();
            String value = row.getCell(1).toString();
            map.put(key, value);
            System.out.println(key + " : " + value);
        }

        System.out.println(map);

        System.out.println(map.get("url"));
    }
}
