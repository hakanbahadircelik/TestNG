package _01_Introduction;

import org.testng.annotations.*;

public class _03_Annotations {

    @Test
    public void test01(){
        System.out.println("test01 worked");
    }

    @Test
    public void test02(){
        System.out.println("test02 worked");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass worked");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass worked");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod worked");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod worked");
    }

}
