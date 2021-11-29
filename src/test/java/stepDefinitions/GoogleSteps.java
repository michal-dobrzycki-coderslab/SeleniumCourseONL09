package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSteps {
    private WebDriver driver;

    @Given("an open browser with google.com")
    public void openBrowserWithGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        // TODO: dodaj kliknięcie w zgodę na ciastki
        driver.findElement(By.id("L2AGLb")).click();
    }

    @When("a keyword {string} is entered in input field")
    public void enterKeyword(String keyword) {
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.click();
        element.sendKeys(keyword);
    }


    @And("close browser")
    public void closeBrowser() {
        driver.quit();
    }


    @Then("the first one should contains {string}")
    public void theFirstOneShouldContains(String expectedText) {
        System.out.println(expectedText);
    }
}
