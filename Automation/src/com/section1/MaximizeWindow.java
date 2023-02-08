package com.section1;


import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
	public static void main(String[] args) throws MalformedURLException   {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		URL url=new URL("https://www.google.co.in/");
		driver.navigate().to(url);
		
	}

}
