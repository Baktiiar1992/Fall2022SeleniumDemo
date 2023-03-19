package com.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits extends BaseTest{

    @Test
    public void testExplicit(){
        driver.navigate().to("https://demoqa.com/dynamic-properties");

        WebElement enableAfter = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(enableAfter));
        enableAfter.click();

      wait.until(ExpectedConditions.attributeContains(By.id("colorChange"),"class","text-danger"));
        WebElement colorChange = driver.findElement(By.id("colorChange"));
        colorChange.click();


        WebElement visibility = driver.findElement(By.id("visibleAfter"));
        wait.until(ExpectedConditions.visibilityOf(visibility));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter"))).click();
    }

    @Test
    public void etsy(){
        driver.navigate().to("https://www.etsy.com/");
        driver.findElement(By.xpath(".//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement signIn = driver.findElement(By.xpath(".//h1[contains(text(),'Sign in')]"));
        wait.until(ExpectedConditions.visibilityOf(signIn));

        WebElement email = driver.findElement(By.id("join_neu_email_field"));
        email.sendKeys("bsooronbaev@gmail.com");

        WebElement password = driver.findElement(By.id("join_neu_password_field"));
        password.sendKeys("kayrilda321");

        driver.findElement(By.xpath(".//button[@class='wt-btn wt-btn--primary wt-width-full']")).click();

        Helper.pause(8000);
    }
}
