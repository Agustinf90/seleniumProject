package automation.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import automation.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseTest {
    protected static WebDriver driver;
    protected static HomePage homePage;


    @BeforeClass
        public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
        public void tearDown(){
        driver.quit();
    }
}
