package POMObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //encapsulation   ----------- abstraction
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//input[@id='usernameField']")
    private WebElement Username;
    @FindBy(xpath = "//input[@id='passwordField']")
    private WebElement Password;
   @FindBy(xpath = "//button[@type='submit'][1]")
   private WebElement LoginButton;

    public WebElement Username(){
        return Username;
    }
    public WebElement Password(){
        return Password;
    }
    public WebElement LoginButton(){
        return LoginButton;
    }
}









