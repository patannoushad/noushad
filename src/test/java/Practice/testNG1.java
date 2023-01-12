package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG1 {
    @Test()
        public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");
        driver.findElement(By.id("textbox1")).clear();
        driver.findElement(By.id("textbox1")).sendKeys("Noushad");
        Thread.sleep(2000);
        driver.quit();
    }
}
