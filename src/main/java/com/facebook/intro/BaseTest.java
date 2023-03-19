package com.facebook.intro;

import com.facebook.BrowserHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {

    WebDriver driver;
    BrowserHelper browserHelper;

    AlertHelper alertHelper;
    @BeforeClass
    public void setUp(){



        WebDriverManager.chromedriver().setup(); // configure chrome driver to connect browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options); // creating instance of chrome driver
        driver.manage().window().maximize();  // Maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // driver will wait 20 seconds
        browserHelper = new BrowserHelper(driver);
        alertHelper = new AlertHelper(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
