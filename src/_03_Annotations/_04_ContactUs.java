package _03_Annotations;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _04_ContactUs extends BaseDriver {

    @Test
    public void test01(){

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement advance = driver.findElement(By.xpath("//button[@id='details-button']"));
        advance.click();
        MyFunc.Wait(1);
        WebElement unsafe = driver.findElement(By.xpath("//a[@id='proceed-link']"));
        unsafe.click();

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("asdasd001@gmail.com");
        WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
        pw.sendKeys("asdasd001");
        WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();

        WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();
        WebElement enquiry = driver.findElement(By.xpath("//textarea[@name='enquiry']"));
        enquiry.sendKeys("baha Steel");
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

//        MyFunc.successMessageValidation(driver.getCurrentUrl().contains("success"));

    }

}
