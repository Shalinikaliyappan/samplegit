package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Pratice6dubug\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)");
		driver.manage().window().maximize();
		WebElement txtxClick = driver.findElement(By.xpath("//*[@type='text']"));
		txtxClick.sendKeys("shalini");
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		txtPass.sendKeys("85214");
		
		

		
	}

	
}
