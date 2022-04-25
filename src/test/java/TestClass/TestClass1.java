package TestClass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AutomationHuspy.automationHuspy.PageClass;

public class TestClass1 {
WebDriver driver;
	PageClass pageClassObject=new PageClass();

	@BeforeTest
	public void beforeTest(){
		pageClassObject.chromeSetup();
	}
	
	@Test
	public void Test() throws InterruptedException {
		pageClassObject.clickFormAuthentication();
		pageClassObject.username();
		pageClassObject.password();
		pageClassObject.clickLoginButton();
	}
	
	
	@AfterTest
	public void afterTest() {
		this.driver.quit();
	}
	}
		

