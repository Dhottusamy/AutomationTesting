import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.StringJoiner;

//import java.util.Collections;
//import java.util.Optional;

public class open {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        Actions a = new Actions(driver);
        driver.get("https://www.tnpsc.gov.in/");
        driver.manage().window().maximize();
        WebElement findElement1 = driver.findElement(By.xpath("//h3[text()='Important Links']//following::a[text()='Apply Online']"));

        System.out.println("====> "+findElement1.getCssValue("color"));
        System.out.println("====> "+findElement1.getTagName());
        System.out.println("====> "+findElement1.getLocation());
        System.out.println("====> "+findElement1.getSize().height);
        System.out.println("====> "+findElement1.getSize().width);
        System.out.println("====> "+findElement1.getCssValue("background-color"));
        findElement1.click();
        Alert applyAlert = driver.switchTo().alert();
        String AlertText = applyAlert.getText();
        System.out.println(AlertText);
        applyAlert.accept();
       Thread.sleep(3000);
        Set<String> allwindowHandles1= driver.getWindowHandles();
        String firstWindows1="";
        for(String Handles1:allwindowHandles1)
        {
            firstWindows1 = Handles1;
        }
        driver.switchTo().window(firstWindows1);
        WebElement Verifyimg=driver.findElement(By.xpath("//img[@class='img-rounded']"));
        Verifyimg.isDisplayed();
        WebElement Textma = driver.findElement(By.xpath("//div[contains(text(),'Half-Yearly Exam')]"));
        Textma.click();
        Set<String> allwindowHandles2= driver.getWindowHandles();
        String lastWindows2="";
        for(String Handles2:allwindowHandles2)
        {
            lastWindows2 = Handles2;
        }
        driver.switchTo().window(lastWindows2);
        driver.switchTo().window(firstWindows1);
        driver.switchTo().defaultContent();
    }
    }
