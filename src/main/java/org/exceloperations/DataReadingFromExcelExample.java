package org.exceloperations;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReadingFromExcelExample {
    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\simmi\\Documents\\OneNote Notebooks\\hansbir\\Book1.xlsx");
        FileInputStream fileInputStream=new FileInputStream(file);

        if(fileInputStream==null){
            throw new FileNotFoundException("File not found....");
        }
        else {


            //HSSFWorkbook workbook=new HSSFWorkbook(fileInputStream);
            XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
            //HSSFSheet sheet=workbook.getSheetAt(0);
            XSSFSheet sheet=workbook.getSheetAt(0);
            //HSSFSheet sheet=workbook.getSheet("Sheet1");
            int row=sheet.getLastRowNum();
            for(int i=0;i<row;i++){
               // HSSFRow rows=sheet.getRow(i);
                XSSFRow rows=sheet.getRow(i);
                int column=rows.getLastCellNum();
                for(int j=0; j<column; j++){
                    XSSFCell cell=rows.getCell(j);

                  //  HSSFCell cell=rows.getCell(j);
                    System.out.print(cell.getStringCellValue()+"\t");
                }
                System.out.println();
            }

        }

    }
}
