package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shali\\eclipse-workspace\\Pratice6dubug\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
		firstname.sendKeys("sha");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		lastname.sendKeys("aishu");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("metro star city kundrathur chennai");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("shalini@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("87459291620");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
	    gender.click();
		
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		hobbies.click();
		
		WebElement hobbies2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		hobbies2.click();
		
		WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
		lang.click();
		
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		skills.click();
		
		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		country.click();
		
		WebElement selectcountry = driver.findElement(By.xpath("//span[@title='India']"));
		selectcountry.click();
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		year.click();
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		month.click();
		
		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		day.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		password.sendKeys("8807091620");
		
		WebElement confirmpass = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		confirmpass.sendKeys("8807091620");
		
		WebElement signin = driver.findElement(By.xpath("//button[@name='signup']"));
		signin.click();
		
		driver.quit();
		
	}

}
