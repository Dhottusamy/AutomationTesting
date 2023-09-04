import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sama {
  private WebDriver driver;
  @BeforeMethod
    public void setUp() {
      System.setProperty("Web driver.chrome.driver", "path/to/chromedriver");
      driver = new ChromeDriver();
  }
  @Test
    public void testGoogleSearch() {
      driver.get("https://www.google.com");
      driver.findElement(By.name("q")).sendKeys("TestNG with Selenium");
      driver.findElement(By.name("btnk")).submit();
  }
  @AfterMethod
    public void tearDown(){
      driver.quit();
    }

    }
