package _05_DataProvider;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Que extends BaseDriver {

    @Test
    public void brandsValidation() {

        WebElement brandsLink = driver.findElement(By.linkText("Brands"));
        brandsLink.click();

        List<WebElement> letters = driver.findElements(By.cssSelector("[id='content'] > h2"));
        List<WebElement> brandNames = driver.findElements(By.cssSelector("[id='content'] > div"));

        for (int i = 0; i < letters.size(); i++) {

            List<WebElement> brands = brandNames.get(i).findElements(By.tagName("div"));

            for (WebElement brand : brands) {
                System.out.println(letters.get(i).getText() + " " + brand.getText().charAt(0) + " " + brand.getText());
                Assert.assertEquals(letters.get(i).getText().charAt(0), brand.getText().charAt(0));
            }

        }


    }

}
