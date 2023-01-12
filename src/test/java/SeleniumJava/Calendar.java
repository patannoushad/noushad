package SeleniumJava;

//import com.sun.source.tree.WhileLoopTree;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
public class Calendar {
    @Test()
        public void Calendar() {
            System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
            driver.findElement(By.id("datepicker")).click();
                                        //
            while (!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().contains("December 2023")) {
                driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            }
            List<WebElement> days = driver.findElements(By.xpath("//a[@class='ui-state-default']"));

            for (int i = 0; i < days.size(); i++) {
                                    // size of the array list
                if (days.get(i).getText().equals("31")) {
                    days.get(i).click();
                    System.out.println(i);
                    System.out.println("Date will be printed ---");
                }
            }
            //driver.quit();
    }
}