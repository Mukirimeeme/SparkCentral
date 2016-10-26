package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by imeeme on 10/25/16.
 */
public class ProductPage extends LandingPage {

    public static WebElement GetProduct(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\'menu-item-1562\']/a"));

        return element;
    }


    public static String VerifyURL(WebDriver driver){

        String URL = driver.getCurrentUrl();

        return URL;
    }
}
