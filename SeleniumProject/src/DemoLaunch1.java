import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch1 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	Thread.sleep(2000);
	Set<String> wins = driver.getWindowHandles();
	Thread.sleep(2000);
	wins.remove(parent);
	for(String win : wins) 
	 {
		System.out.println(win);
		Thread.sleep(2000);
		driver.switchTo().window(win).close();
	 }
    }
}
