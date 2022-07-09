package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotMethod {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shali\\eclipse-workspace\\Pratice6dubug\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		//press SHIFT
		robot.keyRelease(KeyEvent.VK_SHIFT);
		//press Tab
		robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		//REleade SHIFT
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		
		
		
		
	
	
	}

}
