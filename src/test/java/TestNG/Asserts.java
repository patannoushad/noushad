package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Asserts {

        WebDriver driver;
        @BeforeClass
        void setup(){
            System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://omayo.blogspot.com/");
        }
        @Test(priority = 0)
        void logo(){
            WebElement logo = driver.findElement(By.xpath("//*[@id=\"HTML29\"]/div[1]/img"));
            Assert.assertTrue(logo.isDisplayed(),"logo is displayingg-------");
        }
        @Test(priority = 1)
        void title(){
            String  title = driver.getTitle();
            Assert.assertEquals(title,"omayo (QAFox.com)","title is matched--------");
        }
        @AfterClass
        void quit(){
            driver.quit();
        }
    }


