package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btncreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btncreate.click();
		Thread.sleep(3000);
		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		txtFirstName.sendKeys("shalini");

		
		
	}

}
