package com.facebook.intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;



public class AlertHelper {

    private WebDriver driver;


    public AlertHelper(WebDriver driver) {
        this.driver = driver;
    }
    private Alert alert;

    public void accept(){
        alert = driver.switchTo().alert();
        alert.accept();
    }
    public void dismiss(){
        alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public void sendKeysAl(String str ){
        alert = driver.switchTo().alert();

        alert.sendKeys(str);
    }

}
