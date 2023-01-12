package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Omayologin {
    WebDriver driver;

    @Before("@login")
    public void chrome(){
        System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("^User navigate to omayo website$")
    public void User_navigate_to_omayo_website(){
        driver.get("http://omayo.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("^User enter username (.+) and password (.+) in the fields$")
    public void User_enter_username_username_and_password_password_in_the_fields(String username,String password){
        driver.findElement(By.xpath("//*[contains(@name,'userid')]")).sendKeys(username);
        driver.findElement(By.xpath("//*[starts-with(@name,'pswrd')]")).sendKeys(password);
    }

    @And("^User click on the login button$")
    public void user_click_on_the_login_button() {
        driver.findElement(By.xpath("//*[starts-with(@type,'button')]")).click();
    }
    @Then("^User should able to get the login based expected (.+) status$")
    public void user_should_able_to_get_the_login_based_expected_status(String status){
        String actualResult = null;
        try {
            Alert alert = driver.switchTo().alert();
            if (alert.getText().contains("Error Password or Username")) {
                actualResult = "failed";
            }
        }catch(Exception e){
                actualResult = "Success";
            }
        Assert.assertEquals(status,actualResult);
    }


    @After("login")
    public void close(){
        driver.quit();
    }

}
