import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class BlueStone
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	
	 driver.findElement(By.id("signup")).click();
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("userName")).sendKeys("Marvel",Keys.ENTER);
	 
	 driver.findElement(By.id("edit-create-account")).click();	
	}
}