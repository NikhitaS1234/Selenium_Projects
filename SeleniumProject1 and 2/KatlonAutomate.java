package AllureReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KatlonAutomate {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse/java-2022-12/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.cssSelector("button[id='btn-login']")).click();


        //driver.quit();


    }
}