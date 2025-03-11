package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverParameter {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters("browserType")
    public void startingProcess(String browserType){
        Logger logger = Logger.getLogger(""); // get output logs
        logger.setLevel(Level.SEVERE); // show only errors

        if (browserType.equals("chrome"))
            driver = new ChromeDriver();  //  jenkins : start without head, work on memory

        if (browserType.equals("edge"))
            driver = new EdgeDriver();

        driver.manage().window().maximize(); // makes fullScreen
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // loading page wait till 30sec, or ERROR
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // find element wait till 30sec, or ERROR
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        loginTest(); // if you dont use, close it with //
    }

    public void loginTest(){
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
    public void finishingProcess(){
        MyFunc.Wait(3);
        driver.quit();
    }

}
