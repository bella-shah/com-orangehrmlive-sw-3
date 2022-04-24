package testsuite;

import Utilities.Utility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        sendTextToElement(By.id("txtUsername"), "Admin");
        sendTextToElement(By.id("txtPassword"), "admin123");
        // find the login link and click on the login link
        clickOnElement(By.id("btnLogin"));
        String expectedMessage = "Welcome Paul";
        // this message from requirement
        WebElement welcome = driver.findElement(By.partialLinkText("Welcome"));
        String actualMessage = getTextFromElement(By.partialLinkText("Welcome"));
    }

    @After
    //close the driver
    public void tearDown() {
        closeBrowser();
    }
}
    

