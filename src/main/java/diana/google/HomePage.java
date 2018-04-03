package diana.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public ResultPage search(String string) {
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(string);
        element.submit();
        return new ResultPage(driver);
    }
}
