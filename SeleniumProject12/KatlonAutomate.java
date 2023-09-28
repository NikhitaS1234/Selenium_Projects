package SeleniumProject12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class KatlonAutomate {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse/java-2022-12/chromedriver-win64/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://katalon-demo-cura.herokuapp.com/");


        driver.findElement(By.id("btn-make-appointment")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.urlContains("profile.php#login"));

        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.cssSelector("button[id='btn-login']")).click();

        wait.until(ExpectedConditions.urlContains("#appointment"));

        WebElement element= driver.findElement(By.id("combo_facility"));
        Select select=new Select(element);
        select.selectByVisibleText("Hongkong CURA Healthcare Center");

        driver.findElement(By.cssSelector("label[for='chk_hospotal_readmission']")).click();
        driver.findElement(By.xpath("//input[@id='radio_program_medicare']")).click();

        driver.findElement(By.id("txt_visit_date")).sendKeys("04/10/2023");
        driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("Hello");
        driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();

        wait.until(ExpectedConditions.urlContains("appointment.php#summary"));

        WebElement Confirmation=driver.findElement(By.cssSelector("div[class='col-xs-12 text-center'] h2"));

        Assert.assertEquals(Confirmation.getText(),"Appointment Confirmation");



        driver.quit();


    }
}