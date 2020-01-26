package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class SampleBrowerDriver {
    /**
     * all related acivities of axwebdriver
     * creating webDriver (Chrome Driver , FireFoxDriver)
     * opening browser
     * getting url
     *
     * **/


    /**
     * WebDriver driver=null;
     *     @BeforeMethod
     *     public void pageOpenTest() {
     *         System.setProperty("webdriver.chrome.driver","C:\\Users\\ahads\\IdeaProjects\\webautomation1\\src\\Driver\\chromedriver.exe");
     *         driver=new ChromeDriver();
     *         driver.get("http://automationpractice.com/index.php");
     *     }
     *
     *
     *       @AfterMethod
     *     public void finishTest(){
     *         driver.quit();
     *     }
     *
     *
     *      **/
    public static WebDriver driver = null;
      public static String   os = System.getProperty("os", "windows");
            @Parameters({"url"})
            @BeforeMethod
            public void setUp(@Optional("https://www.google.com") String url){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahads\\IdeaProjects\\webautomation2\\generic\\Driver\\chromedriver.exe" );
           driver = new ChromeDriver();


       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // 20
       // driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS); //35
        //driver.manage().window().maximize();
        driver.get(url);


    }
    @AfterMethod
    public void closeOut() {
        //driver.manage().deleteAllCookies();
        driver.quit();
    }
}
