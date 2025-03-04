package _02_EnableDisable;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _01_Enable {

    @Test
    public void test01(){ System.out.println("test01 works");}

    @Test(enabled = false)
    public void test02(){ System.out.println("test02 works");}

    @Test
    public void test03(){ System.out.println("test03 works");}

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void startingProcess(){
        Logger logger = Logger.getLogger(""); // get output logs
        logger.setLevel(Level.SEVERE); // show only errors

        driver = new ChromeDriver();  //  jenkins : start without head, work on memory
        driver.manage().window().maximize(); // makes fullScreen
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // loading page wait till 30sec, or ERROR
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // find element wait till 30sec, or ERROR
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @AfterClass
    public void finishingProcess(){
        MyFunc.Wait(3);
        driver.quit();
    }

}
