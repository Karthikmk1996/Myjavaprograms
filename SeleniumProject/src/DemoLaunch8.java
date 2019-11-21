import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch8
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com/");
	WebElement identifierId = driver.findElement(By.id("identifierId"));
	identifierId.sendKeys("karthik",Keys.ENTER);
	Thread.sleep(2000);
	WebElement pas = driver.findElement(By.name("password"));
	pas.sendKeys("karthik123",Keys.ENTER);
	
	}
}