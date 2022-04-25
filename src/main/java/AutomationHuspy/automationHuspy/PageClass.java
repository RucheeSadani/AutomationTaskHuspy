package AutomationHuspy.automationHuspy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PageClass {
	WebDriver driver;
	String path;
	
	public String username  = "//input[@id='username']";
	public String password = "//input[@id='password']";
	public String test ="//li//a";
	
	public void chromeSetup() {
	path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
	System.out.println("Path is "+path);
	System.setProperty("webdriver.chrome.driver",path);	
	driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	}
	
	public void username() throws InterruptedException{	
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	}
	
	public void password() {
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	}

	public void clickFormAuthentication() {
		List<WebElement> links = driver.findElements(By.xpath(test));//44
		for(int i=0;i<=links.size();i++) {
		if(links.get(i).getText().equals("Form Authentication")) {
			links.get(i).click();
		}
		}		
	}
	
	public void clickLoginButton() {
		driver.findElement(By.xpath("//button[class='radius']")).click();
	}
}
