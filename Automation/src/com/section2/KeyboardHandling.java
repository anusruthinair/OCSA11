package com.section2;


import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandling {
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement searchbox=driver.findElement(By.name("q"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(searchbox,"spiderman").perform();
		act.keyUp(Keys.SHIFT).sendKeys(searchbox,"spiderman").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		}
}

















