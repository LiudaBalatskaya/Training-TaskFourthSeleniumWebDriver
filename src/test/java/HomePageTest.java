import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

/**
 * Created by LiudaBalatskaya on 5/26/2017.
 */
public class HomePageTest extends TestBase{
    @AfterMethod
    public void quit(){
        LoginPage.quit(driver);
    }

    @BeforeMethod
    public void gotoPage(){
        gotoPage(driver);
        LoginPage.login(driver);
    }

    @Test
    public void gotoOfficeTab(){
        HomePage.gotoOfficeTable(driver);
    }

    @Test
    public void gotoOfficeTabpolling7(){
        HomePage.gotoOfficeTablepolling7(driver);
    }

}
