package org.exceloperations;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelSecondOption {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file=new File("C:\\Users\\shahn\\OneDrive\\Desktop\\Appium-Batch-Morning\\Book1.xlsx");
        FileInputStream fileInputStream=new FileInputStream(file);
        if(fileInputStream==null){
            throw new FileNotFoundException("File not found....");
        }
        else {

            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
            HSSFSheet sheet = workbook.getSheetAt(0);
            for(Row row: sheet){
                for(Cell cell:row){
                    System.out.print(cell.getStringCellValue()+"\t");
                }
                System.out.println();
            }
        }

    }
}
