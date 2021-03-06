package browserfactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {  public static WebDriver driver;//global

    public void openBrowser(String baseUrl) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//1-Key & 2-Path
        driver = new ChromeDriver();
        //launch the URL
        driver.get(baseUrl);
        // maximise window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    //close the driver
    public void closeBrowser() {
        driver.quit();
    }
}

