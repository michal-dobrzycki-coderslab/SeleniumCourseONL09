package TaskCheckConfig;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class GoogleSearchTest {

    @Test
    public void googleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        Thread.sleep(1000);

        WebElement zgodaNaCookies = driver.findElement(By.id("L2AGLb"));
        zgodaNaCookies.click();

        Thread.sleep(1000);

        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();

        Thread.sleep(1000);

        driver.quit();
    }
}
