package com.section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ebay.com/");
List<WebElement> allElements=driver.findElements(By.xpath("//*"));
for(WebElement ele:allElements)
{
	
	System.out.println(ele.getText());
	
}
	}

}
