package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class HomePage extends BasePage{
    //Locators:
    By loginBtn = By.xpath("//a[@href='/login']");

    //Constructor:
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Methods:
    public void clickLogin(){
        click(loginBtn);
    }
}
