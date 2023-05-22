package automation.tests;

import org.testng.annotations.Test;

import automation.pages.HomePage;


public class LoginTest extends BaseTest{
    private static String homeurl = "https://automationexercise.com/";

    @Test
    public void loginTest(){
        homePage = new HomePage(driver);       
    driver.get(homeurl);
    homePage.clickLogin();  
    }
  
}
