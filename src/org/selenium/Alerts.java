package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Pratice6dubug\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shalini@12:welcome123@omrbranch.com/api/documentation");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
	    robot.keyPress(KeyEvent.VK_S);
	    robot.keyPress(KeyEvent.VK_H);
	    robot.keyPress(KeyEvent.VK_A);
	    robot.keyRelease(KeyEvent.VK_SHIFT);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyPress(KeyEvent.VK_SHIFT);
	    robot.keyPress(KeyEvent.VK_K);
	    robot.keyPress(KeyEvent.VK_O);
	    robot.keyPress(KeyEvent.VK_Y);
	    robot.keyRelease(KeyEvent.VK_SHIFT);
	    Alert al = driver.switchTo().alert();
	    al.accept();
	    
	    
		
		
	
		
		
		
	}

}
