package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatafromProperties {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream
			 ("C:\\Users\\GANGA\\Documents\\seleniumbatch\\testdata.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String Url=pobj.getProperty("url");
	String Username=pobj.getProperty("username");
	String Password=pobj.getProperty("password");
	System.out.println(Url);
	System.out.println(Username);
	System.out.println(Password);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(Url);
	driver.findElement(By.id("username")).sendKeys(Username);
	driver.findElement(By.name("pwd")).sendKeys(Password);
	driver.findElement(By.id("loginButton")).click();
	
}
}












