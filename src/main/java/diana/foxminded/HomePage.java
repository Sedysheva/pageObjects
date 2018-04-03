package diana.foxminded;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//li[5]/a/span")
    private WebElement clientPage;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getHomeTitle() {
        return driver.getTitle();
    }

    public ClientPage clickClient() {
        clientPage.click();
        return new ClientPage(driver);
    }
}
