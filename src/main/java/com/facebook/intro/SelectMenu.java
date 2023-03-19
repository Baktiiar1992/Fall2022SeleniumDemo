package com.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectMenu extends BaseTest {

    @Test
    public void menuSel(){
        driver.get("https://demoqa.com/select-menu");

        WebElement options = driver.findElement(By.id("react-select-2-input"));
        options.sendKeys();
        Helper.pause(2000);
    }
}
