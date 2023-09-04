import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class saga {
    protected WebDriver driver;
    private WebDriverWait wait;
    public saga(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(this.driver, Duration.ofSeconds(45));
    }

    protected void visit(String URL) {
        driver.manage().window().maximize();
        System.out.println("=======================>URL:" + URL);
        driver.get(URL);
        System.out.println("=======================>Launched URL");
    }

    protected WebElement waitForElement(WebElement element)
    {
      //  WebElement element = null;
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void enterValue(WebElement element, String strValue){
        element.click();
        element.clear();
        element.sendKeys(strValue);
    }

    public static boolean click(WebElement element) {
        boolean blResult = false;
        try {
            element.click();
            blResult = true;
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("***Exception").append(e.getLocalizedMessage())
                    .append("occurred in.")
                    .append(e.getStackTrace()[0])
                    .append("****"));
        }
        return blResult;
    }

    public boolean verifyElement(WebElement element) {
        boolean isVerify = false;
        try {
            isVerify = element.isDisplayed();
        } catch (NoSuchElementException error){
            error.getMessage();
        }
        return isVerify;
    }

}
