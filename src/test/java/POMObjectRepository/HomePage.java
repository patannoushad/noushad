package POMObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/a/img")
    private WebElement name;

    @FindBy(xpath = "//div[@class='nI-gNb-drawer__icon']")
    private WebElement menu;
    @FindBy(xpath = "//div[@class='nI-gNb-profile-info']/a")
    private WebElement link;

    public WebElement name(){
        return name;
    }

    public WebElement menu(){
        return menu;
    }
    public WebElement link(){
        return  link;
    }
}