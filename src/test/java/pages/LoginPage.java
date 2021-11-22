package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(name="email")
    private WebElement emailInput;

    @FindBy(name="password")
    private WebElement passwordInput;

    @FindBy(id="submit-login")
    private WebElement signInButton;

    @FindBy(xpath="//a[@class='account']")
    private WebElement loggedUsernameText;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginAs(String email, String password) {
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);

        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        signInButton.click();
    }

    public String getLoggedUsername() {
        return loggedUsernameText.getText();
    }
}
