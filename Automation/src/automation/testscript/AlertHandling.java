package automation.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
@Listeners(automation.genericLib.ListenerImplementation.class)
public class AlertHandling extends BaseClass {
	@Test
	public void typesOfWork() throws EncryptedDocumentException, IOException
	{
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.linkText("Types of Wor")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys(du.getDataFromExcelsheet("Sheet2", 0, 1));
		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click();
		System.out.println(cu.alertMsg(driver));
		cu.alertOk(driver);
	}

}
