package _02_EnableDisable;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Example extends BaseDriver {

    @Test
    public void test01(){

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("bahasteel@gmail.com");

        WebElement passw = driver.findElement(By.xpath("//input[@name='password']"));
        passw.sendKeys("555667788");

        WebElement loign = driver.findElement(By.xpath("//input[@type='submit']"));
        loign.click();

        Assert.assertTrue(driver.getTitle().equals("My account"));

    }

}
