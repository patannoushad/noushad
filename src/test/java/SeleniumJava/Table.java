package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");
       // -- System.out.println(driver.findElement(By.xpath("//table[@id='table1']")).getText());

        List<WebElement> Tdata =  driver.findElements(By.xpath("//table[@id='table1']"));

        for (int i=0;i<Tdata.size();i++){
            System.out.println(Tdata.get(i).getText());
        }

        driver.quit();











//---------------------------------------------------------

//        List<WebElement> table= driver.findElements(By.xpath("//table[@id='table1']//tr"));
//
//        for (int i=0; i<table.size();i++){
//            System.out.println(table.get(i).getText());
//        }
//--------------------------------------------------------
//   ---
//        String givenName = "Praveen";
//
//         List<WebElement> names = driver.findElements(By.xpath("//table[@id ='table1']//td[1]"));
//        int row=0;
//        for (int i=0; i<names.size();i++){
//            if (names.get(i).getText().equals(givenName)){
//                row = i;
//        }
//    }
//        String path = "//table[@id ='table1']//tr[\"+(row+1)+1\"]//td[3]";
//        System.out.println(driver.findElement(By.xpath(path)).getText());

// ----------------------------------------------------------------------






//        List<WebElement> table =  driver.findElements(By.xpath("//table[@id='table1']//tr"));
//
//       for ( int i=0; i<table.size(); i++){
//           System.out.println(table.get(i).getText());
//
//       }



//-------------------------------------------------------------





//        //WebElement Table = driver.findElement(By.xpath("//table[@id='table1']"));
//        WebElement a = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td"));
//        a.getText();
//        System.out.println("get test  "+a);
    }
}
