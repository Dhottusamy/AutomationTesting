import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class colloid {
    public static WebDriver driver;
    public static void main(String []args) throws  InterruptedException {
        driver = new ChromeDriver();
        Actions a=new Actions(driver);
        driver.get("https://codoid.com/");
        driver.manage().window().maximize();
//        WebElement findElement1 = driver.findElement(By.xpath("//a[.='About Us']"));
//        findElement1.click();
//        Thread.sleep(1000);
      //  verifypages("//div[contains(text()='Starting as a QA')]");
     //   driver.navigate().back();
        WebElement findElement2 = driver.findElement(By.xpath("//a[.='Services']"));
        findElement2.click();
        findElement2.click();
        Thread.sleep(1000);
        verifypages("//span[text(),'Testing']");
        driver.navigate().back();
//        WebElement findElement3 = driver.findElement(By.xpath("//a[.='Development Services']"));
//        findElement3.click();
//        Thread.sleep(2000);
//        verifypages("//span[text(),'Testing']");
//        driver.navigate().back();
//       // WebElement findElement= driver.findElement(By.xpath("//"));

   }
    private static boolean verifypages(String s) {
        WebElement vp = driver.findElement(By.xpath(s));
        vp.isDisplayed();
        if(vp.isDisplayed()) {
            return true;
        } else {
 return false;
        }
    }
}
