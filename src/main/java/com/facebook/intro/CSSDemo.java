package com.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CSSDemo extends BaseTest {
    @Test
    public void cssTest(){
        driver.get("https://www.amazon.com/");

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        WebElement apple = driver.findElement(By.xpath("//span[text()='Apple']"));
        apple.getText();

        WebElement click = driver.findElement(By.xpath("(//span[@class='a-expander-prompt'])[13]"));
        click.click();

        List<WebElement> allBrands = driver.findElements(By.xpath("//span[normalize-space()='Brands']"));
        int count =0;
        for(WebElement e : allBrands){
            count++;
            if(e.getText().contains("SAMSUNG")){
             
            }
            e.getText();
        }
    }
}
