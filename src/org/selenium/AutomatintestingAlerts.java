package org.selenium;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatintestingAlerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement txtc = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		txtc.click();
		WebElement txtcl = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		txtcl.click();
		Alert al = driver.switchTo().alert();
		
		
		String text = al.getText();
		System.out.println(text);
		al.accept();
		WebElement get = driver.findElement(By.xpath("//p[text()='Hello Automation Testing user How are you today']"));
		String text2 = get.getText();
		System.out.println(text2);
		
		
	
		
	}

}
