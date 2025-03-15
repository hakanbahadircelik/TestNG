package _06_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssert_HardAssert {

    @Test
    public void hardAssert(){

        String s1 = "hello";

        System.out.println("before assert");
        Assert.assertEquals("hello123",s1,"both are not the same"); // if there is an error, loop breaks
        System.out.println("after assert");

    }

    @Test
    public void softAssert(){

        String strHomePage ="https://www.facebook.com/strHomePage";
        String strCartPage ="https://www.facebook.com/strCartPage";
        String strEditAccount ="https://www.facebook.com/strEditAccount";

        SoftAssert _softAssert = new SoftAssert();

        _softAssert.assertEquals("https://www.facebook.com/strHomePage",strHomePage); // pass
        System.out.println("assert 1");

        _softAssert.assertEquals("https://www.facebook.com/profile",strCartPage); // fail
        System.out.println("assert 2");

        _softAssert.assertEquals("https://www.facebook.com/settings",strEditAccount); // pass
        System.out.println("assert 3");

        _softAssert.assertAll(); // breaks here
        System.out.println("After soft");

    }


}
