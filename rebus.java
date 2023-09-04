import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class rebus {
    public static WebDriver driver;
    public static void main(String []args) throws InterruptedException {
        driver = new ChromeDriver();
        Actions a = new Actions(driver);
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
         //driver.manage().timeouts();
        WebElement findElement1 = driver.findElement(By.xpath("//input[@id='src']"));
        findElement1.sendKeys("koyambedu");
        WebElement findElement2 = driver.findElement(By.xpath("//input[@id='dest']"));
        findElement2.sendkeys("salem");
       // Thread.sleep(3000);
        WebElement findElement3= driver.findElement(By.xpath("//Text[@class='dateText']"));
        findElement3.click();
        WebElement findElement4 = driver.findElement(By.xpath("//div[text()='Jul']/following::span[text()='18']"));
        findElement4.click();
        WebElement findElement5 = driver.findElement(By.xpath("//button[@id='search_button']"));
        a.doubleClick(findElement5).perform();
        Thread.sleep(3000);
        WebElement bus= driver.findElement(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
        bus.click();
        WebElement findElement6= driver.findElement(By.xpath("//div[@class='button view-seats fr']"));
        findElement6.click();
        verifySeatSelectingPage();
    }
     public static boolean verifySeatSelectingPage(){
        WebElement verify= driver.findElement(By.xpath("//span[@class='seatSe;msg']"));
        verify.isDisplayed();
        if(verify.isDisplayed()) {
            return true;
        }else {
            return false;
        }
    }
}
