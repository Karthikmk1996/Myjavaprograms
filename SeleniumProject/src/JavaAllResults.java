import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAllResults {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("java",Keys.ENTER);
		List<WebElement> m = driver.findElements(By.xpath("//h3/span[@class=\"S3Uucc\"]"));
		for (WebElement name : m) {
			System.out.println(name.getText());	
		}
		driver.findElement(By.xpath("//span[contains(.,\"Introduction to Java - W3Schools\")]")).click();
		
		
		
	}

}
