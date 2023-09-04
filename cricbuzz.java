import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class cricbuzz {
        public static <file> void main(String[] args) throws InterruptedException, IOException {
           // WebDriver.ChromeDriver(C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe);
            WebDriver driver=new ChromeDriver();
            driver.get("https://codoid.com/");

            driver.manage().window().maximize();

            driver.navigate().to("https://www.google.com/search?q=codoid&oq=codoid&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQRRg80gEINjE0MGowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
          //  Thread.sleep(5000);
//            driver.navigate().back();
//            driver.navigate().forward();
//            driver.close();
            WebElement element= driver.findElement(By.xpath(""));
            File screenshot=element.getScreenshotAs(OutputType.FILE);
            File trg=new File("C:\\Users\\Hanvi\\Pictures\\Saved Pictures\\codoid.png");

        }
    }
