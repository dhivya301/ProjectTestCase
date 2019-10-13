package com.test.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static  WebDriver driver;
	public String browser = "chrome";

	public BasePage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();

			}
			driver.manage().window().maximize();
			driver. manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");

		}
	}
	
	public String getTitle1()
	{
		return driver.getTitle();
	}
	public void Click(WebElement element)
	{
		element.click();
	}
		
	}


