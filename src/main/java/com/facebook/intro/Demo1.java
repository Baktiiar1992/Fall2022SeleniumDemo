package com.facebook.intro;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import org.testng.annotations.Test;


public class Demo1 extends BaseTest{

    @Test
    public void testDemo1() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys("Baha");
        Thread.sleep(5000);


        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("bsooronbaev@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Hello");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("HelloPermanent");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();


        assertEquals(fullNameInputField.getAttribute("value"),"Baha");
        assertEquals(userEmail.getAttribute("value"),"bsooronbaev@gmail.com");
        assertEquals(currentAddress.getAttribute("value"),"Hello");
        assertEquals(permanentAddress.getAttribute("value"),"HelloPermanent");
    }

}
