package page_objects_test;

import base.SampleBrowerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class HomePageTest extends SampleBrowerDriver {
    /**
     *test cases associated with HomePage shall be available
     * no web elements (locators) in this class
     *
     *
     * **/
   HomePage obj1=null;
    @BeforeMethod
    public void initElements(){
         obj1= PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void searchTest(){
        obj1.search();

    }
}
