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

    /*------------------------------------------------------------*/

    @Test(dataProvider = "datas")
    public void test02(int data){
        System.out.println("data = " + data);
    }

    @DataProvider(name="datas") // you can give a name
    Object[] getData(){
        Object[] data={1,2,3,4,5,6};
        return data;
    }

}
