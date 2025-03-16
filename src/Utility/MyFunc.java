package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyFunc {

    public static void Wait(int sec){
        try {
            Thread.sleep(sec*1000l);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    // we use this confirmation several times, so I wrote here to use again for anytime
    public static void successMessageValidation(){
        WebElement msgLabel = BaseDriver.driver.findElement(By.xpath(""));
        Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));
    }

    public static int randomGenerator(int limit){
        return (int)(Math.random()*limit);
    }

}
