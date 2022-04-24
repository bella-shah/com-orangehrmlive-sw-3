package testsuite;

import Utilities.Utility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //find the forgot password link and click on th forgot password link
        clickOnElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']"));

        // this message from requirement
        String expectedErrorMessage = "Forgot Your Password?";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
    }

    @After
    //close the driver
    public void tearDown() {
        closeBrowser();
    }
}


