package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseOver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Pratice6dubug\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement txtclick = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions actions = new Actions(driver);
		Actions action = actions.moveToElement(txtclick);
		WebElement txtc = driver.findElement(By.id("nav-link-amazonprime"));
		txtc.click();
	}

}
