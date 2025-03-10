package _03_Annotations.XML;

import org.testng.annotations.Test;

public class _04_Groups {

    @Test(groups = {"Smoke Test"})
    public void Test01(){ System.out.println("Test01"); }

    @Test(groups = {"Regression"})
    public void Test03(){ System.out.println("Test03"); }

    @Test(groups = {"Regression"})
    public void Test05(){ System.out.println("Test05"); }

    @Test(groups = {"Regression"})
    public void Test02(){ System.out.println("Test02"); }

    @Test(groups = {"Smoke Test"})
    public void Test04(){ System.out.println("Test04"); }

    @Test(groups = {"Smoke Test"})
    public void Test06(){ System.out.println("Test06"); }

    @Test
    public void Test07(){ System.out.println("Test07"); }


}
