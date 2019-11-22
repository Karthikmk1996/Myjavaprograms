import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDescendant {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Electronics')]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::a[contains(.,('Mi')]")).click();
}
	
}