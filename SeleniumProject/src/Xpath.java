import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Xpath
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement email = driver.findElement(By.xpath("//label[@for='email']"));
	System.out.println(email.getText());
	driver.findElement(By.xpath("//input[@type='email']"));
	
	WebElement pass = driver.findElement(By.xpath("//label[@for='pass']"));
	System.out.println(pass.getText());
	driver.findElement(By.xpath("//input[@type='pass']"));
	
	}
}