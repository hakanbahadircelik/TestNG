package _01_Introduction;

import org.testng.annotations.Test;

public class _01_Explanation {

    // it works algoritmic on default

    @Test(priority = 1)
    public void driverStart(){
        System.out.println("driver started");
    }

    @Test(priority = 2)
    public void openWebsite(){
        System.out.println("Website opened");
    }

    @Test(priority = 3)
    public void loginTest(){
        System.out.println("login test passed");
    }

    @Test(priority = 4)
    public void closeDriver(){
        System.out.println("driver closed");
    }

}
