package com.cardinus.udemy;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertThat; 
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JUnitDriverLevelInterrogationRefactoredTest {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void startDriver() {
		
		driver = new FirefoxDriver();
	}

	@Test
	public void visitURLassertVisitedURLTitleAssertTitleCheckSource() {
		
		final String testPageURL = "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";
		
		
		driver.navigate().to(testPageURL);
		
		assertEquals("Basic Web Page Title", driver.getTitle());
		// assertThat(driver.getTitle(), is("Basic Web Page Title"));
		
		assertEquals(testPageURL, driver.getCurrentUrl());
		// assertThat(driver.getCurrentUrl(), is(testPageURL));
		
		assertTrue( driver.getPageSource().contains("A paragraph of text") );
		// assertThat(pageSource, containsString("A paragraph of text"));
		
		String pageSource = driver.getPageSource();
		System.out.println( "Displaying page source: " );
		System.out.println(pageSource);
	}
	
	@AfterClass
	public static void stopDriver() {
		
		driver.quit();
	}
}
