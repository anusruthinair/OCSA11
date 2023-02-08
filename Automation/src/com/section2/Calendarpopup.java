package com.section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarpopup {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR,1);
		Date tommorwdate=cal.getTime();
		System.out.println(tommorwdate);
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		String modifieddate=sdf.format(tommorwdate);
		driver.findElement(By.id("datepicker")).sendKeys(modifieddate,Keys.ENTER);
}
}














