package diana.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoxMinded {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://serviceacc.foxminded.com.ua");
        By elementLocator = By.id("username");
        WebElement element = driver.findElement(elementLocator);
        element.sendKeys("admin");
        elementLocator = By.id("password");
        element = driver.findElement(elementLocator);
        element.sendKeys("admin");
        elementLocator = By.id("login-submit");
        element = driver.findElement(elementLocator);
        element.click();

        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}
