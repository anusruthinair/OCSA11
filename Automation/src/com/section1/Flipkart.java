package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException   {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		driver.findElement(By.name("q")).sendKeys("shoes");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
}
}





