import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        //Validate Automation Exercise site header items
        List<WebElement> navBar= driver.findElements(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul>li"));
    for(WebElement webElement: navBar){
        if(webElement.isDisplayed() && webElement.isEnabled()) System.out.println(webElement.getText());
        else System.out.println("Header test FAILED");
    }
        Driver.quitDriver();
    }
}
