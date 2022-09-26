import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class alertPopup {
        WebDriver driver;

        @Before
        public void AlertsJava() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        @Test
        public void JavaAlerts() throws InterruptedException {
            driver.get("https://google.com");
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            Thread.sleep(1000);

            WebElement javaAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
            WebElement javaConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
            WebElement javaPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

            WebElement Result = driver.findElement(By.id("result"));

        javaAlert.click();

        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        String resultText = Result.getText();
        Assert.assertEquals("You successfully clicked an alert", resultText);

        javaConfirm.click();

        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
        String resultText1 = Result.getText();
        Assert.assertEquals("You clicked: Cancel", resultText1);


        javaPrompt.click();

        Thread.sleep(6000);
        driver.switchTo().alert().accept();
        Thread.sleep(6000);
        String resultText2 = Result.getText();
        System.out.println("You entered:");
        Assert.assertEquals(resultText2, "You entered:");
        }

        @After
        public void JavAlerts() {

            driver.quit();
        }

    }
