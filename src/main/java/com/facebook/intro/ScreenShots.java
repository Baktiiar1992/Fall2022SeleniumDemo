package com.facebook.intro;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;

public class ScreenShots extends BaseTest{

    @Test
    public void screenshot() throws Exception {
        browserHelper.openURL("https://www.amazon.com/");
        takeSnapShot(driver, "C:\\Users\\Nitro 5\\Desktop\\Test\\UI_FrameWork_Practise\\src\\main\\resources\\amazon.png") ;

    }
    public  void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{
//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File DestFile=new File(fileWithPath);
//Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
