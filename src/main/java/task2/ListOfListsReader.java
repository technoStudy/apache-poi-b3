package task2;

import org.apache.poi.ss.usermodel.*;
import utils.ExcelReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListOfListsReader {
    public static void main(String[] args) throws IOException {
//        Workbook workbook = WorkbookFactory.create(new File("src/main/resources/listOfLists.xlsx"));
//        Sheet sheet = workbook.getSheetAt(0);
//
//        List<List<String>> listOfLists = new ArrayList<>();
//        int numberOfRows = sheet.getPhysicalNumberOfRows();
//
//        for (int i = 0; i < numberOfRows; i++) {
//            List<String> list = new ArrayList<>();
//
//            Row row = sheet.getRow(i);
//            int numberOfCells = row.getPhysicalNumberOfCells();
//            for (int j = 0; j < numberOfCells; j++) {
//                Cell cell = row.getCell(j);
//                list.add(cell.getStringCellValue());
//            }
//
//            listOfLists.add(list);
//        }
        ExcelReader reader = new ExcelReader("src/main/resources/listOfLists.xlsx");
        List<List<String>> listOfLists = reader.getLists();
        System.out.println(listOfLists);
    }
}
