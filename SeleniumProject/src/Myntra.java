import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(6000);
		
		WebElement search = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
		search.sendKeys("shirt",Keys.ENTER);
		
		
		driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/"
				+ "1364628/2016/8/31/11472636737718-Roadster-Men-Blue-Regular-Fit-Printed-Casual-Shirt-6121472636737160-1.jpg']")).click();
		
	}

}
