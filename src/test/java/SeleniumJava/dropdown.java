package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown {
    @Test()
    void Test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement dropdown = driver.findElement(By.id("course"));
        Select dd = new Select(dropdown);
        dd.selectByIndex(3);
        dd.selectByVisibleText("Java");
        WebElement Multiple = driver.findElement(By.id("ide"));
        Select M = new Select(Multiple);
        M.selectByIndex(2);
        M.selectByVisibleText("Visual Studio");

    }
}