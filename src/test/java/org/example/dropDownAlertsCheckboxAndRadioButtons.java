package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDownAlertsCheckboxAndRadioButtons {
    //Alerts In selenium---Accept and Dissmiss
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1.Open url "https://demo.guru99.com/test/delete_customer.php"

        driver.get("https://demo.guru99.com/test/delete_customer.php");

        //2.Eneter "test" intoi customer id field

        driver.findElement(By.name("cusid")).sendKeys("test");

        //3.click on the submitt button

        driver.findElement(By.name("submit")).click();

        //Handling the alerts
        String alert=driver.switchTo().alert().getText();
        System.out.println(alert);
        if(alert=="Do you really want to delete this Customer?") {
            System.out.println("inside the loop");
            driver.switchTo().alert().accept();
            driver.switchTo().alert().accept();
        }
        else{
            driver.switchTo().alert().dismiss();
            System.out.println("outside the loop");
        }


        //click on the InsurenceProject link

        driver.findElement(By.xpath("//li[@class='dropdown'][3]/a")).click();
    }


    //dropDown ahndling in Slenium


    //checkboxAndRadioButtons


}
