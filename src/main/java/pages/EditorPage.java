package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by LiudaBalatskaya on 5/26/2017.
 */
public class EditorPage {

    public static String frame_name = "mce_0_ifr";
    private static final By ENTER_AREA = By.cssSelector("#tinymce");

    public static void toTextArrea(WebDriver driver, String frame_name) {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        driver.switchTo().frame(frame_name);

    }

    public static void enterText(WebDriver driver) {
        WebElement element = driver.findElement(ENTER_AREA);
        element.clear();
        element.sendKeys("Hello world!");
    }

    public static String checkText(WebDriver driver) {
        return driver.findElement(ENTER_AREA).getText();
    }
}
