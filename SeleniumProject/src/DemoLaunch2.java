import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch2
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
	ArrayList<String> lst = new ArrayList<>(wins);
	//ArrayList<String> lst = new ArrayList<>();
	//lst.addAll(wins);
	for (int i = lst.size() - 1; i>= 0;i--) 
	{
		driver.switchTo().window(lst.get(i)).close();
	}
 }
}
//6362619664