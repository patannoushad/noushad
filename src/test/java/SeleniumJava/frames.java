package SeleniumJava;
         //   --------------------------------incomplete
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) {
     //   System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("Noushad");
        driver.switchTo().frame(driver.findElement(By.id("frm1")));
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Size of the frames ------ "+size);

        WebElement dropdown = driver.findElement(By.id("selectnav1"));
        Select dd = new Select(dropdown);
        dd.selectByIndex(4);
        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='frm2']")));
        System.out.println("In the frame2");
        driver.findElement(By.id("firstName")).sendKeys("Noushad");


//  ----------> switching to multiple loops and finding one element
//
//            driver.get("http://demo.guru99.com/test/guru99home/");
//            driver.manage().window().maximize();
//            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//            int size = driver.findElements(By.tagName("iframe")).size();
//            for(int i=0; i<=size; i++){
//                driver.switchTo().frame(i);
//                int total=driver.findElements(By.xpath("html/body/a/img")).size();
//                System.out.println(total);
//                driver.switchTo().defaultContent();}



      //  driver.get("http://demo.guru99.com/test/guru99home/");
      //  driver.switchTo().frame("a077aa5e");
        //driver.findElement(By)




















    }
}


    //---("This element is present in frame " + i + "   " + total);