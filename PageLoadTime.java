package com.seleniumAdvanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// Set page load timeout to 10 Sec
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// Navigate to the webpage
		driver.get("https://the-internet.herokuapp.com/");
		// Verify presence of a specific element
		if (driver.findElement(By.xpath("//a[normalize-space()='WYSIWYG Editor']"))
				.isDisplayed()) {
			System.out.println("Page loaded successfully.");
		} else 
			System.out.println("Page is loaded incompletely.");
		
		//driver.quit();
		System.setProperty("webdriver.chrome.logfile","C:\\Users\\Nikil\\eclipse-workspace\\YoutubeProjects\\FilesToUpload\\chromedriver.log");
	}
}
