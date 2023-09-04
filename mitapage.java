import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mitapage {
    public static WebDriver driver;
    public static void main(String[]args){
        driver =new ChromeDriver();
        Action a=new Action();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        WebElement findElement2= driver.findElement(By.xpath("//input[@name='search_query']"));
        findElement2.click();
        findElement2.sendKeys("good night songs");
        WebElement findElement3=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        findElement3.click();
        WebElement findElement4=driver.findElement(By.xpath("//a[@title='GOOD NIGHT Review - Tamil Talkies']"));
        findElement4.click();


    }
}
