package endtoEndFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse/java-2022-12/chromedriver.exe");
			
			ChromeOptions options=new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			WebElement StaticdropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select  dropDown=new Select(StaticdropDown);
			
			dropDown.selectByIndex(1);
	}

}
