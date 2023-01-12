package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkbox {


    @Test()
            void Test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement Orange_box = driver.findElement(By.id("checkbox1"));
        boolean Displayed = Orange_box.isDisplayed();
        System.out.println("Orange button is displayed --" + Displayed);
        boolean enabled = Orange_box.isEnabled();
        System.out.println("Orange button is enabled --" + enabled);//
        boolean Selected = Orange_box.isSelected();
        System.out.println("Orange button is Selected --" + Selected);//radio button,dropdown
        if (Selected == true)
            Orange_box.click();
            //  System.out.println("Orange box in clickked --"+Orange_box);
        else {
            System.out.println("Already selected --" + Orange_box);
        }
    }
}
//---------------Blue box
//
//        WebElement Blue_box = driver.findElement(By.id("checkbox2"));
//        boolean Displayedd = Blue_box.isDisplayed();
//        System.out.println("Blue button is displayedd --" + Displayedd);
//        boolean Enabledd = Blue_box.isEnabled();
//        System.out.println("Blue button is Enabledd -- " + Enabledd);
//        boolean Selectedd = Blue_box.isSelected();
//        System.out.println("Blue button is Selectedd --" + Selectedd);//radio button,dropdown
//        Thread.sleep(3000);
//        if (Selectedd == false){
//            System.out.println("inside the loop");
//            Blue_box.click();
//        }
//        else {
//            System.out.println("Already selected --" + Blue_box);
//        }
//


