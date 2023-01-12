package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class kijiji {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");


        String givenName = "Praveen";

         List<WebElement> names = driver.findElements(By.xpath("//table[@id ='table1']//td[1]"));
        int row=0;
        for (int i=0; i<names.size();i++){
            if (names.get(i).getText().equals(givenName)){
                row = i;
        }
    }
        String path = "//table[@id ='table1']//tr[\"+(row+1)+1\"]//td[3]";

    }
}
//
















