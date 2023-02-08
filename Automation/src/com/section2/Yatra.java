package com.section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {
	public static void main(String[] args) throws InterruptedException    {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allsugg=driver.findElements
				(By.xpath("//div[@class='erkvQe']/div[1]/ul/li"));
		for(WebElement sug:allsugg)
		{
			String suggname=sug.getText();
			if(suggname.contains("tutorial"))
			{
				sug.click();
				break;
			}
		}
	}
}







