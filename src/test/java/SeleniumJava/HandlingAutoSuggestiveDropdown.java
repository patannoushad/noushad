package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Actions a = new Actions(driver);

        a.click(driver.findElement(By.xpath("//img[@alt='Make My Trip']"))).perform();
        driver.findElement(By.xpath("//label[@for='fromCity']")).click();
        //  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("del");
        //a.sendKeys("Bangkok").click().build().perform();

        Thread.sleep(3000);
        a.click(driver.findElement(By.xpath("//input[@placeholder='From']"))).perform();
        Thread.sleep(3000);
        a.sendKeys("Bangkok").perform();
        Thread.sleep(3000);
//        ----------------------------------------------------------------------
//        a.sendKeys(Keys.DOWN).perform();
//        a.sendKeys(Keys.DOWN).perform();
//        a.sendKeys(Keys.DOWN).perform();
//        a.sendKeys(Keys.DOWN).perform();
//        a.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
//        ----------------------------------------------------------------------
//        int i = 0;
//        while (i<5) {
//            a.sendKeys(Keys.DOWN).perform();
//
//            i++;
//        }
//        a.sendKeys(Keys.ENTER).perform();
//        --------------------------------------------------------------------
        for (int i = 0; i < 5; i++) {
            a.sendKeys(Keys.DOWN).perform();
        }
        a.sendKeys(Keys.ENTER).perform();
    }
}
