package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Pratice6dubug\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		WebElement txtclick = driver.findElement(By.id("email"));
		txtclick.sendKeys("shalini");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("shalini123");
		WebElement txtbton = driver.findElement(By.name("login"));
		txtbton.click();
		
	}

}
