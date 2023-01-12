package Practice;

//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


//import java.util.Set;


public class demo {
   @Test()
    public void demo() {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.flipkart.com/");
       driver.findElement(By.xpath("//input[@type='text'][@class='_2IX_2- VJZDxU']")).sendKeys("7981988662");
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//input[@type='password'][@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Noushad@1998");








//        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//        driver.findElement(By.id("newTabsBtn")).click();
//        String PW = driver.getWindowHandle();
//        Set<String> MW = driver.getWindowHandles();
//        for ( String Box : MW    ) {
//            if (!Box.equals(PW)){
//                driver.switchTo().window(Box);
//
//
//            }
//
//        }



    }
}