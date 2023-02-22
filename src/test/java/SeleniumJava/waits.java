package SeleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class waits {
    public static void main (String[] args){
     //System.setProperty("webdriver.chrome","E:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1000,1000));
        driver.get("https://www.facebook.com/");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
    }
}
