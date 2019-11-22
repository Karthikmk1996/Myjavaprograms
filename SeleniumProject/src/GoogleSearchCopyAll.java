import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchCopyAll {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement q = driver.findElement(By.name("q"));
    q.sendKeys("java");
    Thread.sleep(3000);
    
   
      List<WebElement> Search = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
      for (WebElement web : Search) {
   
    	System.out.println(web.getText());
		
	}
	}  
}
