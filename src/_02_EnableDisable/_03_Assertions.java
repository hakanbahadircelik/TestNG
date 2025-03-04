package _02_EnableDisable;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions extends BaseDriver {

    @Test
    public void equalsExample() {
        String s1 = "hello";
        String s2 = "hello";

        // actual, expected, message
        // Assert.assertEquals(s1,s2);
        Assert.assertEquals(s1, s2, "expected and created is not the same");
    }

    @Test
    public void assertNotEquals() {
        String s1 = "hello";
        String s2 = "hellooo";

        Assert.assertNotEquals(s1, s2, "expected and created is not the same");
    }

    @Test
    public void assertTrue() {
        String s1 = "hello";
        String s2 = "hello";

        Assert.assertTrue(s1.equals(s2), "expected and created is not the same");
    }

    @Test
    public void assertNull() {
        String s1 = null;

        Assert.assertNull(s1, "its not null");
    }

    @Test
    public void Fail() {
        int A = 55;

        if (A != 55)  //  if A is difference than 55, give fail
            Assert.fail();
    }

}
