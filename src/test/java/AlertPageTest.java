import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertPage;

/**
 * Created by LiudaBalatskaya on 5/26/2017.
 */
public class AlertPageTest extends TestBase{
    @BeforeMethod
    public void gotoPage(){
        gotoAlertPage(driver);
    }

    @Test
    public void checkJSAlert(){
        AlertPage.checkJSAlert(driver);
    }

    @Test
    public void checkJSConfirm(){
        AlertPage.checkJSConfirm(driver);
    }

    @Test
    public void checkJSPrompt(){
        AlertPage.checkJSConfirm(driver);
    }
}
