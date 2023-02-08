package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']")).click();
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(mainid.equals(id)))
					{
				driver.switchTo().window(id);
					}
		}
	String price=	driver.findElement(By.className("CEmiEU")).getText();
	System.out.println(price);
	driver.close();
	driver.switchTo().window(mainid);
	System.out.println(driver.getTitle());
}
}



















