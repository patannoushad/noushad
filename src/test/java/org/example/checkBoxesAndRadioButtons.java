package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBoxesAndRadioButtons {



        public static void main(String[] args) throws Exception {

            String t = "testing";

            System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver_win32\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("http://omayo.blogspot.com/");


            WebElement male_radio_button= driver.findElement(By.id("radio1"));

           /*
            Boolean r1=male_radio_button.isEnabled();

           if(r1=true){
               System.out.println("radio button is enabled in the page");
           }
           else {
               System.out.println("disabled");
           }*/


            boolean status=male_radio_button.isDisplayed();

            System.out.println("Male radio button is Displayed >>"+status);

            boolean enabled_status=male_radio_button.isEnabled();

            System.out.println("Male radio button is Enabled >>"+enabled_status);

            boolean selected_status=male_radio_button.isSelected();

            System.out.println("Male radio button is Selected >>"+selected_status);

            if(selected_status==false) {
                male_radio_button.click();
            }
            else {
                System.out.println("already selcted");
            }
            boolean selected_status_new=male_radio_button.isSelected();

            System.out.println("Male radio button is Selected >>"+selected_status_new);

        }

    }

