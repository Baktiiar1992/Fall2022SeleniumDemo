package com.facebook.intro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Exceptions extends BaseTest{

    @Test
    public void noSuchElementEx(){
        //NoSuchElementException:

        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("userName1")).sendKeys("Hello World");

    }
    @Test
    public void noSuchWindowEx(){
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().window("4");
    }

    @Test
    public void noSuchFrameEx(){
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().frame(10);
    }
    @Test
    public void noSuchAlertEx(){
        browserHelper.openURL("https://demoqa.com/text-box");
        alertHelper.accept();
    }

    @Test
    public void invalidSelectorEx(){
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("//button[@type='button'][2]"));
    }
    @Test
    public void noSuchSessionEx(){
        driver.quit();
        browserHelper.openURL("https://demoqa.com/text-box");
    }
    @Test
    public void staleElementReferenceEx(){ //Ustarevshii element

    }

    @Test
    public void timeOutEx(){
        browserHelper.openURL("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter"))).click();

    }
    @Test
    public  void elementNotIntractableEx(){
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("submit")).sendKeys("sdisjd");
    }

    @Test
    public void elementClickInterceptedEx(){

    }

    @Test
    public void noSuchAttributeEx(){
        browserHelper.openURL("https://demoqa.com/text-box");
       WebElement ex =  driver.findElement(By.name("label"));
        System.out.println(ex.getAttribute("Hello"));
    }
}
