package _04_Parameters;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _04_QuestionWith_Parameter extends BaseDriverParameter {

    @Test
    public void test01() {

        WebElement special = driver.findElement(By.xpath("//a[text()='Specials']"));
        special.click();

        List<WebElement> priceNew = driver.findElements(By.xpath("//span[@class='price-new']"));
        List<WebElement> priceOld = driver.findElements(By.xpath("//span[@class='price-old']"));

        Assert.assertTrue(priceNew.size() == priceOld.size(), "doesnt have discount on all of them");

        for (int i = 0; i < priceNew.size(); i++) {
            double newPrice = Double.parseDouble(priceNew.get(i).getText().replaceAll("[^0-9.,]", ""));
            double oldPrice = Double.parseDouble(priceOld.get(i).getText().replaceAll("[^0-9.,]", ""));

            System.out.println(newPrice + " " + oldPrice);
            Assert.assertTrue(newPrice < oldPrice,"new price is not smaller than old price");
        }


    }

}
