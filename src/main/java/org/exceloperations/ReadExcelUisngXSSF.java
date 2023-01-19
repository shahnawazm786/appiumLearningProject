package org.exceloperations;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelUisngXSSF {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\shahn\\OneDrive\\Desktop\\Appium-Batch-Morning\\TestCases.xlsx");
        FileInputStream inputStream=new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet =workbook.getSheetAt(0);
        for(Row row :sheet)
        {
            for(Cell cell:row){
                System.out.print(cell.getStringCellValue()+"\t");
            }
            System.out.println();
        }
        workbook.close();
        inputStream.close();
        file=null;

    }
}
