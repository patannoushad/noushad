package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://licindia.in/");

        //to maximize the window
        driver.manage().window().maximize();

        driver.findElement(By.id("p_lt_ctl03_SmartSearchBox_txtWord")).sendKeys("health");
        driver.findElement(By.id("p_lt_ctl03_SmartSearchBox_btnImageButton")).click();
        System.out.println("search has performed");
        driver.close();

        List<WebElement> webElements=driver.findElements(By.xpath("//*[@id='container']/div[1]/div/div/article/div[3]/div"));

        Iterator I1 = webElements.iterator();//----{1,2,3}

        for(int i=0; i<=webElements.size();i++)
        {
            if(I1.hasNext()){

              webElements.get(i).click();

        }
        }






    }


}
