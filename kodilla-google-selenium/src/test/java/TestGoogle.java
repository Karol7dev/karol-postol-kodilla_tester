import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;

import static pages.GoogleSearch.loadResults;

public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\kodilla-course\\kodilla-google-selenium\\src\\main\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void homework() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.search
    }
}