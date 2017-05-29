import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EditorPage;
import pages.Waiter;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by LiudaBalatskaya on 5/26/2017.
 */
public class EditorPageTest extends TestBase {

    @BeforeMethod
    public void gotoPage(){
        gotoEditorPage(driver);
    }

    @Test
    public void toEditorPage(){
        Waiter.waitShouldAppear("The Internet");
        EditorPage.toTextArrea(driver,EditorPage.frame_name);
        EditorPage.enterText(driver);
        assertTrue(EditorPage.checkText(driver).contentEquals("Hello world!"));
    }

}
