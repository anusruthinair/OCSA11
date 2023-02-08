package automation.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.elementRepository.Dropdown;
import automation.elementRepository.HomeLocators;
import automation.genericLib.BaseClass;

public class DropdownHandling extends BaseClass{
	@Test
	public void generalSettings()
	{
//		driver.findElement(By.className("popup_menu_button_settings")).click();
//		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']/..")).click();
//		WebElement topgroupingLevel=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		HomeLocators hl=new HomeLocators(driver);
		hl.getSettings().click();
		hl.getManage().click();
		Dropdown dd=new Dropdown(driver);
		cu.getSelectByvisibleText(dd.gettopgroupingLevel(),"Product Line");
		String msg=dd.getmodifiedElement().getText();
		//String msg=driver.findElement(By.id("FormModifiedTextCell")).getText();
		System.out.println(msg);
	}

}
