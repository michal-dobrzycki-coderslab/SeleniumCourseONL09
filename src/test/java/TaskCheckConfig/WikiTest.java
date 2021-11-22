package TaskCheckConfig;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class WikiTest {
    @Test
    public void pobieranieTekstu() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://pl.wikipedia.org");
        WebElement element = driver.findElement(By.id("main-page-column1"));
        String kolumnaTekstu = element.getText();
        System.out.println(kolumnaTekstu);
        assertTrue(kolumnaTekstu.startsWith("Czy wiesz…"));

    }
}
