package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParllelTesting {
    WebDriver driver;
    @BeforeMethod
    void  url(){
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }

    @Test
    void logo(){
        WebElement log = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        Assert.assertTrue(log.isDisplayed());
    }
    @Test
    void searchbar(){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
    }
    @AfterMethod
    void quit(){
        driver.quit();
    }
}
