package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTecTash {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Pratice6dubug\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnclick = driver.findElement(By.xpath("//a[@id='overview-tab']"));
		btnclick.click();
		WebElement txtpara = driver.findElement(By.xpath("(//p[contains(text(),'Greens Technologies')])[1]"));
		String text = txtpara.getText();
		System.out.println(text);
		
		
	}

}
