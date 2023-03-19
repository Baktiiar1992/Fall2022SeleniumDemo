package com.facebook.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Glovo extends BaseTest{

    @Test
    public void testRegistration() throws InterruptedException {
        driver.get("https://glovoapp.com/kg/ru/bishkek/?utm_source=google&utm_medium=cpc&utm_campaign=google_search_brandprotection_newusers_KG_Exact_City_digitalbudget_russian&utm_campaignid=19149993970&utm_adgroupid=145890646233&utm_term=glovo%20%D0%B1%D0%B8%D1%88%D0%BA%D0%B5%D0%BA&utm_matchtype=e&utm_device=c&gclid=EAIaIQobChMI0vnA6rHR_QIVR-qyCh0FgQFKEAAYASAAEgKfoPD_BwE");

        WebElement start = driver.findElement(By.xpath("(.//button[@data-test-id='get-started-button'])[2]"));
        start.click();
        Thread.sleep(3000);

        WebElement name = driver.findElement(By.id("(.//label[@class='helio-input__placeholder'])[1]")); ////input[@id='f6bb626e-cdf0-419e-afa4-62fcf79448cd']
        name.sendKeys("Baha");
        Thread.sleep(3000);

    }
}
