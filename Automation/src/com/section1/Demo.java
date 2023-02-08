package com.section1;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//login
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		//tasks
		driver.findElement(By.id("container_tasks")).click();
		//checkbox
	
		
		driver.findElement(By.xpath("//table[@class='headerRowTable']//div[@class='checkbox inactive']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".delete.button")));
		//delete
		driver.findElement(By.cssSelector(".delete.button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//div[contains(text(),'You are about to delete')]")));
		//fetch msg
	String msg=driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		System.out.println(msg);
	}

}













