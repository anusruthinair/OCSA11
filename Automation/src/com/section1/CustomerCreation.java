package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerCreation {
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException   {
		Random r=new Random();
		int num=r.nextInt(10000);
		String actualcustomername="priya";
		actualcustomername=actualcustomername+num;
		CustomerCreation cc=new CustomerCreation();
		cc.launchBrowser();
		cc.login();
		Thread.sleep(2000);
		String expcustomername=cc.customerCreation(actualcustomername);
			//validate customername
		if(actualcustomername.equals(expcustomername))
		{
		System.out.println("TC is pass");
		}
		else
		{
		System.out.println("TC is fail");
		}
		cc.closeBrowser();
	}
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void login()
	{
		//login
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
		
		public String customerCreation(String actualcustomername) throws InterruptedException
		{
		//click on task
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		//click on addNew
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		//click on new Customer
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(2000);
		//customername
		driver.findElement(By.className("newNameField")).sendKeys(actualcustomername);
		//description
		driver.findElement(By.cssSelector
			("[placeholder='Enter Customer Description']")).sendKeys("customer created");
		//click on createcustomer
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		//fetch the customername
		String expcustomername=driver.findElement
				(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		return expcustomername;
}
		
		public void closeBrowser()
		{
			driver.close();
}
}













