package tyss.ooo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class ScrollActions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/wheel/");
	Actions act=new Actions(driver);
	act.scrollToElement(driver.findElement
			(By.cssSelector("h2#scroll-from-an-element-with-an-offset"))).perform();
	Thread.sleep(2000);
	ScrollOrigin sc=WheelInput.ScrollOrigin.fromElement
			(driver.findElement(By.xpath("//div[@id='tabs-2-0']/div[1]/div[1]")));
	act.scrollFromOrigin(sc, 200, 0).perform();
	
}
}





 
