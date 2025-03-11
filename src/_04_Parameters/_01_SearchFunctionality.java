package _04_Parameters;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_SearchFunctionality extends BaseDriver {

    @Test
    @Parameters("searchText")
    public void test01(String searchTx) {

        WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
        search.sendKeys(searchTx);
        WebElement searchBtn = driver.findElement(By.xpath("//i[@class='fa fa-search']"));
        searchBtn.click();

        List<WebElement> captions = driver.findElements(By.xpath("//div[@class='caption']/h4"));
        for (WebElement w : captions) {
//            System.out.println("w.getText() = " + w.getText());
            Assert.assertTrue(w.getText().toLowerCase().contains(searchTx), "there is no such word like that");
        }




    }

}
