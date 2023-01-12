package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoTest {
    WebDriver driver;
    ExtentReports extent;


        @BeforeMethod
        public void configuration () {

            String reportPath = System.getProperty("user.dir") + "\\report\\Index02.html";
            ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);

            reporter.config().setReportName("Omayo Test Report");
            reporter.config().setDocumentTitle("Omayo Test Report Title");

            extent = new ExtentReports();

            extent.attachReporter(reporter);
            extent.setSystemInfo("Operation system", "Window 10");
            extent.setSystemInfo("Tested by ", "Pathan Noushad");

        }
        @Test
        public void testOne () {

            ExtentTest eTest = extent.createTest("Test ONe Created");
            System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            eTest.info("Chrome Browser Launched");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://omayo.blogspot.com/");
            eTest.info("Navigated to Omayo Home Page");

            Assert.assertEquals(driver.findElement(By.id("pah")).getText(), "PracticeAutomationHere");

        }
        @AfterMethod
        public void tearDown () {
            driver.close();
            extent.flush();
        }

}
