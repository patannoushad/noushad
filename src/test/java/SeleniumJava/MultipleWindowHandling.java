package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.Iterator;
import java.util.Set;

public class MultipleWindowHandling {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyW
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String ParentWindow =driver.getWindowHandle();
            System.out.println("ParentWinow -----"+ParentWindow);
        driver.findElement(By.id("newTabsBtn")).click();
        Set<String> Mtabs = driver.getWindowHandles();


            System.out.println("Multiple tabs -----"+Mtabs );

        for ( String Box : Mtabs ) {
        //for (int i=0;i<Mtabs.size();i++) {
            if (!Mtabs.equals(ParentWindow)) {
               // if(Mtabs.)






//                driver.switchTo().window(Box);
//               // WebElement tab1 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div[1]/div[1]/div/h1"));
//                String Ttitle1 = driver.getTitle();
//                System.out.println("Tab Title --" + Ttitle1);
//                if (Ttitle1.equals().g){
//                   // driver.switchTo().window(driver.getTitle());


            }
         //   }
        }



//        for ( String Box : Mtabs ) {
//            System.out.println("In for loop-----");
//            if(!Box.equals(ParentWindow)) {
//                // if(Box.)
//                System.out.println("In first if loop----");
//
//                if (driver.getTitle().equals("Basic Controls - H Y R Tutorials")) {
//                    System.out.println("In Second if loop--------");
//                    driver.switchTo().window("Basic Controls - H Y R Tutorials");
//                    driver.findElement(By.id("firstName")).sendKeys("Noushad");
//                }


//        Iterator<String> I = Mtabs.iterator();
//
//        System.out.println(I.next());
//        System.out.println("iterating the applicaton");
//        //if(I.equals())


//        String firstWindow = I.next();
//
//        //driver.switchTo().window(firstWindow);
//
//
//        System.out.println(I.next());
//        String element = I.next();
//        if (element.equals(driver.getTitle())){
//
//

        }}
