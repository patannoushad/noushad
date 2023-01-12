package DD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class loginUsingDataDriven {
    WebDriver driver;

    @BeforeTest
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test(dataProvider = "testdata")
    public void TestFireFox(String uname, String password1) {
        driver.findElement(By.id("email")).sendKeys(uname);
        driver.findElement(By.id("pass")).sendKeys(password1);
    }

    @DataProvider(name = "testdata")
    public Object[][] TestDataFeed() throws IOException, InterruptedException {
        excelDatConfig config = new excelDatConfig(" ");
        int rows = config.getRowCount(0);
        Object[][] data = new Object[rows][2];
        for (int i = 0; i < rows; i++) {
            data[i][0] = config.getData(0, i, 0);
            data[i][1] = config.getData(0, i, 1);
            Thread.sleep(3000);
        }
        return data;
    }
    @AfterTest
    public void QuitTC(){
        driver.quit();
    }
}
