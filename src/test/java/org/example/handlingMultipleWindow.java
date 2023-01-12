package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class handlingMultipleWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        String parent = driver.getWindowHandle();
        driver.findElement(By.className("ntc__chip-wrapper")).click();
        driver.findElement(By.className("ntc__chip-label")).click();

//        Set<String> S1 = driver.getWindowHandles();
//
//        Iterator<String> I1 = S1.iterator();
//
//        while (I1.hasNext()) {
//            String child_Window = I1.next();
//
//            if (!parent.equals(child_Window)) {
//                driver.switchTo().window(child_Window);
//                System.out.println(driver.switchTo().window(child_Window).getTitle());
//                driver.close();
//            }
//        }
//        driver.switchTo().window(parent);
    }
}









