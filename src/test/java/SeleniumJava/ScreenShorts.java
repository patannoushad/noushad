package SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;




public class ScreenShorts {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");

        // File,FileUtils are in java

//        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src,new File("cybercrime.png"));


//        TakesScreenshot tc =(TakesScreenshot) driver;
//        File src = tc.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src,new File("Noushad1.png"));



    }
}
