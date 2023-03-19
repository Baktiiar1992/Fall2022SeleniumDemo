package com.facebook.intro;

import com.github.javafaker.Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
;
import org.testng.Assert;

import org.testng.annotations.Test;



import static org.openqa.selenium.By.id;

public class HomeWork extends BaseTest{


    static Faker faker = new Faker();



    @Test
    public void testhomeWork(){




        driver.get("https://demoqa.com/text-box");

        WebElement inputName = driver.findElement(id("userName"));
        inputName.sendKeys(name);

        WebElement inputEmail = driver.findElement(id("userEmail"));
        inputEmail.sendKeys(email);

        WebElement inputCurrentAddress = driver.findElement(id("currentAddress"));
        inputCurrentAddress.sendKeys(current);

        WebElement inputPermanentAddress = driver.findElement(id("permanentAddress"));
        inputPermanentAddress.sendKeys(permanent);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        WebElement actualNameElement = driver.findElement(By.id("name"));
        WebElement actualEmailElement = driver.findElement(By.id("email"));
        WebElement actualCurrentAddressElement = driver.findElement(By.xpath("//p[@id=\"currentAddress\"]"));
        WebElement actualPermanentAddressElement = driver.findElement(By.xpath("//p[@id=\"permanentAddress\"]"));

        String actualNameText = actualNameElement.getText();
        String actualEmailText = actualEmailElement.getText();
        String actualCurrentAddress = actualCurrentAddressElement.getText();
        String actualPermanentAddress = actualPermanentAddressElement.getText();

        Assert.assertEquals(actualNameText,"Name:" + name);
        Assert.assertEquals(actualEmailText,"Email:" + email);
        Assert.assertTrue(actualCurrentAddress.contains(current));
        Assert.assertTrue(actualPermanentAddress.contains(permanent));


    }
    static String name = faker.name().fullName();
    static String email = faker.internet().emailAddress();
    static String current = faker.address().country();
    static String permanent = faker.address().country();



}
