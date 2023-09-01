package endtoEndFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginACTION {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse/java-2022-12/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
	
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("nikhitsarole1@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();

	System.out.println(	driver.findElement(By.cssSelector("p.error")).getText());
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nikhita");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nikkiss747@gmail.com");
	driver.findElement(By.cssSelector("input[type*='text']:nth-child(4)")).sendKeys("9934333222");
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	System.out.println( driver.findElement(By.xpath("//form/p")).getText());
	
	
	driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	driver.findElement(By.id("inputUsername")).sendKeys("nikhitsarole1@gmail.com");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
