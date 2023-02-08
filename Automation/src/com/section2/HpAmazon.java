package com.section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HpAmazon {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		WebElement laptop=driver.findElement(By.xpath("//span[contains(text(),'Laptops & Accessories')]"));
		Actions act=new Actions(driver);
		act.moveToElement(laptop).perform();
		driver.findElement(By.xpath("//a[text()='Laptops']/../../ul[2]//a[text()='HP']")).click();
		driver.findElement(By.className("a-dropdown-prompt")).click();
		driver.findElement(By.linkText("Price: Low to High")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Pay On Delivery']")));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/amazon.png");
		FileUtils.copyFile(src, trg);
}
}




















