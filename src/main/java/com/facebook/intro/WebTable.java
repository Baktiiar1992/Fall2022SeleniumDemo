package com.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static com.facebook.intro.HomeWork.faker;


public class WebTable extends BaseTest{

    static String firstName = faker.name().fullName();
    static String lastName = faker.name().lastName();
    static String email = faker.internet().emailAddress();
    static Integer age = faker.number().numberBetween(30,50);
    static Integer salary = faker.number().numberBetween(3000,5000);
    static  String department = faker.educator().university();


    @Test
    public void tableTest(){
        driver.navigate().to("https://demoqa.com/webtables");
        WebElement clickAdd = driver.findElement(By.id("addNewRecordButton"));
        clickAdd.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("registration-form-modal")));

        WebElement firstName1 = driver.findElement(By.id("firstName"));
        firstName1.sendKeys(firstName);
        WebElement lastName1 = driver.findElement(By.id("lastName"));
        lastName1.sendKeys(lastName);
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys(email);
        WebElement age1 = driver.findElement(By.id("age"));
        age1.sendKeys(age.toString());
        WebElement salary1 = driver.findElement(By.id("salary"));
        salary1.sendKeys(salary.toString());
        WebElement department1 = driver.findElement(By.id("department"));
        department1.sendKeys(department);
        Helper.pause(2000);
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        Helper.pause(2000);

        List<WebElement> myList = driver.findElements(By.xpath("//div[@class='rt-tbody']"));


        for(WebElement e: myList){
            if(e.getText().contains(age.toString())){
                Assert.assertTrue(e.getText().contains(age.toString()));
               e.getText();
            }
        }

    }

}
