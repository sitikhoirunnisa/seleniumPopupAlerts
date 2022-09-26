import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement {
    WebDriver driver;

    @Before
    public void AlertsJava() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void JavaAlerts() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(1000);

        // find by xpath
        WebElement btnTextBox = driver.findElement(By.xpath("//li[@class='btn btn-light active']"));
        //Name
        WebElement name = driver.findElement(By.xpath("//label[@id='userName-label']"));
        WebElement placeName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        //Email
        WebElement email = driver.findElement(By.xpath("//label[@id='userEmail-label']"));
        WebElement placeEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        //Current Address
        WebElement cAddress = driver.findElement(By.xpath("//label[@id='currentAddress-label']"));
        WebElement placeCaddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        //Permanent Address
        WebElement pAddress = driver.findElement(By.xpath("//label[@id='permanentAddress-label']"));
        WebElement placePaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));

    // find by css selector
       // WebElement btntextBox = driver.findElement(By.cssSelector(""));

    // find by id
        //Name
        WebElement Name = driver.findElement(By.id("userName-label"));
        WebElement PlaceName = driver.findElement(By.id("userName"));
        //Email
        WebElement Email = driver.findElement(By.id("userEmail-label"));
        WebElement PlaceEmail = driver.findElement(By.id("userEmail"));
        //Current Address
        WebElement CAddress = driver.findElement(By.id("currentAddress-label"));
        WebElement PlaceCaddress = driver.findElement(By.id("currentAddress"));
        //Permanent Address
        WebElement PAddress = driver.findElement(By.id("permanentAddress-label"));
        WebElement PlacePaddress = driver.findElement(By.id("permanentAddress"));



    }
}
