import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.sql.SQLOutput;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        //Validate Automation Exercise site logo
        if(driver.findElement(By.cssSelector("img[src='/static/images/home/logo.png']")).isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        Driver.quitDriver();
    }
}
