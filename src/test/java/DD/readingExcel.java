package DD;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readingExcel {
        public static void main(String[] args) throws IOException {
            File file = new File("C:\\Users\\PATAN MUNNA\\OneDrive\\Desktop\\readingExcel.xlsx");
            FileInputStream fis = new FileInputStream(file);

            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("readingExcel");

//            String data1 = sheet.getRow(0).getCell(0).getStringCellValue();
//            System.out.println(data1);


            int rowcount = sheet.getLastRowNum();
            for (int i = 0; i < rowcount; i++) {
                int colcount = sheet.getRow(i).getLastCellNum();
                XSSFRow currentrow = sheet.getRow(i);
                for(int j=0;j<colcount;j++){
                    String colcount1 = sheet.getRow(i).getCell(j).toString();
                    System.out.println("   "+colcount1);
                }
                System.out.println();
            }


    }
}
