import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Actitime
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	String title = driver.getTitle();
	System.out.println(title);
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("admin");
	Thread.sleep(2000);
	
	WebElement pwd = driver.findElement(By.name("pwd"));
	pwd.sendKeys("manager",Keys.ENTER);
	Thread.sleep(2000);
	String tittle = driver.getTitle();
	System.out.println(tittle);
	
	if(username==pwd)
		System.out.println("Login is unsuccessfull");
	else
		System.out.println("Login is successfull");
	}
}
