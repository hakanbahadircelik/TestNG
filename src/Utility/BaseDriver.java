package Utility;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static final org.apache.logging.log4j.Logger logger4j = LogManager.getLogger();

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void startingProcess() {
        Logger logger = Logger.getLogger(""); // get output logs
        logger.setLevel(Level.SEVERE); // show only errors

        driver = new ChromeDriver();  //  jenkins : start without head, work on memory
        driver.manage().window().maximize(); // makes fullScreen
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // loading page wait till 30sec, or ERROR
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // find element wait till 30sec, or ERROR
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        loginTest(); // if you dont use, close it with //
    }

    public void loginTest() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        MyFunc.Wait(1);

        WebElement advance = driver.findElement(By.xpath("//button[@id='details-button']"));
        advance.click();
        MyFunc.Wait(1);
        WebElement unsafe = driver.findElement(By.xpath("//a[@id='proceed-link']"));
        unsafe.click();
        MyFunc.Wait(1);

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("asdasd001@gmail.com");
        WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
        pw.sendKeys("asdasd001");
        WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();
        MyFunc.Wait(1);

    }

    @AfterClass
    public void finishingProcess() {
        MyFunc.Wait(3);
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        logger4j.info("test started");
        logger4j.warn("warning msg, test started");
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        logger4j.info(result.getName() + " test finished " + (result.getStatus() == 1 ? "passed" : "fail"));
        logger4j.warn("warning msg, test finished");
    }


}
