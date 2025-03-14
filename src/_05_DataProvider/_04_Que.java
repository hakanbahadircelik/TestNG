package _05_DataProvider;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Que extends BaseDriverParameter {

    @Test(dataProvider = "getData")
    public void searchFunc(String searchWord){

        WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
        search.clear();
        search.sendKeys(searchWord);
        WebElement searchBtn = driver.findElement(By.xpath("//i[@class='fa fa-search']"));
        searchBtn.click();

        List<WebElement> captions = driver.findElements(By.xpath("//div[@class='caption']/h4"));
        for (WebElement w : captions) {
//            System.out.println("w.getText() = " + w.getText());
            Assert.assertTrue(w.getText().toLowerCase().contains(searchWord), "there is no such word like that");
        }

    }


    @DataProvider
    Object[] getData(){
        Object[] data={"mac","samsung","ipod"};
        return data;
    }

}
