package com.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutor extends BaseTest{

    @Test
    public void test1(){
       browserHelper.openURL("https://www.etsy.com/");
        WebElement careers = driver.findElement(By.xpath("//span[text()='Careers']"));
        Helper.jsClick(driver,careers);
        Helper.pause(5000);
        Helper.jsScrollDown(driver,"1000");
        Helper.pause(3000);
        Helper.jsScrollDown(driver,"500");
        Helper.pause(5000);
    }
}
