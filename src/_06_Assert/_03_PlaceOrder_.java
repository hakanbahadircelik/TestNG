package _06_Assert;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_PlaceOrder_ extends BaseDriver {

    @Test
    public void test01(){

        _03_PlaceOrder_Elements elements = new _03_PlaceOrder_Elements();

        elements.searchBox.sendKeys("ipod");
        elements.searchBtn.click();
        elements.addToCart.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.shopingCart)).click();
        elements.checkoutBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn3)).click();
        elements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn4)).click();

        elements.confirmBtn.click();

        wait.until(ExpectedConditions.urlContains("success"));  // wait till url include "success"
        Assert.assertTrue(elements.successText.getText().equals("Your order has been placed!"));

    }


}
