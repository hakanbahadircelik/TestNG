package _05_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProv_moreSection {

    @Test(dataProvider = "userData")
    public void userTest(String username, String password) {
        // username, password
        System.out.println(username + " " + password);
    }

    @DataProvider
    public Object[][] userData() {
        Object[][] data = {
                {"baha", "12345"},
                {"steel", "6789"},
                {"cerkesov", "qwert"}
        };
        return data;
    }

}
