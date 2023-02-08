package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.google.co.in/");
	WebElement gmail=driver.findElement(By.linkText("Gmail"));
	Actions act=new Actions(driver);
	//act.contextClick(gmail).perform();
	act.moveToElement(gmail).contextClick().build().perform();
}
}












