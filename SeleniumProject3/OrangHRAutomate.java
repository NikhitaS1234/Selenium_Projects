package SeleniumProject3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class OrangHRAutomate {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse/java-2022-12/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Nikhita");
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("S12345");
        driver.findElement(By.cssSelector("div[class='oxd-input-group oxd-input-field-bottom-space'] div [class='oxd-input oxd-input--active']")).sendKeys("4666");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)","");
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();



     // Thread.sleep(1000);
    }
}