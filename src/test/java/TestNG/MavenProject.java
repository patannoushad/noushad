package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MavenProject {
        public static  String Username = "7981988662";
        public static String Password = "Noushad@1998";
    WebDriver driver;

       @Test(priority = 0)
            void setup() throws InterruptedException {
           System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.flipkart.com/");
           Thread.sleep(5000);
       }
       @Test(priority = 1)
           void login() throws InterruptedException {
           driver.findElement(By.xpath("//input[@type='text'][@class='_2IX_2- VJZDxU']")).sendKeys(Username);
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.findElement(By.xpath("//input[@type='password'][@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(Password);
           Thread.sleep(5000);
           driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL'][@type='submit']")).click();
           Thread.sleep(5000);
       }
            @Test(priority = 2)
            void search() throws InterruptedException {
                driver.findElement(By.className("_3704LK")).sendKeys("redmi 7 pro");
                Thread.sleep(5000);
                driver.findElement(By.className("_3704LK")).sendKeys(Keys.ENTER);
                Thread.sleep(5000);
            }
            @Test(priority = 3)
            void handle() throws InterruptedException {
            String pw = driver.getWindowHandle();
            driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")).click();
            Set<String> MW = driver.getWindowHandles();
            for (String Box : MW) {
                if (!Box.equals(pw)) {
                    driver.switchTo().window(Box);
                    Thread.sleep(5000);
                    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[2]")).click();
                    Thread.sleep(5000);
                    //               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/button")).click();
                    //               Thread.sleep(5000);
                    Actions mouse = new Actions(driver);
                    mouse.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div"))).perform();
                    Thread.sleep(5000);
                    mouse.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[9]"))).click().perform();

                }
            }
        }
    }


