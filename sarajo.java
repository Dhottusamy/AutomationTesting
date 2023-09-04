import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sarajo {
    private WebDriver driver;
    private final String baseUrl = "https://www.google.com/";

    @BeforeClass
    public void setup() {
        // Set the path to the chromedriver executable.
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() {
        driver.get(baseUrl);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium TestNG Maven example");
        searchBox.submit();

        // Verify the search results page title contains the search query
        Assert.assertTrue(driver.getTitle().contains("Selenium TestNG Maven example"));
    }

    @AfterClass
    public void teardown() {
        // Close the browser after the test
        driver.quit();
    }
}
