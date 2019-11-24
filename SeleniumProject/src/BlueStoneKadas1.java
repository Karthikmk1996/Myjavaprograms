import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneKadas1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");

		WebElement all = driver.findElement(By.xpath("//a[@title=\"Jewellery\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(all).build().perform();
		driver.findElement(By.xpath("//a[@title=\"Kadas\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"The Arjun Kada For Him\"]")).click();
		Set<String> wins = driver.getWindowHandles();
		for (String win : wins) {
			driver.switchTo().window(win);	
		}
		driver.findElement(By.xpath("//div[@class=\"buynow-block col-xs-7\"]")).click();
		WebElement size = driver.findElement(By.xpath("//span[@class=\"size-box-overlay\"]"));
		System.out.println(size.getText());
		size.click();
		driver.findElement(By.xpath("//li[@data-key=\"02\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"buynow-block col-xs-7\"]")).click();
		driver.findElement(By.xpath("//a[@title=\"Place Order\"]")).click();

	}
}

