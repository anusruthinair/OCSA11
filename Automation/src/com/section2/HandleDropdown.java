package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///D:/ocsa11/dropdown.html");
		WebElement movies=driver.findElement(By.id("movies"));
		Select s=new Select(movies);
		s.selectByVisibleText("DAMAN");
		s.selectByVisibleText("VIKRAM");
		String firstSelectedoption=s.getFirstSelectedOption().getText();
		System.out.println(firstSelectedoption);//VIKRAM
	}

}







