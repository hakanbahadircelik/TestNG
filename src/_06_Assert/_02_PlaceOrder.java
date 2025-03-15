package _06_Assert;

import Utility.BaseDriver;
import Utility.MyFunc;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_PlaceOrder extends BaseDriver {

    @Test
    public void test01(){

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search']"));
        searchBox.sendKeys("ipod");
        WebElement searchBtn = driver.findElement(By.xpath("//span[@class='input-group-btn']/button"));
        searchBtn.click();

        WebElement addToCart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        addToCart.click();

        WebElement shopingCart = driver.findElement(By.xpath("//a[text()='shopping cart']"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='shopping cart']")));
        shopingCart.click();

        WebElement checkoutBtn = driver.findElement(By.xpath("//a[text()='Checkout']"));
        checkoutBtn.click();

        WebElement continueBtn1 = driver.findElement(By.xpath("//input[@id='button-payment-address']"));
        continueBtn1.click();
        WebElement continueBtn2 = driver.findElement(By.xpath("//input[@id='button-payment-address']"));
        continueBtn2.click();
        WebElement continueBtn3 = driver.findElement(By.xpath("//input[@id='button-payment-address']"));
        continueBtn3.click();

        WebElement agree = driver.findElement(By.name("agree"));
        agree.click();

        WebElement continueBtn4 = driver.findElement(By.xpath("//input[@id='button-payment-address']"));
        continueBtn4.click();
        WebElement confirmBtn = driver.findElement(By.xpath("//input[@id='button-confirm']"));
        confirmBtn.click();

        wait.until(ExpectedConditions.urlContains("success"));  // wait till url include "success"

        WebElement successText = driver.findElement(By.xpath("//div[@id='content']/h1"));
        Assert.assertTrue(successText.getText().equals("Your order has been placed!"));

    }


}
