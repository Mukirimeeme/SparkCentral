package Tests;

import Domain.TestData;
import Pages.LandingPage;
import Pages.ProductPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by imeeme on 10/25/16.
 */
public class SparkCentralTests {
    public LandingPage landingPage;
    public TestData testData;
    public ProductPage productPage;

    private static WebDriver driver = null;

    @Before
    public void beforeMethod() {

        //driver=new FirefoxDriver();
        //landingPage.Website();

        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("http://www.bing.com/");

    }

    @After
    public void AfterMethod(){
        //driver.quit();
    }

    @Test
    public void SearchForSparkCentral(){
        landingPage.EnterSearchData(driver).sendKeys(TestData.SearchData);
        landingPage.ClickSearchButton(driver).click();

        assertEquals("Sparkcentral - Official Site",landingPage.GetFirstHeader(driver).getText());

    }

    @Test
    public void VerifyAllLinkTexts(){

        landingPage.EnterSearchData(driver).sendKeys(TestData.SearchData);
        landingPage.ClickSearchButton(driver).click();
        assertThat(landingPage.GetSecondHeader(driver).getText(),containsString(TestData.SearchData));
        assertThat(landingPage.GetThirdHeader(driver).getText(), containsString(TestData.SearchData));
        assertThat(landingPage.GetFourthHeader(driver).getText(), containsString(TestData.SearchData));
        assertThat(landingPage.GetFifthHeader(driver).getText(), containsString(TestData.SearchData));

        }

    @Test
    public void ProductPageUrl(){
        landingPage.EnterSearchData(driver).sendKeys(TestData.SearchData);
        landingPage.ClickSearchButton(driver).click();
        landingPage.GetFirstHeader(driver).click();
        productPage.GetProduct(driver).click();
        assertEquals(productPage.VerifyURL(driver),TestData.ProductUrl);

        

    }

}