package com.facebook;

import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;

public class BrowserHelper {


    private WebDriver driver;

    public BrowserHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void openURL(String url){
        driver.navigate().to(url);
    }

    public void back(){
        driver.navigate().back();
    }

    public void forward(){
        driver.navigate().forward();
    }

    public void refresh(){
        driver.navigate().refresh();
    }

    public Set<String> getWindowHandles(){
        return driver.getWindowHandles();
    }

    public void switchToWindow(int index){
        LinkedList<String> windowsId = new LinkedList(getWindowHandles());
        if(index<0 || index>windowsId.size()){
            throw new IllegalArgumentException("Invalid index: "+ index);
        }
        driver.switchTo().window(windowsId.get(index));

    }
    public void switchToMain(){
        switchToWindow(0);
    }

}
