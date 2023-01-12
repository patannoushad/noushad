package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setup(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "E:\\chrome\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.get(url);

    }

    @Test(priority = 0)
    void logo() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"HTML29\"]/div[1]/img"));
        Assert.assertTrue(logo.isDisplayed(), "logo is displayingg-------");
    }

    @Test(priority = 1)
    void title() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "omayo (QAFox.com)", "title is matched--------");
    }

    @AfterClass
    void quit() {
        driver.quit();
    }
}

/*
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
    <parameter name="url" value="http://omayo.blogspot.com/"></parameter>
    <test name="Pone">
        <parameter name="browser" value="chrome"></parameter>
        <classes>

            <class name="TestNG.Parameterization">
                <methods>
                    <include name="logo"/>
                    <include name="title"/>
                </methods>
            </class>
        </classes>
    </test>
    <test name="Ptwo">
        <parameter name="browser" value="edge"></parameter>
        <classes>
            <class name="TestNG.Parameterization">
                <methods>
                    <include name="logo"/>
                    <include name="title"/>
                </methods>
            </class>
        </classes>
    </test>
</suite>
 */