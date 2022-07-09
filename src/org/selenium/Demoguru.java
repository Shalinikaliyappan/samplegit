package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		//WebElement k = driver.findElement(By.id("credit3"));
        WebElement b = driver.findElement(By.id("credit2"));
		WebElement e = driver.findElement(By.id("BANK"));
		WebElement s = driver.findElement(By.id("fourth"));
		WebElement p = driver.findElement(By.id("amt7"));
		
		WebElement w = driver.findElement(By.id("credit1"));
		WebElement q = driver.findElement(By.id("loan"));
		WebElement m= driver.findElement(By.id("fourth"));
		WebElement u = driver.findElement(By.id("amt8"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(b, e).perform();
		actions.dragAndDrop(s, p).perform();
		actions.dragAndDrop(w, q).perform();
		
		actions.dragAndDrop(m, u).perform();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text2 = text.getText();
		System.out.println(text2);
		
		
		
		
	}
	

}
