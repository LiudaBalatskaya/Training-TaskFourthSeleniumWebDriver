package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by LiudaBalatskaya on 5/26/2017.
 */
public class AlertPage {
    private static final By BUTTON1 = By.cssSelector(".example>ul>li:nth-of-type(1)>button");
    private static final By BUTTON2 = By.cssSelector(".example>ul>li:nth-of-type(2)>button");
    private static final By BUTTON3 = By.cssSelector(".example>ul>li:nth-of-type(3)>button");

    public static void toPage(WebDriver driver) {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }

    public static void checkJSAlert(WebDriver driver){
        driver.findElement(BUTTON1).click();
        Alert alert = driver.switchTo().alert();
        String alert_text = alert.getText();
        assertTrue(alert_text.contentEquals("I am a JS Alert"));
        alert.accept();
    }

    public static void checkJSConfirm(WebDriver driver){
        driver.findElement(BUTTON2).click();
        Alert alert = driver.switchTo().alert();
        String alert_text = alert.getText();
        assertTrue(alert_text.contentEquals("I am a JS Confirm"));
        alert.accept();
    }
    public static void checkJSPrompt(WebDriver driver){
        driver.findElement(BUTTON3).click();
        Alert alert = driver.switchTo().alert();
        String alert_text = alert.getText();
        assertTrue(alert_text.contentEquals("I am a JS Prompt"));
        alert.accept();

    }
}
