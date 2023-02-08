package automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown {
	public Dropdown(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="firstHierarchyLevelCodeSelect")
	private WebElement topgroupingLevel;
	
	@FindBy(id="FormModifiedTextCell")
	private WebElement modifiedElement;
	
	public WebElement gettopgroupingLevel()
	{
		return topgroupingLevel;
	}
	public WebElement getmodifiedElement()
	{
		return modifiedElement;
	}
}


