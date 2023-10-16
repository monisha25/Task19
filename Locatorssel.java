package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorssel {
	public static void main(String[] args) {
		try {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.guvi.in/register");
		driver.manage().window().maximize();
		//Enter the first name using ID locators
		WebElement firstname=driver.findElement(By.tagName("input"));
		firstname.sendKeys("monisha");
		// Enter the lastname using TAGNAME locators
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.sendKeys("manojkumar");
		
		WebElement email=driver.findElement(By.id("emailInput"));
		email.sendKeys("test@gamil.com");
		//Enter the Passworrd using CSS Selector Locators
		WebElement ps=driver.findElement(By.cssSelector("#passwordInput"));
		ps.sendKeys("Pass@123");
		//Enter the Mobile number using Xpath loctors
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"mobileNumberInput\"]"));
		mobile.sendKeys("9999999999");
		//Enter the mail id in CLASSNAME locators
		WebElement signin=driver.findElement(By.className("btn-wrap"));
		signin.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
