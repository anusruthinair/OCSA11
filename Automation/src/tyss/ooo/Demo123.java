package tyss.ooo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo123 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cowin.gov.in/");
		driver.findElement(By.className("abhaanchortag")).click();
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(mainid.equals(id)))
					{
				driver.switchTo().window(id);
					}
		}
	driver.findElement(By.xpath("//button[contains(text(),'About ABDM')]")).click();
	driver.findElement(By.xpath("//li[text()='NHA']")).click();
	Set<String> allsessionid=driver.getWindowHandles();
	for(String s:allsessionid)
	{
	driver.switchTo().window(s);
	String title=driver.getTitle();
	if(title.contains("NHA"))
	{
		break;
	}
	}
	WebElement about=driver.findElement(By.xpath("//div[@id='navbarNavAltMarkup']/ul[2]/li[1]/a[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(about).perform();
	driver.findElement(By.xpath("//a[text()='Tenders']")).click();
	driver.findElement(By.xpath("//a[text()='Archive']")).click();
	String title=driver.findElement(By.className("pageTitle")).getText();
	System.out.println(title);
	driver.switchTo().window(mainid);
	String caption=driver.findElement(By.xpath
			("//h3[text()='Historic & Unparalleled Achievement ! ']")).getText();
	System.out.println(caption);
	driver.quit();
	}
}



























