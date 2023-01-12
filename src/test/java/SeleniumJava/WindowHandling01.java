package SeleniumJava;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class WindowHandling01 {
    public static void main (String [] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String PW = driver.getWindowHandle();
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> MW = driver.getWindowHandles();
        for (String Box : MW  ) {
            if(!Box.equals(PW)){
                driver.switchTo().window(Box);
                driver.findElement(By.id("firstName")).sendKeys("Noushad");
                driver.close();


            }
        }

    }

}
