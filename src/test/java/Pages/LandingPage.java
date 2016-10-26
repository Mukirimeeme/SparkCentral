package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.*;

/**
 * Created by imeeme on 10/25/16.
 */
public class LandingPage {

    WebDriver driver = new FirefoxDriver();

    public static WebElement element = null;


    public static WebElement EnterSearchData(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id=\'sb_form_q\']"));

        return element;

    }

    public static WebElement ClickSearchButton(WebDriver driver) {

        element = driver.findElement(By.id("sb_form_go"));

        return element;
    }

    public static WebElement GetFirstHeader(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id=\'b_results\']/li[1]/h2/a"));

        return element;

    }
    public static WebElement GetSecondHeader(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[2]/h2/a/strong"));

        return element;

    }

    public static WebElement GetThirdHeader(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[3]/h2/a/strong"));

        return element;

    }

    public static WebElement GetFourthHeader(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[4]/h2/a/strong"));

        return element;

    }

    public static WebElement GetFifthHeader(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[5]/h2/a/strong"));

        return element;

    }



    public static List<WebElement> GetTexts(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//*[@id='b_results']"));

        List<WebElement> rowCollection = element.findElements(By.xpath("//*[@id=\'b_results\']/li"));
        int i_RowNum = 1;
        for (WebElement rowElement : rowCollection) {
            List<WebElement> colCollection = rowElement.findElements(By.xpath("strong"));
            int i_ColNum = 1;
            for (WebElement colElement : colCollection) {
                System.out.println("Row " + i_RowNum + " Column " + i_ColNum + " Data " + colElement.getText());
                i_ColNum = i_ColNum + 1;

            }
            i_RowNum = i_RowNum + 1;
        }
        return rowCollection;


    }



}
