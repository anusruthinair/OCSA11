package automation.testscript;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;
import automation.genericLib.DataUtility;

public class CreateCustomer  extends BaseClass{
	@Test
	public void customerCreation() throws EncryptedDocumentException, IOException, InterruptedException
	 {
		
		int num=cu.getRandomNum(10000);
		String customerName=du.getDataFromExcelsheet("Sheet1",0,1);
		customerName=customerName+num;
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();  
		driver.findElement(By.className("newNameField")).sendKeys(customerName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		cu.textwait(driver, By.cssSelector(".titleEditButtonContainer>.title"),customerName);
		String expcustomername=driver.findElement
				(By.xpath("//div[@class='titleEditButtonContainer']/div[1]")).getText();
		System.out.println(expcustomername);
	}
	
}









