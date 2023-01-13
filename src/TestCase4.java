import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        //Validate Automation Exercise site footer
        if(driver.findElement(By.cssSelector("p[class='pull-left']")).isDisplayed())
            System.out.println("Footer validation PASSED");
            else System.out.println("Footer validation FAILED");

        Driver.quitDriver();
    }
}
