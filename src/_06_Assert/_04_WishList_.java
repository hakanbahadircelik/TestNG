package _06_Assert;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_WishList_ extends BaseDriver {

    @Test
    @Parameters("searchText")
    public void test01(String searchTxt) {

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search']"));
        searchBox.sendKeys(searchTxt);
        WebElement searchBtn = driver.findElement(By.xpath("//span[@class='input-group-btn']/button"));
        searchBtn.click();

        List<WebElement> wishLBtnResult = driver.findElements(By.xpath("//button[@data-toggle='tooltip' and @data-original-title='Add to Wish List']"));
        List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='caption']//h4"));

        int randomChoose = MyFunc.randomGenerator(productNames.size());  // random number created
        String wishItemText = productNames.get(randomChoose).getText();  // random number product name took
        System.out.println("wishItemText = " + wishItemText); // for control

        wishLBtnResult.get(randomChoose).click(); // random clicked to the product

        WebElement wishListLink = driver.findElement(By.xpath("//a[text()='wish list']"));
        wishListLink.click();

        // going to wishlist
        List<WebElement> wishListCheck = driver.findElements(By.xpath("//td[@class='text-left']/a"));

        boolean found = false;
        for (WebElement e : wishListCheck) {

            if (e.getText().toLowerCase().equals(wishItemText.toLowerCase())) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(found,"there is no product in wish list");

    }

}
