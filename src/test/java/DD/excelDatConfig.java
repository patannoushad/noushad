package DD;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class excelDatConfig {
    XSSFWorkbook wb;
    XSSFSheet sh;
    public excelDatConfig(String excelPath) throws IOException {     //constructor -- excelDatConfig
        File src = new File("C:\\Users\\PATAN MUNNA\\OneDrive\\Desktop\\readingExcel.xlsx");
        FileInputStream fis = new FileInputStream(src);
        wb = new XSSFWorkbook(fis);
    }
    public String getData(int sheetNumber,int row, int column){
        sh=wb.getSheetAt(sheetNumber);
        String data = sh.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
    public int getRowCount(int sheetIndex){
        int row = wb.getSheetAt(sheetIndex).getLastRowNum();
        row = row + 1;
        return row;
    }

}
