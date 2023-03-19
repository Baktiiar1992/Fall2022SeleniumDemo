package com.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionDemo extends BaseTest{
@Test
    public void actionTestRadioButton() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");

    WebElement yes = driver.findElement(By.xpath(".//input[@id='yesRadio']")); //.//label[@for='yesRadio']
    Thread.sleep(3000);
    yes.click();

    Assert.assertTrue( yes.isEnabled());
    }

    @Test
    public void checkBox(){
    driver.get("https://demoqa.com/checkbox");

    WebElement command = driver.findElement(By.xpath(".//button[@title='Toggle'][1]"));
    command.click();
    driver.findElement(By.xpath(".(.//button[@title='Toggle'])[2]")).click();
    WebElement command1 = driver.findElement(By.xpath(".//input[@id='tree-node-commands']"));
    command1.click();
    Assert.assertTrue(command1.isSelected());
    }

    @Test
    public void clicksRightAndDouble(){
    driver.get("https://demoqa.com/buttons");

    WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
    Actions actions = new Actions(driver);
    actions.doubleClick(doubleClick).perform();
    Helper.pause(3000);
    Assert.assertEquals(doubleClick.getText(),"Double Click Me");

    WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
    actions.contextClick(rightClick).perform();
    Helper.pause(2000);


    }



}
