package diana.foxminded;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ClientPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[text()[contains(.,\"Create Client\")]]")
    private WebElement button;


    public ClientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getButtonText() {
        return button.getText();
    }

}
