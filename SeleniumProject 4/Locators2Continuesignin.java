package endtoEndFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;

public class Locators2Continuesignin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

String name="Nikhita";

 

		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse/java-2022-12/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		String password=getPassword( driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println( driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals( driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello"+" "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
		//here we have given constant pwd but if in case it changes in the future
		//to make it dynamic and make it take eveytime new pwd we have to extract that string from that statement 
		
		//"Please use temporary password 'rahulshettyacademy' to Login."
		
	//refer below method
	}


	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String GetPassword=( driver.findElement(By.xpath("//form/p")).getText());
		String[] Pwdoutput1=GetPassword.split("'");
		
	   String password=Pwdoutput1[1].split("'")[0];
	   return password;
		
	}
}


