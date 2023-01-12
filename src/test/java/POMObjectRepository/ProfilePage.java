package POMObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
    WebDriver driver;
    public ProfilePage(WebDriver driver){
        this.driver=driver;
    }
    private By UpdatButton= By.xpath("(//*[@class='secondary-content'])[1]");
    private By Profileicon = By.xpath("//div[@class='nI-gNb-drawer']");
    private By logoutButton = By.xpath("//*[@title='Logout']");
    public WebElement UpdateButton(){
        return driver.findElement(UpdatButton);
    }
    public WebElement ProfileIcon(){
        return driver.findElement(Profileicon);
    }
    public WebElement logOutButton(){
        return driver.findElement(logoutButton);
    }

}
