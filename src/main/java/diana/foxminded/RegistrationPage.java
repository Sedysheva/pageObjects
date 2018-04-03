package diana.foxminded;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage {

    private WebDriver driver;
    private PropertiesFile param;

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-submit")
    private WebElement submitButton;

    public RegistrationPage(WebDriver driver, PropertiesFile file) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.param = file;
    }

    public HomePage login() {
        // успешная регистрация и переход на домашнюю страницу
        userName.sendKeys(param.getValue("username"));
        password.sendKeys(param.getValue("password"));
        submitButton.click();
        return new HomePage(driver);
    }

}
