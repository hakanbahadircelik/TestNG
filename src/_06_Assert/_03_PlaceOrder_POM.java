package _06_Assert;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrder_POM {

    public _03_PlaceOrder_POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='input-group-btn']/button")
    public WebElement searchBtn;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//a[text()='shopping cart']")
    public WebElement shopingCart;

    @FindBy(xpath = "//a[text()='Checkout']")
    public WebElement checkoutBtn;

    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement continueBtn1;
    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement continueBtn2;
    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement continueBtn3;

    @FindBy(name = "agree")
    public WebElement agree;

    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement continueBtn4;

    @FindBy(xpath = "//input[@id='button-confirm']\"")
    public WebElement confirmBtn;

    @FindBy(xpath = "//div[@id='content']/h1")
    public WebElement successText;

}
