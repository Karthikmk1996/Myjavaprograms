import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement q = driver.findElement(By.name("q"));
	    q.sendKeys("java");
	    Thread.sleep(2000);
		WebElement btnk = driver.findElement(By.name("btnK"));//directly we cant access coz of history
		btnk.click();
		WebElement q1 = driver.findElement(By.name("q"));
		q1.clear();
		Thread.sleep(2000);

		q1.sendKeys("Selenium",Keys.ENTER);
		driver.navigate().back();
		
		
	}

}
