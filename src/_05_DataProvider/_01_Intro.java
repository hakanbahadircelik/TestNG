package _05_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_Intro {


    @Test(dataProvider = "myDatas")
    public void searchTest(String searchTxt) {
        System.out.println("searchTxt = " + searchTxt);

    }

    @DataProvider
    Object[] myDatas() {
        Object[] searches = {"mac","samsung","laptip"};

        return searches;
    }


}
