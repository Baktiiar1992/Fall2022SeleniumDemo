package com.facebook.intro;

import com.beust.ah.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertDemo extends BaseTest{

    @Test
    public void testAlert1(){
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        Helper.pause(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Helper.pause(3000);
    }

    @Test
    public void testExplicitWait(){
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
        alertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement confirmBtn = driver.findElement(By.id("confirmButton"));
        confirmBtn.click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        Helper.pause(2000);
        driver.navigate().refresh();
        Helper.pause(3000);
        WebElement confirmBtn1 = driver.findElement(By.id("confirmButton"));
        confirmBtn1.click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
        Helper.pause(2000);
        WebElement text = driver.findElement(By.id("confirmResult"));
        Assert.assertTrue(text.getText().equals("You selected Cancel"));

        WebElement promtButton = driver.findElement(By.id("promtButton"));
        promtButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        String name = "Hello Baha";
        alert.sendKeys(name);
        alert.accept();
        WebElement name1 = driver.findElement(By.id("promptResult"));
        Assert.assertEquals(name1.getText(),"You entered "+ name);
        Helper.pause(2200);

    }
}
