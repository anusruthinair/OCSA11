package com.section2;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutghenticationPopup {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/iframe");
		//by using index
		//driver.switchTo().frame(0);
		
		//by using id or name
		//driver.switchTo().frame("mce_0_ifr");
		
		//by using webElement
		WebElement frame1=driver.findElement(By.className("tox-edit-area__iframe"));
		driver.switchTo().frame(frame1);
		
		String msg=driver.findElement(By.tagName("p")).getText();
		System.out.println(msg);
		
		//change to mainpage
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Format']")).click();
		
		
}
}
//Your content goes here.














