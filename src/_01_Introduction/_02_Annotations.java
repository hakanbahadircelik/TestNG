package _01_Introduction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _02_Annotations {

    @BeforeClass
    public void startingProcess(){
        System.out.println("startingProcess worked");
    }

    @Test  // Annotation : it shows methods type and work properties
    public void test01(){
        System.out.println("test01 worked");
    }

    @Test  // Annotation : it shows methods type and work properties
    public void test02(){
        System.out.println("test02 worked");
    }

    @AfterClass
    public void finishingProcess(){
        System.out.println("finishingProcess worked");
    }

}
