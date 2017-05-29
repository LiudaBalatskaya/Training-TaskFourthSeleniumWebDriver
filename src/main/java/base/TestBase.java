package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by LiudaBalatskaya on 5/24/2017.
 */
public class TestBase {
    protected static WebDriver driver;
    protected static final String BASE_URL = "https://192.168.100.26/";
    protected static final String FRAME_URL = "https://the-internet.herokuapp.com/iframe";
    protected static final String ALERT_URL = "https://the-internet.herokuapp.com/javascript_alerts";

    public static void gotoPage(WebDriver driver) {
        driver.get(BASE_URL);
    }
    public static void gotoEditorPage(WebDriver driver) {
       driver.get(FRAME_URL);
   }
    public static void gotoAlertPage(WebDriver driver) {
        driver.get(ALERT_URL);
    }
    public static WebDriver getWebDriver(){
        return driver;
    }


    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void exit(){
        driver.close();
    }
}
