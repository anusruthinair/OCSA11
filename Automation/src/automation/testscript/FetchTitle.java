package automation.testscript;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;

public class FetchTitle extends BaseClass {
	@Test
	public void title()
	{
	cu.titleWait("Enter Time-Track", driver);
	System.out.println(driver.getTitle());	
	
	}
}











