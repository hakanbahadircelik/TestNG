package _03_Annotations;

import Utility.BaseDriver;
import org.testng.annotations.*;

public class _01_Introduction extends BaseDriver {

    @BeforeSuite
    public void bSuite(){ System.out.println("bSuite");}

    @BeforeTest
    public void bTest(){ System.out.println("bTest");}

    @BeforeGroups
    public void bGroup(){ System.out.println("bGroup");}

    @BeforeClass
    public void bClass(){ System.out.println("bClass");}

    @BeforeMethod
    public void bMethod(){ System.out.println("bMethod");}


    @Test
    public void Intro01_Test01(){ System.out.println("intro 1 - test 1"); }

    @Test
    public void Intro01_Test02(){ System.out.println("intro 1 - test 2"); }


    @AfterMethod
    public void aMethod(){ System.out.println("aMethod");}

    @AfterClass
    public void aClass(){ System.out.println("aClass");}

    @AfterGroups
    public void aGroup(){ System.out.println("aGroup");}

    @AfterTest
    public void aTest(){ System.out.println("aTest");}

    @AfterSuite
    public void aSuite(){ System.out.println("aSuite");}

}
