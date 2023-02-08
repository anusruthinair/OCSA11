package automation.genericLib;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {
	public int getRandomNum(int range)
	{
		Random r=new Random();
		int num=r.nextInt(range);
		return num;
	}
	public void titleWait(String title,WebDriver driver)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains(title));
	}

	public void alertOk(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public String alertMsg(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		return msg;
	}
	
	public void getSelectByvisibleText(WebElement dropdown,String visibleText)
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}
	
	public void textwait(WebDriver driver,By locator,String text)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated
				(locator,text));
	}
	
	
	
}













