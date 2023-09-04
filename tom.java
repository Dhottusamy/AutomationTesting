import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tom {
 private WebDriver driver;
        private final String baseURL="https://www.google.com";
 @BeforeMethod
 public void setUp(){
  driver=new ChromeDriver();
 }
 @Test
 public void testWebsiteTitle(){
  driver.get(baseURL);
  String title=driver.getTitle();
 }
 @AfterMethod
 public void tearDown(){
  driver.quit();
 }
}
