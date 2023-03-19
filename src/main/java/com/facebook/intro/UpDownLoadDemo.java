package com.facebook.intro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UpDownLoadDemo extends BaseTest{

    @Test
    public void test1(){
        driver.navigate().to("https://demoqa.com/upload-download");

        driver.findElement(By.id("uploadFile")).sendKeys("C:/Users\\Nitro 5\\Desktop\\Screenshot\\Screenshot 2023-03-08 040240.png");

    }

}
