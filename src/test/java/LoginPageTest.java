import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Waiter;

/**
 * Created by LiudaBalatskaya on 5/25/2017.
 */
public class LoginPageTest extends TestBase {
    @AfterMethod
    public void quit(){
        LoginPage.quit(driver);
    }

    @BeforeMethod
    public void gotoPage(){
        gotoPage(driver);
    }

    @Test
    public void credentials() throws InterruptedException {
        try {
            LoginPage.login(driver);
            Thread.sleep(1000);    // It is explicit Waits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void credentialsExplicitWaits(){
        LoginPage.loginWaitForLink(driver);
    }

    @Test
    public void toRMSys(){
        Waiter.waitShouldAppear("RMSys - Sign In");
        LoginPage.login(driver);
    }

    @Test
    public void waitInputUserNamePassword(){
        LoginPage.waitEnterUserName(driver);
        LoginPage.waitEnterPassword(driver);
        LoginPage.submit(driver);
    }

    @Test
    public void waitLoadRMSys(){
        LoginPage.login(driver);
        Waiter.waitShouldAppear("RMSys - Home");
    }

}
