package task3;

import org.apache.poi.ss.usermodel.*;
import utils.ExcelReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapsReader {
    public static void main(String[] args) throws IOException {
//        Workbook workbook = WorkbookFactory.create(new File("src/main/resources/listOfMaps.xlsx"));
//        Sheet sheet = workbook.getSheetAt(0);
//
//        List<String> titles = new ArrayList<String>();
//        Row titleRow = sheet.getRow(0); // reading the first row
//        for (int i = 0; i < titleRow.getPhysicalNumberOfCells(); i++) {
//            Cell titleCell = titleRow.getCell(i);
//            titles.add(titleCell.toString());
//        }
//
//        List<Map<String, String>> listOfMaps = new ArrayList<>();
//        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) { // staring from second row
//            Map<String, String> map = new HashMap<>();
//
//            Row row = sheet.getRow(i);
//            for (int j = 0; j < titles.size(); j++) {
//                String key = titles.get(j);
//                String value = row.getCell(j).toString();
//
//                map.put(key, value);
//            }
//
//            // save the map inside a list
//            listOfMaps.add(map);
//        }

        ExcelReader reader = new ExcelReader("src/main/resources/listOfMaps.xlsx");
        List<Map<String, String>> listOfMaps = reader.getListOfMaps();
        System.out.println(listOfMaps);

        for (Map<String, String> map : listOfMaps) {
            System.out.println(map);
        }
    }
}
