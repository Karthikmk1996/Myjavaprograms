import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaImage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//WebElement q = driver.findElement(By.name("q"));
	    // q.sendKeys("java");
		//WebElement btnk = driver.findElement(By.name("btnK"));
		//btnk.click();
	    driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java",Keys.ENTER);
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div/a[contains(.,'Images')]")).click();
		driver.findElement(By.xpath("//img[@id=\"rT8rqQKh8jt3DM:\"]")).click();
		
	   
	}

}
