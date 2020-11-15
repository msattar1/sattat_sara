package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class xPath_1 {
	
	@Test
	public void xpath_example1() {
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://borkotmicrotechna.com/Assertion/");
		
		driver.findElement(By.id("text1")).sendKeys("Borkot Chowdhury");		
		driver.findElement(By.name("fname")).clear();		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Sattar Bhai");
		
		
		
	}

}
