package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit-login")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@class='account']")
    private WebElement loggedUsernameText;

    @FindBy(css = "li.alert-danger")
    private WebElement userLoginAlert;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginAs(String email, String password) {
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys(email);
        safeSendKeys(emailInput, email);

        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        signInButton.click();
    }

    public String getLoggedUsername() {
        return loggedUsernameText.getText();
    }

    public String getLoginUserAlert() {
        return userLoginAlert.getText();
    }
}
