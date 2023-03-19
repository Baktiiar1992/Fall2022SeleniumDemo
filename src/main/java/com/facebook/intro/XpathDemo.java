package com.facebook.intro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class XpathDemo extends BaseTest{

    @BeforeClass
    public void start(){

        driver.get("https://demoqa.com/automation-practice-form");
    }
    @Test
    public void xpathTest(){

//        String name = driver.findElement(By.name("Name")).getText();
//        System.out.println(name);

        WebElement nameText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div/label"));

        String expectedEmailText = "Email";
        WebElement nameText1 = driver.findElement(By.xpath("//label[@id='userEmail-label']"));

        Assert.assertEquals(nameText.getText(),expectedEmailText);
        Assert.assertTrue(expectedEmailText.contains(nameText1.getText()));

    }

}
