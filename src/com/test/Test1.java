package com.test;
import java.awt.Robot;

import java.awt.AWTException;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
public static  void main(String[] args) throws Exception
{
 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\Seleniumproj\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions m=new Actions(driver);
		WebElement  cl= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cl.click();
		
		/*WebElement mobile=driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		m.contextClick(mobile).build().perform();
		Robot k=new Robot();
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyRelease(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_ENTER);
		k.keyRelease(KeyEvent.VK_ENTER);*/
		Robot k=new Robot();
		WebElement fashion=driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		m.contextClick(fashion).build().perform();
		WebElement mens=driver.findElement(By.linkText("Men's Top wear"));
		m.contextClick(mens).build().perform();
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyRelease(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_ENTER);
		k.keyRelease(KeyEvent.VK_ENTER);
		
		
}
}