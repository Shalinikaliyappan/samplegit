package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensCard {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
	}

}
