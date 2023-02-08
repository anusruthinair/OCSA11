package com.section2;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('username').value='admin';");
	jse.executeScript("document.getElementsByName('pwd')[0].value='manager';");
	jse.executeScript("document.getElementById('loginButton').click();");
		
		
		
}
}





