package src;

public class Action {

    public static void main(String[] args) throws InterruptedException
    {
        driver() =new ChromeDriver();
        Action a=new Action(driver);
        driver.get("https://codoid.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement Service= driver.findElement(By.xpath("//a[.='Services']"));
        a.doubleclick (Service).perform();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        WebElement about=driver.findElement(By.xpath("a[.='About Us']"));
        WebElement careers= driver.findElement(By.linkText("careers"));
        Thread.sleep(2000);
        a.clickAndHold(about).moveToElement(careers).perform();
        WebElement contact= driver.findElement(By.linkText("Contact Us"));
        Thread.sleep(2000);
        a.contextClick(contact).perform();

    }
}
