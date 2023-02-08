package com.section1;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCustomer {
	public static void main(String[] args) throws InterruptedException {
		Random r=new Random();
		int num=r.nextInt(10000);
		String actualcustomername="priya";
		actualcustomername=actualcustomername+num;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("container_tasks")).click();
		
		//click on addNew
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		//click on new Customer
		driver.findElement(By.className("createNewCustomer")).click();
		
		//customername
		driver.findElement(By.className("newNameField")).sendKeys(actualcustomername);
		//description
		driver.findElement(By.cssSelector
			("[placeholder='Enter Customer Description']")).sendKeys("customer created");
		//click on createcustomer
		
		
		
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated
				(By.cssSelector(".titleEditButtonContainer>.title"),actualcustomername));
		//fetch the customername
		String expcustomername=driver.findElement
				(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(expcustomername);
		if(actualcustomername.equals(expcustomername))
		{
		System.out.println("TC is pass");
		}
		else
		{
		System.out.println("TC is fail");
		}
	}

}
