import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        //Validate Automation Exercise site SUBSCRIPTION form

        Driver.quitDriver();
    }
}
