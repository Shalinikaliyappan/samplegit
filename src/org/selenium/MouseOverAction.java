package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Pratice6dubug\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/");
		WebElement txtAction = driver.findElement(By.xpath("//a[text()='COURSES']"));
	    Actions action= new Actions(driver);// action (constructor) Pass driver
	    action.moveToElement(txtAction).perform();
	    WebElement txtClick = driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
	    txtClick.click();
	    
	    
	    
	    
	    
	    
		
	}
	

}
