package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HotelRegisterUserTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.findElement(By.cssSelector("span.hide_xs")).click();

        WebElement emailAddressInput = driver.findElement(By.id("email_create"));
        emailAddressInput.clear();
        emailAddressInput.sendKeys("lubie@piwo.pl");

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

        // żeby zadziałało musimy zrobić pauzę

        WebElement firstNameInput = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='customer_firstname']")));
//        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id='customer_firstname']"));
        firstNameInput.clear();
        firstNameInput.sendKeys("Piwosz");
    }
}
