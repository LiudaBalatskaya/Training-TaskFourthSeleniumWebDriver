package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
//import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by LiudaBalatskaya on 5/25/2017.
 */
public class Waiter {
    private static final int DEFAULT_TIME_OUT = 10;

    private static WebDriverWait getWaiter() {
        return new WebDriverWait(TestBase.getWebDriver(), DEFAULT_TIME_OUT);
    }

    public static void waitForPageTitle(String title) {
        getWaiter().until(ExpectedConditions.titleIs(title));
    }

    public static void waitForLink(By strLink) {
        getWaiter().until(ExpectedConditions.elementToBeClickable(strLink));
    }

    public static void waitShouldAppear(String title) {
        getWaiter().until(ExpectedConditions.titleIs(title));
    }

    public static void waitShouldBeFilled(By element, String text) {
        getWaiter().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitFluentWaitPolling2(WebDriver driver, final By element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(15, SECONDS)
                .pollingEvery(2, SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement allElements;
        allElements = wait.until(new com.google.common.base.Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {
                return  driver.findElement(element);
            }
        });
    }

    public static void waitFluentWaitPolling7(WebDriver driver, final By element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(15, SECONDS)
                .pollingEvery(7, SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement allElements;
        allElements = wait.until(new com.google.common.base.Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {
                return  driver.findElement(element);
            }
        });
    }
}