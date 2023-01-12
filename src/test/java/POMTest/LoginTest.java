package POMTest;

import POMObjectRepository.HomePage;
import POMObjectRepository.LoginPage;
import POMObjectRepository.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LoginTest{
    WebDriver driver;

    @Test(priority = 0) //----------------------anotation
    public void login()  {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/nlogin/login");
    }
    @Test(priority = 1)
        public void Loginpage() throws InterruptedException {
        LoginPage Loginpage = new LoginPage(driver);
        Loginpage.Username().sendKeys("patannoushad123@gmail.com");
        Loginpage.Password().sendKeys("Noushad@123");
        Loginpage.LoginButton().click();
    }
    @Test(priority = 2)
        public void Hp() throws InterruptedException {
        HomePage homepage = new HomePage(driver);
        Assert.assertTrue(homepage.name().isDisplayed());
        Thread.sleep(3000);
        homepage.menu().click();
        Thread.sleep(3000);
        homepage.link().click();
    }
    @Test(priority = 3)
        public void PP() throws InterruptedException {
        ProfilePage Profilpage = new ProfilePage(driver);
        Thread.sleep(3000);
        Assert.assertTrue(Profilpage.UpdateButton().isDisplayed());
        Profilpage.ProfileIcon().click();
        Thread.sleep(3000);
        Profilpage.logOutButton().click();

    }

        @AfterClass
        public void close(){
        driver.close();
            System.out.println("page closed------");
        }
    }

