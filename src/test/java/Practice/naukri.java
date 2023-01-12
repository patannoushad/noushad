package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class naukri {

    String username ="patannoushad123@gmail.com";
    String password ="Noushad@123";
    WebDriver driver;
    @Test(priority = 0)
        void setup() {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/nlogin/login");
        driver.getTitle();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    void title(){
        String  T = driver.getTitle();
        System.out.println("Title of the url  =  " +T);
        Assert.assertEquals(T,"Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com","title of the page is matched");
    }

    @Test(priority = 2)
        void login(){
        driver.findElement(By.id("usernameField")).click();
        driver.findElement(By.id("usernameField")).sendKeys(username);
        driver.findElement(By.id("passwordField")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
