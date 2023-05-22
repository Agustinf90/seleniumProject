package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class BasePage {
    //variables
    protected WebDriver driver;


    //constructor;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected void click(By locator){
        find(locator).click();
    }
    
    protected void type (By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }
    protected boolean elementIsDisplayed(By locator){
    try{
        return find(locator).isDisplayed();
        }
    catch(org.openqa.selenium.NoSuchElementException e){
        return false;
        }
    }
    protected String text(By locator){
        return find(locator).getText();
    }
}



