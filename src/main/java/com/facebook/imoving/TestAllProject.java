package com.facebook.imoving;

import com.facebook.intro.ActionDemo;
import com.facebook.intro.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestAllProject extends MainClass{

    @Test
    public void imoving(){
        driver.navigate().to("https://www.imoving.com/");
        WebElement houseTypeSelectList = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSelectList);
        select.selectByVisibleText("My Apartment");
        Helper.pause(1000);

        WebElement moveSize = driver.findElement(By.id("hp-nav-select-house"));
        Select select1 = new Select(moveSize);
        select1.selectByIndex(3);
        Helper.pause(1000);

        driver.findElement(By.xpath("(//button[@type='submit'])[11]")).click();

        WebElement livingRoom = driver.findElement(By.xpath("(//span[@class='quantity-plus'])[1]"));
        livingRoom.click();
        WebElement dinningRoom = driver.findElement(By.xpath("(//span[@class='quantity-plus'])[2]"));
        dinningRoom.click();
        WebElement kitchen = driver.findElement(By.xpath("(//span[@class='quantity-plus'])[3]"));
        kitchen.click();
        WebElement bedRoom = driver.findElement(By.xpath("(//span[@class='quantity-plus'])[4]"));
        bedRoom.click();
        Helper.pause(1000);


        driver.findElement(By.xpath("//a[@class='btn btn-blue col-xs-6']")).click();
        Helper.pause(2000);
        driver.findElement(By.xpath("//a[text()='GOT IT']")).click();
        Helper.pause(2000);

        driver.findElement(By.xpath("//a[text()='Next']")).click();
        Helper.pause(2000);
        driver.findElement(By.xpath("(//a[text()='Next'])[2]")).click();//a[text()='Ok!']
        Helper.pause(2000);

        driver.findElement(By.xpath("(//a[text()='Ok!'])[3]")).click();
        Helper.pause(2000);

        WebElement sofa = driver.findElement(By.xpath("(//div[@class='item-container col-xs-12 col-sm-4 col-md-3 col-lg-fifth'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(sofa).perform();
        Helper.pause(3000);

        WebElement sofaInv = driver.findElement(By.xpath("(//a[@class='btn btn-blue'])[1]"));
        sofaInv.click();



    }
}
