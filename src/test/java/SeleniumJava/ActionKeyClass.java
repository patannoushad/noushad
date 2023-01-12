package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//------movetoElement(),click(),perform(),build()
//        driver.get(" http://omayo.blogspot.com/");
//        Actions mouse = new Actions(driver);
//        mouse.moveToElement(driver.findElement(By.xpath("//a/span[text()='Selenium143']"))).perform();
//        WebElement Selenium143 = driver.findElement(By.xpath("//a/span[text()='Selenium143']"));
//        mouse.click(Selenium143).perform();

//-------draganddropBy

//        driver.get("https://omayo.blogspot.com/p/page3.html");
//        Actions mouse = new Actions(driver);
//        WebElement minP = driver.findElement(By.xpath("//*[@id=\"post-body-6103478144908648662\"]/div[1]/div[2]/form/div/div/div[2]/a[1]"));
//        mouse.dragAndDropBy(minP,900,0).perform();

    }
}


















