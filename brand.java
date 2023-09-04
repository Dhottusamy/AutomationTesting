import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class brand {
    private static ChromeDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver =new ChromeDriver();
        Actions a=new Actions(driver);
        driver.get("https://www.timeanddate.com/");
        driver.manage().window().maximize();
        //   driver.manage().timeouts().implicitlyWait(50, TimeU
       WebElement elementdropdown = driver.findElement(By.xpath("//select[@id='month']"));
        //findElement1.click();
        Select select = new Select(elementdropdown);
      //select.selectByVisibleText("April");
       select.selectByIndex(8);
       select.getOptions();
       Thread.sleep(3000);

    }
}
