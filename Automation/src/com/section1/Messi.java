package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Messi {
	 private static void main(String[] args) throws InterruptedException   {
	
		String s="Tell me a tell about a tell";
		String[] str=s.toLowerCase().split(" ");
		for(int i=0;i<=str.length-1;i++)
		{
			int count=0;
			String s1=str[i];
			for(int j=0;j<=str.length-1;j++)
			{
				String s2=str[j];
				if(s1.equals(s2) && i>j)
				{
					break;
			 	}
				if(s1.equals(s2))
				{
					count++;
				}
			}
			
			if(count>0)
			{	 	
				System.out.println(s1+" present "+count+" times ");
			}
		}
	}
}
