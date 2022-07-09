package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Pratice6dubug\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement txtclick = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions actions= new Actions(driver);
		actions.contextClick(txtclick).perform();
		
		
		
	}

}
