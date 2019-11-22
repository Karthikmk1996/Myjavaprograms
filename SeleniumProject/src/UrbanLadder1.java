import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		WebElement dining = driver.findElement(By.xpath("//li[@class='topnav_item diningunit']"));
		System.out.println(dining.getText());
		
		//WebElement search = driver.findElement(By.xpath("placeholder='Search')"));
		//search.sendKeys(dining.getText());
		
		List<WebElement>menu =  driver.findElements(By.xpath("//ul[@class='topnav bodytext\']"));
		for(WebElement name : menu)
		{
			System.out.println(name.getText());
		}
	}
}

	