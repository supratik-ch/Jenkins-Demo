package com.goldy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author sc176
 *
 */
public class Baseclass {

	public static WebDriver driver;
	
	@BeforeMethod
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
