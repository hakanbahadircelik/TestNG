package _02_EnableDisable;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Dependency extends BaseDriver {

    // car work list: start, drive, park, stop

    @Test
    public void startCar(){ System.out.println("startCar");
        Assert.fail();}

    @Test(dependsOnMethods = {"startCar"})   // this test depends to work "startCar"
    public void driveCar(){ System.out.println("driveCar");}

    @Test(dependsOnMethods = {"driveCar"})
    public void parkCar(){ System.out.println("parkCar");}

    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)  //  wait your time but even if there is an error, still you have to work
    public void stopCar(){ System.out.println("stopCar");}

}
