package Practice;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Calendar {
    public static void main(String[] args) throws InterruptedException, IOException {


        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();

//---------------------------------------------
//  ------> all dates wil be printed
//        List<WebElement> Tdata = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']"));
//        for (int i=0;i<Tdata.size();i++){
//            System.out.println(Tdata.get(i).getText());
//        }
//---------------------------------------------------------
//---------> june 3rd
//        while (!driver.findElement(By.className("//span[contains(text(),'December')]")).getText().contains("November")){
//            driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//        }
//        List<WebElement > days = driver.findElements(By.xpath("//tbody/tr[1]/td[3]/a[1]"));
//        for(int i =0;i<days.size();i++){
//            if (days.get(i).getText().equalsIgnoreCase("15")){
//
//                days.get(i).click();
//                break;
//            }
//        }
//------------------------------------------------------------------------
//-------All dates will be printed
//        WebElement table = driver.findElement((By.xpath("//body/div[@id='ui-datepicker-div']/table[1]")));
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        for (int i=0; i<rows.size();i++) {                  //--row  5 , colloum 7
//            List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
//            for (int j=0; j<col.size(); j++) {
//                String celValue = col.get(j).getText();
//                System.out.println(celValue);
//            }
//        }
//---------------------------------------------------------------------------
        driver.quit();
    }
}

