package com.cardinus.udemy;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementInterrogationTest {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void startDriver() {
		
		driver = new FirefoxDriver();
	}
	
	@Test
	public void interrogateAssertIdWebElement() {
		
		final String theTestPageURL = "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";
		
		driver.navigate().to(theTestPageURL);
		
		WebElement para1 = driver.findElement(By.id("para1"));
		
		assertEquals(para1.getText(), "A paragraph of text");		
	}
	
	@AfterClass
	public static void stopDriver() {
		
		driver.quit();
	}

}
