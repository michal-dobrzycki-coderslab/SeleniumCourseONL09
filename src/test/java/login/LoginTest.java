package login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private static WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication");
    }

    @Test
    public void validUserLogin() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");
        Assert.assertEquals("Automated Tester", loginPage.getLoggedUsername());
    }

    @Test
    public void invalidUserLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("niemausera@coderslab.pl", "niemahasla");
        Assert.assertEquals("Authentication failed.", loginPage.getLoginUserAlert());
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
